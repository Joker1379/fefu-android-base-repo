package ru.fefu.activitytracker.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.fefu.activitytracker.ActiveRCAdapter
import ru.fefu.activitytracker.ActiveUsersRCAdapter
import ru.fefu.activitytracker.R
import ru.fefu.activitytracker.data.ActiveDataset
import ru.fefu.activitytracker.data.ActiveUsersDataset

const val ARG_OBJECT = "object"

class ActiveAdaptFragment : Fragment() {
    private val activesDataset = ActiveDataset()
    private val activesUsersDataset = ActiveUsersDataset()
    private val activeRCAdapter = ActiveRCAdapter(activesDataset.getActives())
    private val activeUsersRCAdapter = ActiveUsersRCAdapter(activesUsersDataset.getActives())

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_active_adapt, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {
            val recyclerView = view.findViewById<RecyclerView>(R.id.active_list)
            recyclerView.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            if (getInt(ARG_OBJECT) == 1) {
                recyclerView.adapter = activeRCAdapter
            } else {
                recyclerView.adapter = activeUsersRCAdapter
            }
        }
    }
}