package com.example.todolist.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.R
import com.example.todolist.databinding.ActivityListBinding
import com.example.todolist.databinding.ActivityMainBinding
import com.example.todolist.models.Todo

class TodoAdapters(
    val todos: ArrayList<Todo>
): RecyclerView.Adapter<TodoAdapters.TodoViewHolder>() {

    private lateinit var binding : ActivityListBinding

    override fun getItemCount(): Int {
        return todos.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val li  =  parent?.context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val itemView = li.inflate(R.layout.activity_list,parent,false)
        return TodoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {

    }


    class TodoViewHolder(val item: View) : RecyclerView.ViewHolder(item){
        fun bindView() {
            val tvTodoTask = item.findViewById<TextView>(R.id.tvTodoTask)
        }
    }
}