package com.example.customlistview


import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val listView = findViewById<ListView>(R.id.listView)
        val list = ArrayList<Model>()


        list.add(Model("Isabel", "Crystal Lake", R.drawable.crystal_lake))
        list.add(Model("Vincent", "Chicago", R.drawable.chicago))
        list.add(Model("Joel", "Tampa", R.drawable.tampa))
        list.add(Model("Maddy", "Houston", R.drawable.houston))
        list.add(Model("Benjamin", "San Diego", R.drawable.san_diego))


        listView.adapter = MyCustomAdapter(this, R.layout.custom_item_layout, list)


        listView.setOnItemClickListener { _, _, i, _ ->
            Toast.makeText(this, "${list[i].name} lives in ${list[i].city}",
                Toast.LENGTH_SHORT).show()
        }


    }


}

