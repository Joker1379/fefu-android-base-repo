package ru.fefu.activitytracker.data

class ActiveUsersDataset {
    private val defaultActives = listOf(
        ActiveUsersData.ActiveDate(
            0,
            "Сегодня"
        ),
        ActiveUsersData.ActiveCard(
            1,
            "25 км",
            "30 минут",
            "Сёрфинг",
            "7 часов назад",
            "@lena"
        ),
        ActiveUsersData.ActiveCard(
            2,
            "13 км",
            "21 минута",
            "Велосипед",
            "15 часов назад",
            "@alex"
        ),
        ActiveUsersData.ActiveCard(
            3,
            "35 км",
            "1 час 11 минут",
            "Сёрфинг",
            "18 часов назад",
            "@jane"
        ),
        ActiveUsersData.ActiveDate(
            4,
            "25 октября 2021"
        ),
        ActiveUsersData.ActiveCard(
            5,
            "50 км",
            "45 минут",
            "Сёрфинг",
            "25.10.2021",
            "@john"
        ),
        ActiveUsersData.ActiveCard(
            6,
            "153 км",
            "3 часа",
            "Велосипед",
            "25.10.2021",
            "@viktor"
        ),
    )

    fun getActives(): List<ActiveUsersData> = defaultActives

}