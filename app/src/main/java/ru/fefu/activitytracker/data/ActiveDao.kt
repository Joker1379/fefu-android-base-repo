package ru.fefu.activitytracker.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ActiveDao {

    @Query("SELECT * FROM Active")
    fun getAll(): LiveData<List<Active>>

    @Query("SELECT * FROM Active WHERE id=:id")
    fun getById(id: Int): Active

    @Insert
    fun insert(active: Active)

    @Insert
    fun insertAll(vararg active: Active)

    @Delete
    fun delete(active: Active)

}