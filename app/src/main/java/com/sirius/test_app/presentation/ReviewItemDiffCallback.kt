package com.sirius.test_app.presentation

import androidx.recyclerview.widget.DiffUtil
import com.sirius.test_app.domain.entity.ReviewModel

class ReviewItemDiffCallback : DiffUtil.ItemCallback<ReviewModel>() {
    override fun areItemsTheSame(oldItem: ReviewModel, newItem: ReviewModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ReviewModel, newItem: ReviewModel): Boolean {
        return oldItem == newItem
    }
}