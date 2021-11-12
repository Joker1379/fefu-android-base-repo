package ru.fefu.activitytracker

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class StartedActivity: AppCompatActivity(R.layout.activity_started) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val stop = findViewById<ImageButton>(R.id.started_btn_stop)
        stop.setOnClickListener {
            onBackPressed()
        }
    }
}