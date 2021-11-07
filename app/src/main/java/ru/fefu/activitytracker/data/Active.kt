package ru.fefu.activitytracker.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity
data class Active (
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "Cat") val cat: String,
    @ColumnInfo(name = "Dist") val dist: String,
    @ColumnInfo(name = "StartTime") val start: Date,
    @ColumnInfo(name = "EndTime") val end: Date,
    @ColumnInfo(name = "Map") val map: ArrayList<Pair<Float, Float>>?,
)
