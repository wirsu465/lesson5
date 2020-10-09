package com.example.myapplication

import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TimePicker
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), TimePickerDialog.OnTimeSetListener  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

           lul.setOnClickListener {
               AlertDialog.Builder(this).setNegativeButton("show", null)
                   .setTitle("ttette")
                   .show()
           }
        opl.setOnClickListener {
            val timeDsdDialog = TimePickerDialog(this@MainActivity, this,  3, 10, true)
            timeDsdDialog.show()
        }
    }

    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        Log.d(
            "TAG",
            "onTimeSet() called with: view = $view, hourOfDay = $hourOfDay, minute = $minute"
        )

    }
}
