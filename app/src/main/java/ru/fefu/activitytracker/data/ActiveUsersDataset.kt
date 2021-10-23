package ru.fefu.activitytracker.data

class ActiveUsersDataset {
    private val defaultUsersActives = listOf(
        ActiveUsersData(
            0,
            "50 км",
            "1 час",
            "Сёрфинг",
            "5 часов назад",
            "@lena",
        ),
        ActiveUsersData(
            1,
            "10 км",
            "30 минут",
            "Велосипед",
            "17 часов назад",
            "@alex",
        ),
        ActiveUsersData(
            2,
            "35 км",
            "1 час 11 минут",
            "Сёрфинг",
            "21.10.2021",
            "@viktor",
        ),
        ActiveUsersData(
            3,
            "50 км",
            "45 минут",
            "Сёрфинг",
            "20.10.2021",
            "@jane",
        ),
        ActiveUsersData(
            4,
            "153 км",
            "3 часа",
            "Велосипед",
            "18.10.2021",
            "@john",
        ),
    )

    private var lastId = defaultUsersActives.maxOf { it.id }

    fun getActives(): List<ActiveUsersData> = defaultUsersActives

}