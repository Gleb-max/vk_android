package com.sirius.test_app.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.sirius.test_app.core.ext.applyButtonClickAnimation
import com.sirius.test_app.core.ext.fullScreen
import com.sirius.test_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    private lateinit var viewModel: MainViewModel

    private lateinit var reviewListAdapter: ReviewListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        fullScreen()
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        viewModel.data.observe(this) {
            with(binding) {
                if (it.image.isNotBlank()) {
                    val options = RequestOptions()
                    Glide.with(ivGame).load(it.image).apply(options).into(ivGame)
                }

                reviewListAdapter.submitList(it.reviews)
                Log.e("gttrgt", it.reviews.size.toString())

                btnInstall.text = it.action.name
            }
        }

        setContentView(binding.root)

        // todo разобраться почему data binding не завелся для активити, час до дедлайна....
        with(binding) {
            ibBack.applyButtonClickAnimation()
            ibBack.setOnClickListener {
                onBackPressed()
            }
            ibDetails.applyButtonClickAnimation()

            reviewListAdapter = ReviewListAdapter()
            rvReviews.adapter = reviewListAdapter
        }
    }
}