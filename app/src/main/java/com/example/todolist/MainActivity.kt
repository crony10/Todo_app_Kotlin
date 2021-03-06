package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todolist.Adapter.TodoAdapters
import com.example.todolist.databinding.ActivityMainBinding
import com.example.todolist.models.Todo

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    val todos: ArrayList<Todo> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        todos.add(Todo("First Task",true))

        binding.rvTodos.layoutManager = LinearLayoutManager(this)
        val todoAdapter = TodoAdapters(todos)
        binding.rvTodos.adapter = todoAdapter

        // Setting up the add button
        binding.btnAdd.setOnClickListener{
            val newTodo = binding.etNewTask.text.toString()
            todos.add(Todo(newTodo,false))
            todoAdapter.notifyDataSetChanged()
        }
    }
}