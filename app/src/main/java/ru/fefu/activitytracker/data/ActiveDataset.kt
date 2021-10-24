package ru.fefu.activitytracker.data

class ActiveDataset {
    private val defaultActives = listOf(
        ActiveData.ActiveDate(
            0,
            "Сегодня"
        ),
        ActiveData.ActiveCard(
            1,
            "50 км",
            "1 час",
            "Сёрфинг",
            "5 часов назад"
        ),
        ActiveData.ActiveCard(
            2,
            "10 км",
            "30 минут",
            "Велосипед",
            "17 часов назад"
        ),
        ActiveData.ActiveDate(
            3,
            "21 октября 2021"
        ),
        ActiveData.ActiveCard(
            4,
            "35 км",
            "1 час 11 минут",
            "Сёрфинг",
            "21.10.2021"
        ),
        ActiveData.ActiveCard(
            5,
            "50 км",
            "45 минут",
            "Сёрфинг",
            "20.10.2021"
        ),
        ActiveData.ActiveCard(
            6,
            "153 км",
            "3 часа",
            "Велосипед",
            "18.10.2021"
        ),
    )

    fun getActives(): List<ActiveData> = defaultActives

}