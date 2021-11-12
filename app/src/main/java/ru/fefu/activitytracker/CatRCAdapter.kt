package ru.fefu.activitytracker

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.fefu.activitytracker.data.CatData

class CatRCAdapter(private val cats: List<CatData>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val category: TextView = view.findViewById(R.id.label_category)
        init {
            view.setOnClickListener {
                val sharedPrefs = view.context.getSharedPreferences("SharedPrefs", Context.MODE_PRIVATE)
                sharedPrefs.edit().putString("ActCat", category.text.toString()).apply()
            }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.rv_new, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        val holder = viewHolder as ViewHolder
        holder.category.text = cats[position].category
    }

    override fun getItemCount() = cats.size

}