package ru.fefu.activitytracker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import ru.fefu.activitytracker.fragments.ActiveFragment
import ru.fefu.activitytracker.fragments.ProfileFragment

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().apply {
            add(R.id.main_cont_frag, ActiveFragment(), "act")
            addToBackStack("add_active")
            commit()
        }

        val navbar = findViewById<BottomNavigationView>(R.id.main_nav)

        navbar.setOnItemSelectedListener {
            val profile = supportFragmentManager.findFragmentByTag("pro")
            val activity = supportFragmentManager.findFragmentByTag("act")
            if (it.itemId == R.id.action_act) {
                if (profile != null) {
                    supportFragmentManager.beginTransaction().hide(profile).commit()
                }
                if (activity != null) {
                    supportFragmentManager.beginTransaction().show(activity).commit()
                }
            }
            else if (it.itemId == R.id.action_profile) {
                if (activity != null) {
                    supportFragmentManager.beginTransaction().hide(activity).commit()
                }
                if (profile != null) {
                    supportFragmentManager.beginTransaction().show(profile).commit()
                } else {
                    supportFragmentManager.beginTransaction().apply {
                        add(R.id.main_cont_frag, ProfileFragment(), "pro")
                        addToBackStack("add_profile")
                        commit()
                    }
                }
            }
            true
        }
    }
}