package ru.fefu.activitytracker

import android.app.Application
import androidx.room.Room
import ru.fefu.activitytracker.data.MyDataBase

class App : Application() {

    companion object {
        lateinit var INSTANCE: App
    }

    val db: MyDataBase by lazy {
        Room.databaseBuilder(
            this,
            MyDataBase::class.java,
            "my_database"
        // ).allowMainThreadQueries().addMigrations(MIGRATION_1_2).build()
        ).allowMainThreadQueries().build()
    }

    override fun onCreate() {
        super.onCreate()

        INSTANCE = this
    }

}