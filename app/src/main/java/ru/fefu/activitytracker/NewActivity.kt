package ru.fefu.activitytracker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.fefu.activitytracker.data.CatDataset

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
            val intent = Intent(this, StartedActivity::class.java)
            startActivity(intent)
        }
    }
}