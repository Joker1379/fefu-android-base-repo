package ru.fefu.activitytracker

import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_details)

        val toolbar = findViewById<Toolbar>(R.id.details_toolbar)
        val id = intent.extras?.getInt("id")
        val active = id?.let { App.INSTANCE.db.activeDao().getById(it) }

        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        toolbar.setOnMenuItemClickListener {
            if (it.itemId == R.id.action_delete) {
                if (active != null) {
                    App.INSTANCE.db.activeDao().delete(active)
                }
                onBackPressed()
            }
            true
        }
    }
}