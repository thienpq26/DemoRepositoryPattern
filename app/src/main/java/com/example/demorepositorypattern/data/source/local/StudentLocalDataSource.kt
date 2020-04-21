package com.example.demorepositorypattern.data.source.local

import android.content.ContentValues
import com.example.demorepositorypattern.data.model.Student
import com.example.demorepositorypattern.data.source.StudentDataSource
import com.example.demorepositorypattern.data.source.local.dao.StudentDAO

class StudentLocalDataSource(private var studentDAO: StudentDAO) {


}
