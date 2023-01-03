package com.example.githubtrendingrepositories

data class GithubUsersData(
    val incomplete_results: Boolean,
    val items: List<Item>,
    val total_count: Int
)