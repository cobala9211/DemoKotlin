package com.example.asiantech.demokotlin.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.asiantech.demokotlin.R
import com.example.asiantech.demokotlin.model.Student

/**
 * Copyright © 2017 AsianTech inc.
 * Created by phuongdn on 22/06/2017.
 */
class StudentAdapter(val students: List<Student>, val listener: (Student) -> Unit)
    : RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): StudentViewHolder
            = StudentViewHolder(LayoutInflater.from(parent!!.context).inflate(R.layout.item_list, parent, false))

    override fun onBindViewHolder(holder: StudentViewHolder?, position: Int)
            = holder!!.onBindData(student = students[position], listener = listener)

    override fun getItemCount(): Int = students.size

    class StudentViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val imgAvatar = itemView?.findViewById(R.id.imgAvatar) as ImageView
        val tvTitle = itemView?.findViewById(R.id.tvTitle) as TextView

        fun onBindData(student: Student, listener: (Student) -> Unit) {
            tvTitle.text = student.title
            imgAvatar.setImageResource(student.avatar)
            imgAvatar.setOnClickListener { listener(student) }
            imgAvatar.setOnClickListener {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        }
    }

}