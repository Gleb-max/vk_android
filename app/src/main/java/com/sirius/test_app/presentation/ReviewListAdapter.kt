package com.sirius.test_app.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.ListAdapter
import com.sirius.test_app.R
import com.sirius.test_app.databinding.LayoutReviewItemBinding
import com.sirius.test_app.domain.entity.ReviewModel

class ReviewListAdapter : ListAdapter<ReviewModel, ReviewItemViewHolder>(ReviewItemDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewItemViewHolder {
        val binding = DataBindingUtil.inflate<LayoutReviewItemBinding>(
            LayoutInflater.from(parent.context),
            R.layout.layout_review_item,
            parent,
            false,
        )
        return ReviewItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ReviewItemViewHolder, position: Int) {
        val binding = holder.binding
        binding.item = getItem(position)
    }
}