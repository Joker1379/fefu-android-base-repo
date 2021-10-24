package ru.fefu.activitytracker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        val back = findViewById<ImageButton>(R.id.btn_log_back)
        val cont = findViewById<Button>(R.id.btn_log_continue)

        back.setOnClickListener {
            onBackPressed()
        }
        cont.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}