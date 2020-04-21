package com.example.demorepositorypattern

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.demorepositorypattern.data.model.Student
import com.example.demorepositorypattern.data.source.StudentRepository
import com.example.demorepositorypattern.data.source.local.DBManager
import com.example.demorepositorypattern.data.source.local.StudentLocalDataSource
import com.example.demorepositorypattern.data.source.local.dao.StudentDAOImp
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var studentRepository: StudentRepository? = null
    private var arrST: ArrayList<Student>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        arrST = ArrayList()
        studentRepository = StudentRepository(StudentLocalDataSource(StudentDAOImp(DBManager(this)))
            )

        button.setOnClickListener {
            if (studentRepository!!.getStudentAll().isNotEmpty()) {
                arrST = studentRepository!!.getStudentAll()
                for (i in arrST!!) {
                    Log.v("D/d", "Student ${i}: ${arrST.toString()}")
                }
            }
        }

        button2.setOnClickListener {
            if (studentRepository!!.insertStudent(
                    setContentValues(
                        Student(
                            "Pham Quang Thien",
                            "0325214141",
                            "Tuyen Quang",
                            "pqthienhaui@gmail.com"
                        )
                    )
                ) > 0
            ) {
                Toast.makeText(this, "Insert success", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setContentValues(student: Student): ContentValues {
        return ContentValues().apply {
            put(DBManager.NAME, student.mName)
            put(DBManager.PHONE, student.mPhone)
            put(DBManager.ADDRESS, student.mAddress)
            put(DBManager.EMAIL, student.mEmail)
        }
    }
}
