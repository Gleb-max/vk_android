package com.sirius.test_app.domain.entity

data class ReviewModel(
    val id: Int,
    val userImage: String,
    val userName: String,
    val date: String,
    val message: String
)