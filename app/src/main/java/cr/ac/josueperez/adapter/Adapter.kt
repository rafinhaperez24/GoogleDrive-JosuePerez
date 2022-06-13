package cr.ac.josueperez.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.google.api.services.drive.model.File
import cr.ac.josueperez.R
import kotlinx.coroutines.CoroutineScope

class Adapter(context: Context, listaDrive: List<File>): ArrayAdapter<File> (context, 0, listaDrive){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater : LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var rowView = inflater.inflate(R.layout.drive_item, parent, false)
        val nombre = rowView.findViewById<TextView>(R.id.drive_nombre)
        val id = rowView.findViewById<TextView>(R.id.drive_id)

        val listaDrive = getItem(position)

        nombre.text = listaDrive?.name
        id.text = listaDrive?.id

        return rowView
    }
}