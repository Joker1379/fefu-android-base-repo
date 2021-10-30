package ru.fefu.activitytracker.fragments

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import ru.fefu.activitytracker.R

class RedPassFragment: Fragment(R.layout.fragment_redpass) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toolbar = view.findViewById<Toolbar>(R.id.redpass_toolbar)

        toolbar.setNavigationOnClickListener {
            val profile = parentFragmentManager.findFragmentByTag("pro")
            val redPass = parentFragmentManager.findFragmentByTag("red_password")
            if (redPass != null) {
                parentFragmentManager.beginTransaction().remove(redPass).commit()
            }
            if (profile != null) {
                parentFragmentManager.beginTransaction().show(profile).commit()
            }
        }
    }
}