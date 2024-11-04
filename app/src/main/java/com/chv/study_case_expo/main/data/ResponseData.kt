package com.chv.study_case_expo.main.data

import com.squareup.moshi.Json

/**
 * Response from api
 */
data class ResponseData (
    @Json(name="status")
    val status: String,
    @Json(name="message")
    val message: String,
    @Json(name="data")
    val data: List<Character>?
)