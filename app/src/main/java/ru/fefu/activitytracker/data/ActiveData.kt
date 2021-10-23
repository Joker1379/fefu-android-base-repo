package ru.fefu.activitytracker.data

sealed class ActiveData {
    data class ActiveCard(
        val id: Int,
        val distance: String,
        val time: String,
        val category: String,
        val date: String,
    ):ActiveData()
    data class ActiveDate(
        val id: Int,
        val date: String,
    ):ActiveData()
}