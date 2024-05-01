package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listV = findViewById<ListView>(R.id.listView)

        val taskList = arrayListOf<String>()
        taskList.add("Plan the day")
        taskList.add("Learn database")
        taskList.add("Reduce the screen time")
        taskList.add("Plan for a trip in this summer")
        taskList.add("Study mutual funds/Stocks")
        taskList.add("Upload a video")
        taskList.add("Learn jetpack compose")
        

        val adapterForToDoList = ArrayAdapter(this,android.R.layout.simple_list_item_1,taskList)
        listV.adapter = adapterForToDoList

        listV.setOnItemClickListener { adapterView, view, i, l ->

            val text = "Clicked on item " + (view as TextView).text.toString()
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
        }

    }
}