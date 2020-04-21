package com.example.demorepositorypattern.data.source

import android.content.ContentValues
import com.example.demorepositorypattern.data.model.Student
import com.example.demorepositorypattern.data.source.StudentDataSource
import com.example.demorepositorypattern.data.source.local.StudentLocalDataSource

class StudentRepository(private var studentLocalDataSource: StudentLocalDataSource) :
    StudentDataSource.Local {
    override fun getStudentAll(): ArrayList<Student> {
        return studentLocalDataSource.getStudentAll()
    }

    override fun insertStudent(values: ContentValues): Long {
        return studentLocalDataSource.insertStudent(values)
    }

    override fun updateStudent(
        values: ContentValues?,
        selection: String?,
        selectionArgs: Array<String>?
    ): Int {
        return studentLocalDataSource.updateStudent(values, selection, selectionArgs)
    }

    override fun deleteStudent(selection: String?, selectionArgs: Array<String>?): Int {
        return studentLocalDataSource.deleteStudent(selection, selectionArgs)
    }

}
