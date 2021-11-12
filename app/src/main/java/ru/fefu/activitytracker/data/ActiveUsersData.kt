package ru.fefu.activitytracker.data

sealed class ActiveUsersData {
    data class ActiveCard(
        val id: Int,
        val distance: String,
        val time: String,
        val category: String,
        val date: String,
        val user: String,
    ):ActiveUsersData()
    data class ActiveDate(
        val id: Int,
        val date: String,
    ):ActiveUsersData()
}