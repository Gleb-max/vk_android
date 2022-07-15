package com.sirius.test_app.domain.entity

data class DataModel(
    val image: String,
    val logo: String,
    val name: String,
    val rating: Float,
    val gradeCnt: String,
    val tags: List<String>,
    val videos: List<VideoModel>,
    val description: String,
    val reviews: List<ReviewModel>,
    val action: ActionModel
)