package ru.fefu.activitytracker.data

class CatDataset {
    private val defaultCats = listOf(
        CatData(
            "Велосипед",
        ),
        CatData(
            "Бег",
        ),
        CatData(
            "Сёрфинг",
        ),
    )

    fun getCats(): List<CatData> = defaultCats

}