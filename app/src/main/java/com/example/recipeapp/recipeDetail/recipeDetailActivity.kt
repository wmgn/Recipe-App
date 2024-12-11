package com.example.recipeapp.recipeDetail

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Build
import android.os.Bundle
import android.view.WindowMetrics
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.recipeapp.R
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
import java.io.IOException
import java.net.URL
import java.io.File

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

        // Initialize Mobile Ads SDK
        MobileAds.initialize(this) { }
        // [START create_ad_view]
        // Create a new ad view.
        val adView = AdView(this)
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

        /* // Old Method that is simpler and works for fixed-size, but is not adaptive
        // Find the AdView from XML layout
        adView = findViewById(R.id.ad_view)
        //adView.setAdSize(adSize)
        // Load the Ad
        val adRequest = AdRequest.Builder()
            .addKeyword("cooking")
            .addKeyword("recipe")
            .build()
        adView.loadAd(adRequest)
        */



        var currentRecipeId: String? = null

        /* Connect variables to UI elements. */
        val recipeTitle: TextView = findViewById(R.id.recipe_detail_title)
        val recipeImageView: ImageView = findViewById(R.id.recipe_detail_image)
        val recipeIngredients: TextView = findViewById(R.id.recipe_detail_ingredients)
        val recipeInstructions: TextView = findViewById(R.id.recipe_detail_instructions)
        val recipeRating: TextView = findViewById(R.id.recipe_detail_rating)
        val recipeRatingBar: RatingBar = findViewById(R.id.recipe_rating_bar)
        val removeRecipeButton: Button = findViewById(R.id.remove_button)
        val publishRecipeButton: Button = findViewById(R.id.publish_button)


        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            currentRecipeId = bundle.getString(RECIPE_ID)
        }

        /* If currentRecipeId is not null, get corresponding recipe and set name, image and
        description */
        currentRecipeId?.let {
            val currentRecipe = recipeDetailViewModel.fetchRecipeById(it)

            recipeDetailViewModel.recipe.observe(this) { currentRecipe ->
                if (currentRecipe != null) {
                    if (currentRecipe.imageUrl != null) {
                        val imageUrl = currentRecipe.imageUrl
                        if (imageUrl.startsWith("http")) {
                            // Handle remote image URL
                            CoroutineScope(Dispatchers.Main).launch {
                                val bm = com.example.recipeapp.recipeList.getImageBitmap(imageUrl)
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

                    recipeTitle.text = currentRecipe.title
                    recipeIngredients.text = currentRecipe.ingredients
                    recipeInstructions.text = currentRecipe.instructions
                    recipeRating.text = getString(R.string.rating_string, currentRecipe.rating.toString())
                    recipeRatingBar.rating = currentRecipe.rating

                    // remove button
                    removeRecipeButton.setOnClickListener {
                        recipeDetailViewModel.removeRecipe(currentRecipe)
                        finish()
                    }
                    // remove button
                    publishRecipeButton.setOnClickListener {
                        //TODO write this code to
                        //recipeDetailViewModel.publishRecipe(currentRecipe)
                    }
                }
            }

        }

    }

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