package com.example.asiantech.demokotlin.ui

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import com.example.asiantech.demokotlin.R
import com.example.asiantech.demokotlin.model.Student
import com.example.asiantech.demokotlin.adapter.StudentAdapter

class MainActivity : AppCompatActivity() {

    // Private var mStudents: List<Student>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Init recyclerView
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.hasFixedSize()
        recyclerView.adapter = StudentAdapter(getList(), {
            toast("item view clicked!")
        })
    }

    // Function init data
    fun getList(): ArrayList<Student> {
        val students = ArrayList<Student>()
        students.add(Student("student 1", R.mipmap.ic_launcher))
        students.add(Student("student 2", R.mipmap.ic_launcher))
        students.add(Student("student 3", R.mipmap.ic_launcher))
        students.add(Student("student 4", R.mipmap.ic_launcher))
        return students
    }

    // Function show toast context
    fun Context.toast(message: CharSequence) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()

}
