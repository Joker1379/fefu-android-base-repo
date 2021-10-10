package ru.fefu.activitytracker

import android.content.Intent
import android.os.Bundle
import android.text.SpannableString
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.text.Spanned
import android.text.style.ClickableSpan
import android.view.View


class RegistrationActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_registration)

        val back = findViewById<ImageButton>(R.id.btn_reg_back)
        val agreement = findViewById<TextView>(R.id.label_agreement)
        val s = SpannableString(getString(R.string.agreement))

        back.setOnClickListener {
            intent = Intent(this, IntroActivity::class.java)
            startActivity(intent)
        }

        val span1: ClickableSpan = object : ClickableSpan() {
            override fun onClick(widget: View) {
                TODO("Not yet implemented")
            }
        }
        val span2: ClickableSpan = object : ClickableSpan() {
            override fun onClick(widget: View) {
                TODO("Not yet implemented")
            }
        }
        s.setSpan(span1, 37, 65, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        s.setSpan(span2, 118, 145, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        agreement.text = s
    }
}