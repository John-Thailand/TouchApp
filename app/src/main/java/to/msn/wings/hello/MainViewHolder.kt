package to.msn.wings.hello

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textView: TextView = itemView.findViewById<TextView>(R.id.tv_item_model)
}