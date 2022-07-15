package com.sirius.test_app.presentation

import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

@BindingAdapter("url")
fun bindImageFromUrl(appCompatImageView: AppCompatImageView, url: String?) {
    if (!url.isNullOrEmpty()) {
        // todo: add options
        val options = RequestOptions()
        Glide.with(appCompatImageView.context).load(url).apply(options).into(appCompatImageView)
    }
}