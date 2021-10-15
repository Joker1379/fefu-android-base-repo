package ru.fefu.activitytracker.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import ru.fefu.activitytracker.R

class ActiveFragment : Fragment() {
    private lateinit var activeAdapter: ActiveAdapter
    private lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_active, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        activeAdapter = ActiveAdapter(this)
        viewPager = view.findViewById(R.id.active_swiper)
        viewPager.adapter = activeAdapter

        val tabLayout = view.findViewById<TabLayout>(R.id.active_tab_layout)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "Мои"
                1 -> tab.text = "Пользователей"
            }
        }.attach()
    }
}
