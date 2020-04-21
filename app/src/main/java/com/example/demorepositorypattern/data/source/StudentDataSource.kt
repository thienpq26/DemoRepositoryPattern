package com.example.demorepositorypattern.data.source

import android.content.ContentValues
import com.example.demorepositorypattern.data.model.Student

interface StudentDataSource {
    interface Local {
        fun getStudentAll(): ArrayList<Student>
        fun insertStudent(values: ContentValues): Long
        fun updateStudent(
            values: ContentValues?,
            selection: String?,
            selectionArgs: Array<String>?
        ): Int

        fun deleteStudent(selection: String?, selectionArgs: Array<String>?): Int
    }
}
