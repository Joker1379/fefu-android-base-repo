package ru.fefu.activitytracker.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Active::class], version = 1)
abstract class MyDataBase : RoomDatabase() {
    abstract fun activeDao(): ActiveDao
}

/* MIGRATION EXAMPLE

val MIGRATION_1_2 = object : Migration(1, 2) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("CREATE TABLE ExampleT (id INTEGER PRIMARY KEY AUTOINCREMENT)")
        database.execSQL("ALTER TABLE ExampleT ADD COLUMN ExampleC TEXT")
    }
}*/