package com.example.customlistview


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView


class MyCustomAdapter(var ctx: Context,
                      var our_resource: Int,
                      var Items: ArrayList<Model>): ArrayAdapter<Model>(ctx, our_resource, Items) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater = LayoutInflater.from(ctx)
        val view = layoutInflater.inflate(our_resource, null)


        val name = view.findViewById<TextView>(R.id.name)
        val city = view.findViewById<TextView>(R.id.city)
        val img = view.findViewById<ImageView>(R.id.imageOne)


        name.text = Items[position].name
        city.text = Items[position].city
        img.setImageDrawable(ctx.resources.getDrawable(Items[position].img))


        return view
    }


}

