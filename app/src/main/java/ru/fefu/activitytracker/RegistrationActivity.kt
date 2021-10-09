package ru.fefu.activitytracker

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_registration)

        val back = findViewById<ImageButton>(R.id.btn_back_reg)

        back.setOnClickListener {
            intent = Intent(this, IntroActivity::class.java)
            startActivity(intent)
        }
    }
}