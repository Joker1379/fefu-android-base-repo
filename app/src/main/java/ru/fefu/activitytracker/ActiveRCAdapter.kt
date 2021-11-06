package ru.fefu.activitytracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ru.fefu.activitytracker.data.Active

class ActiveRCAdapter(private val clickListener: (Active) -> Unit) :
    ListAdapter<Active, ActiveRCAdapter.ActiveHolder>(ActiveDiffUtilCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActiveHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.rv_active, parent, false)
        return ActiveHolder(view)
    }

    override fun onBindViewHolder(holder: ActiveHolder, position: Int) =
        holder.bind(currentList[position])

    inner class ActiveHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val cat: TextView = view.findViewById(R.id.label_category)
        private val km: TextView = view.findViewById(R.id.label_km)
        private val time: TextView = view.findViewById(R.id.label_time)
        private val date: TextView = view.findViewById(R.id.label_when)

        /*init {
            view.setOnClickListener {
                val position = adapterPosition
                currentList.getOrNull(position)?.let { clickListener.invoke(it) }
            }
        }*/

        fun bind(active: Active) {
            cat.text = active.cat
            km.text = active.map
            time.text = active.start
            date.text = active.end
        }
    }

}

private class ActiveDiffUtilCallback : DiffUtil.ItemCallback<Active>() {
    override fun areItemsTheSame(oldItem: Active, newItem: Active): Boolean =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Active, newItem: Active): Boolean =
        oldItem == newItem
}
