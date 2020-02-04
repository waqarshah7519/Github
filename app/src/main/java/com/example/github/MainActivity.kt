package com.example.github

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mylibrary.HelperMethod

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helperMethod = HelperMethod()

        Toast.makeText(this, helperMethod.name , Toast.LENGTH_SHORT).show()
            }
}
