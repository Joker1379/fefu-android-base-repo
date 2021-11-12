package ru.fefu.activitytracker

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.fefu.activitytracker.data.Active
import ru.fefu.activitytracker.data.CatDataset
import java.sql.Date

class NewActivity: AppCompatActivity(R.layout.activity_new) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val catDataset = CatDataset()
        val catRCAdapter = CatRCAdapter(catDataset.getCats())

        val catList = findViewById<RecyclerView>(R.id.new_rv_cat)
        catList.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        catList.adapter = catRCAdapter

        val start = findViewById<Button>(R.id.new_btn_begin)
        start.setOnClickListener {
            val sharedPrefs = getSharedPreferences("SharedPrefs", Context.MODE_PRIVATE)
            val value = sharedPrefs.getString("ActCat", null)
            if (value != null) {
                App.INSTANCE.db.activeDao().insert(
                    Active(
                        0,
                        value,
                        "150 км",
                        Date(1000),
                        Date(100000),
                        null
                    )
                )
                val intent = Intent(this, StartedActivity::class.java)
                startActivity(intent)
            }
        }
    }
}