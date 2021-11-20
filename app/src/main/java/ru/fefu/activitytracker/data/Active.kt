package ru.fefu.activitytracker.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

enum class ActivityCat(val text: String) {
    SERF("Сёрфинг"), BIKE("Велосипед"), RUN("Бег");

    companion object {
        fun fromString(text: String?): ActivityCat? {
            for (v in values()) {
                if (v.text.equals(text, ignoreCase = true)) {
                    return v
                }
            }
            return null
        }
    }
}

@Entity
data class Active (
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "Cat") val cat: ActivityCat,
    @ColumnInfo(name = "StartTime") val start: Date,
    @ColumnInfo(name = "EndTime") val end: Date,
    @ColumnInfo(name = "Map") val map: ArrayList<Pair<Float, Float>>?,
)
