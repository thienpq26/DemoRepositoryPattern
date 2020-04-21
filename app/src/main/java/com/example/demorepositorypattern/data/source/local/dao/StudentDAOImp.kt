package com.example.demorepositorypattern.data.source.local.dao

import android.content.ContentValues
import com.example.demorepositorypattern.data.model.Student
import com.example.demorepositorypattern.data.source.local.DBManager

class StudentDAOImp(private var db: DBManager?) : StudentDAO {

    override fun getStudentAll(): ArrayList<Student> {
        return db!!.getAllStudents()
    }

    override fun insertStudent(values: ContentValues): Long {
        return db!!.insertStudent(values)
    }

    override fun updateStudent(
        values: ContentValues?,
        selection: String?,
        selectionArgs: Array<String>?
    ): Int {
        return db!!.updateStudent(values, selection, selectionArgs)
    }

    override fun deleteStudent(selection: String?, selectionArgs: Array<String>?): Int {
        return db!!.deleteStudent(selection, selectionArgs)
    }
}
