package ru.fefu.activitytracker

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_details)

        val back = findViewById<ImageButton>(R.id.details_btn_back)

        back.setOnClickListener {
            onBackPressed()
        }
    }
}