package com.example.demorepositorypattern.data.source.local

import android.content.ContentValues
import com.example.demorepositorypattern.data.model.Student
import com.example.demorepositorypattern.data.source.StudentDataSource
import com.example.demorepositorypattern.data.source.local.dao.StudentDAO

class StudentLocalDataSource(private var studentDAO: StudentDAO) : StudentDataSource.Local {

    override fun getStudentAll(): ArrayList<Student> {
        return studentDAO.getStudentAll()
    }

    override fun insertStudent(values: ContentValues): Long {
        return studentDAO.insertStudent(values)
    }

    override fun updateStudent(
        values: ContentValues?,
        selection: String?,
        selectionArgs: Array<String>?
    ): Int {
        return studentDAO.updateStudent(values, selection, selectionArgs)
    }

    override fun deleteStudent(selection: String?, selectionArgs: Array<String>?): Int {
        return studentDAO.deleteStudent(selection, selectionArgs)
    }
}
