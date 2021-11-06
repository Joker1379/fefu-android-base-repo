package ru.fefu.activitytracker.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Active (
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "Cat") val cat: String,
    @ColumnInfo(name = "Start") val start: String,
    @ColumnInfo(name = "End") val end: String,
    @ColumnInfo(name = "Map") val map: String,
)

