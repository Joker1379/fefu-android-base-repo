package ru.fefu.activitytracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.fefu.activitytracker.data.ActiveUsersData

class ActiveUsersRCAdapter(private val userAct: List<ActiveUsersData>) :
    RecyclerView.Adapter<ActiveUsersRCAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val distance = view.findViewById<TextView>(R.id.label_km)
        val time = view.findViewById<TextView>(R.id.label_time)
        val category = view.findViewById<TextView>(R.id.label_category)
        val date = view.findViewById<TextView>(R.id.label_when)
        val user = view.findViewById<TextView>(R.id.label_user)

        init {
            // Define click listener for the ViewHolder's View.
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.rv_active, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.distance.text = userAct[position].distance
        viewHolder.time.text = userAct[position].time
        viewHolder.category.text = userAct[position].category
        viewHolder.date.text = userAct[position].date
        viewHolder.user.text = userAct[position].user
    }

    override fun getItemCount() = userAct.size

}