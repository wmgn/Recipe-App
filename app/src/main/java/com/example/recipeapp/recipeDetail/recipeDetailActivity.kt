package com.example.recipeapp.recipeDetail

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowMetrics
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.recipeapp.R
import com.example.recipeapp.data.Recipe
import com.example.recipeapp.recipeList.RECIPE_ID
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.BufferedInputStream
import java.io.File
import java.io.IOException
import java.net.URL


class RecipeDetailActivity : AppCompatActivity() {

    private val recipeDetailViewModel by viewModels<RecipeDetailViewModel> {
        RecipeDetailViewModelFactory(this)
    }

    private lateinit var adView : AdView // = AdView( this )
    // [START get_ad_size]
    // Get the ad size with screen width.
    private val adSize: AdSize
        get() {
            val displayMetrics = resources.displayMetrics
            val adWidthPixels =
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                    val windowMetrics: WindowMetrics = this.windowManager.currentWindowMetrics
                    windowMetrics.bounds.width()
                } else {
                    displayMetrics.widthPixels
                }
            val density = displayMetrics.density
            val adWidth = (adWidthPixels / density).toInt()
            return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this, adWidth)
        }

    // [END get_ad_size]
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recipe_detail_activity)

        // [START mobile ads]
        MobileAds.initialize(this) { }

        val adView = AdView(this) // Create a new ad view.
        adView.adUnitId = "ca-app-pub-3940256099942544/9214589741" // adaptive banner ads
        adView.setAdSize(adSize)
        this.adView = adView

        // Replace ad container with new ad view.
        val adContainer: AdView = findViewById(R.id.ad_view)
        adContainer.removeAllViews()
        adContainer.addView(adView)

        // Start loading the ad in the background.
        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)
        // [END mobile ads]


        var currentRecipeId: String? = null

        /* Connect variables to UI elements. */
        val removeRecipeButton: Button = findViewById(R.id.remove_button)
        val publishRecipeButton: Button = findViewById(R.id.publish_button)
        val saveRecipeButton: Button = findViewById(R.id.save_button)

        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            currentRecipeId = bundle.getString(RECIPE_ID)
        }

        Log.w("RecipeDetailViewModel", "currentRecipeId: " + currentRecipeId.toString())

        /* If currentRecipeId is not null, get corresponding recipe and set name, image and
        description */
        currentRecipeId?.let {
            val recipe = recipeDetailViewModel.fetchRecipeById(it)

            recipeDetailViewModel.recipe.observe(this) { currentRecipe ->
                if (currentRecipe != null) {
                    displayRecipeDetails(currentRecipe) // Set recipe details

                    // remove button
                    removeRecipeButton.setOnClickListener {
                        recipeDetailViewModel.removeRecipe(currentRecipe)
                        finish()
                    }
                    // publish button
                    publishRecipeButton.setOnClickListener {
                        //TODO write this code to
                        recipeDetailViewModel.publishRecipe(this)
                    }
                    // save button
                    saveRecipeButton.setOnClickListener {
                        //TODO write this code to
                        recipeDetailViewModel.saveRecipeToLocal(this)
                    }
                }
            }

            recipeDetailViewModel.storedOnLocal.observe(this) { isStoredOnLocal ->
                when (isStoredOnLocal) {
                    true -> {
                        // Recipe is stored locally: Show "Remove" and "Publish" buttons
                        removeRecipeButton.visibility = View.VISIBLE
                        publishRecipeButton.visibility = View.VISIBLE
                        saveRecipeButton.visibility = View.GONE
                    }
                    false -> {
                        // Recipe is from Firebase: Show "Download and Save" button
                        removeRecipeButton.visibility = View.GONE
                        publishRecipeButton.visibility = View.GONE
                        saveRecipeButton.visibility = View.VISIBLE
                    }
                    null -> {
                        // Data hasn't been fetched yet; show a loading indicator if needed
                        removeRecipeButton.visibility = View.GONE
                        publishRecipeButton.visibility = View.GONE
                        saveRecipeButton.visibility = View.GONE
                    }
                }
            }


        }

    }

    private fun displayRecipeDetails(recipe: Recipe) {
        findViewById<TextView>(R.id.recipe_detail_title).text = recipe.title
        findViewById<TextView>(R.id.recipe_detail_ingredients).text = recipe.ingredients
        findViewById<TextView>(R.id.recipe_detail_instructions).text = recipe.instructions
        findViewById<TextView>(R.id.recipe_detail_rating).text =
            getString(R.string.rating_string, recipe.rating.toString())
        findViewById<RatingBar>(R.id.recipe_rating_bar).rating = recipe.rating

        val recipeImageView: ImageView = findViewById(R.id.recipe_detail_image)
        if (recipe.imageUrl != null) {
            val imageUrl = recipe.imageUrl
            if (imageUrl.startsWith("http")) {
                // Handle remote image URL
                CoroutineScope(Dispatchers.Main).launch {
                    val bm = getImageBitmap(imageUrl)
                    if (bm != null) {
                        recipeImageView.setImageBitmap(bm)
                    } else {
                        recipeImageView.setImageResource(R.drawable.image_missing_svgrepo_com)
                    }
                }
            } else if (File(imageUrl).exists()) {
                val bitmap = BitmapFactory.decodeFile(imageUrl)
                recipeImageView.setImageBitmap(bitmap)
            } else {
                recipeImageView.setImageResource(R.drawable.image_missing_svgrepo_com)
            }
        } else {
            recipeImageView.setImageResource(R.drawable.image_missing_svgrepo_com)
        }
    }

    /*private fun setupButtons(isStoredLocally: Boolean) {
        val removeButton = findViewById<Button>(R.id.remove_button)
        val publishButton = findViewById<Button>(R.id.publish_button)
        val downloadButton = findViewById<Button>(R.id.save_button)

        if (isStoredLocally) {
            // Show only Remove and Publish options
            removeButton.visibility = View.VISIBLE
            publishButton.visibility = View.VISIBLE
            downloadButton.visibility = View.GONE

            removeButton.setOnClickListener {
                recipeDetailViewModel.removeRecipe(currentRecipe)
                finish()
            }
            publishButton.setOnClickListener {
                publishRecipe()
            }
        } else {
            // Show only Download option
            removeButton.visibility = View.GONE
            publishButton.visibility = View.GONE
            downloadButton.visibility = View.VISIBLE

            downloadButton.setOnClickListener {
                saveRecipeToLocal()
            }
        }
    }*/

    // V5
    override fun onPause() {
        adView.pause()
        super.onPause()
    }

    override fun onDestroy() {
        adView.destroy()
        super.onDestroy()
    }

    override fun onResume() {
        super.onResume()
        adView.resume()
    }
}

// Function to fetch a bitmap from a URL
suspend fun getImageBitmap(url: String): Bitmap? {
    return withContext(Dispatchers.IO) {
        try {
            val aURL = URL(url)
            val conn = aURL.openConnection()
            conn.connect()
            val iS = conn.getInputStream()
            val biS = BufferedInputStream(iS)
            val bm = BitmapFactory.decodeStream(biS)
            biS.close()
            iS.close()
            bm
        } catch (e: IOException) {
            e.printStackTrace()
            null
        }
    }
}