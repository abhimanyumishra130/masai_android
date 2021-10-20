package com.example.moviedatabase.remote

data class ResponseModel(
    val page: Int,
    val results: List<Result>,
    val total_pages: Int,
    val total_results: Int
)