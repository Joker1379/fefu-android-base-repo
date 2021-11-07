package ru.fefu.activitytracker.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import java.sql.Date

@Database(entities = [Active::class], version = 1)
@TypeConverters(Converters::class)
abstract class MyDataBase : RoomDatabase() {
    abstract fun activeDao(): ActiveDao
}

object Converters {
    @TypeConverter
    fun fromString(value: String?): ArrayList<Pair<Float, Float>> {
        val list = value?.split(';')
        var res: ArrayList<Pair<Float, Float>> = ArrayList()
        if (list != null) {
            for (i in list) {
                if (i != "") {
                    val item = i.split(',')
                    res.add(Pair<Float, Float>(item[0].toFloat(), item[1].toFloat()))
                }
            }
        }
        return res
    }

    @TypeConverter
    fun fromArrayList(list: ArrayList<Pair<Float, Float>>?): String {
        var s = ""
        if( list != null) {
            for (i in list) {
                s = s+i.first.toString()+","+i.second.toString()+";"
            }
        }
        return s
    }

    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun fromDate(date: Date?): Long? {
        return date?.time?.toLong()
    }
}

/* MIGRATION EXAMPLE

val MIGRATION_1_2 = object : Migration(1, 2) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("CREATE TABLE ExampleT (id INTEGER PRIMARY KEY AUTOINCREMENT)")
        database.execSQL("ALTER TABLE ExampleT ADD COLUMN ExampleC TEXT")
    }
}*/