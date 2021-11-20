package ru.fefu.activitytracker.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import ru.fefu.activitytracker.R

class ProfileFragment: Fragment(R.layout.fragment_profile) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val redPass = view.findViewById<Button>(R.id.profile_btn_cp)

        redPass.setOnClickListener {
            if (savedInstanceState == null) {
                val profile = parentFragmentManager.findFragmentByTag("pro")
                if (profile != null) {
                    parentFragmentManager.beginTransaction().hide(profile).commit()
                }
                parentFragmentManager.beginTransaction().apply {
                    add(R.id.main_cont_frag, RedPassFragment(), "red_password")
                    commit()
                }
            }
        }
    }
}