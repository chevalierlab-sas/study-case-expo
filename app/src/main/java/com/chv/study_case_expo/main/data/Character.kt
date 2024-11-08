package com.chv.study_case_expo.main.data

import com.squareup.moshi.Json

/**
 * class for Character
 */
data class Character(
    @Json(name="id")
    val id: Int,
    @Json(name="name")
    val name: String,
    @Json(name="description")
    val description: String,
    @Json(name="image_url")
    val imageUrl: String,
    @Json(name="user_id")
    val userId: String
)