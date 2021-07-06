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

//    private lateinit var binding : ActivityListBinding

    override fun getItemCount(): Int {
        return todos.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_list, parent, false)

        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.tvTodoTask.text = todos[position].task
    }


    class TodoViewHolder(val item: View) : RecyclerView.ViewHolder(item){
        val tvTodoTask = item.findViewById<TextView>(R.id.tvTodoTask)
    }
}