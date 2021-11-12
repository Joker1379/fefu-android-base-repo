package ru.fefu.activitytracker

import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_details)

        val toolbar = findViewById<Toolbar>(R.id.details_toolbar)

        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}