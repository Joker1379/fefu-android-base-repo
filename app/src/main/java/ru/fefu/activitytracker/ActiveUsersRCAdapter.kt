package ru.fefu.activitytracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.fefu.activitytracker.data.ActiveUsersData

class ActiveUsersRCAdapter(private val actives: List<ActiveUsersData>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val distance: TextView = view.findViewById(R.id.label_km)
        val time: TextView = view.findViewById(R.id.label_time)
        val category: TextView = view.findViewById(R.id.label_category)
        val date: TextView = view.findViewById(R.id.label_when)
        val user: TextView = view.findViewById(R.id.label_user)
        /*init {
            // Define click listener for the ViewHolder's View.
        }*/
    }
    class ViewHolder2(view: View) : RecyclerView.ViewHolder(view) {
        val date: TextView = view.findViewById(R.id.active_date)
    }

    override fun getItemViewType(position: Int): Int =
        if (actives[position] is ActiveUsersData.ActiveDate) 0
        else 1

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == 0){
            val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.rv_date, viewGroup, false)
            return ViewHolder2(view)
        } else {
            val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.rv_active, viewGroup, false)
            return ViewHolder(view)
        }
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        if (getItemViewType(position) == 0) {
            val holder = viewHolder as ViewHolder2
            val data: ActiveUsersData.ActiveDate = actives[position] as ActiveUsersData.ActiveDate
            holder.date.text = data.date
        } else {
            val holder = viewHolder as ViewHolder
            val data: ActiveUsersData.ActiveCard = actives[position] as ActiveUsersData.ActiveCard
            holder.distance.text = data.distance
            holder.time.text = data.time
            holder.category.text = data.category
            holder.date.text = data.date
            holder.user.text = data.user
        }
    }

    override fun getItemCount() = actives.size

}