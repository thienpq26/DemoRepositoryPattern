package com.example.demorepositorypattern.data.source.local.dao

import android.content.ContentValues
import com.example.demorepositorypattern.data.model.Student

interface StudentDAO {
    fun getStudentAll(): ArrayList<Student>
    fun insertStudent(values: ContentValues): Long
    fun updateStudent(
        values: ContentValues?,
        selection: String?,
        selectionArgs: Array<String>?
    ): Int

    fun deleteStudent(selection: String?, selectionArgs: Array<String>?): Int
}
