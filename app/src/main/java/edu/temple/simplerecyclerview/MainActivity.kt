package edu.temple.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set up RecyclerView display responsibility
        val numbers = Array(100) {it + 1}
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val displayTextView = findViewById<TextView>(R.id.displayTextView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        // TODO (Step 2: Define lambda to modify displayTextView size)

        val callBack = {size : Int ->
            displayTextView.textSize = size.toFloat()
        }

        // Todo (Step 3: Pass lambda to adapter)
        recyclerView.adapter = NumberDisplayAdapter(numbers){size : Int ->
            displayTextView.textSize = size.toFloat()
        }

        //val viewHolder = NumberDisplayAdapter(numbers).NumberViewHolder(TextView(unfinished))


    }

}