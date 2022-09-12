package com.example.fragmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
   lateinit var btn1 :Button
   lateinit var btn2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val fragment1 = BlankFragmentOne()
         val fragment2 = BlankFragmentTwo()
        btn1= findViewById(R.id.fragment1)
        btn2 = findViewById(R.id.fragment2)
        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment , fragment1)
                addToBackStack(null)
                commit()
            }
        }
        btn2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment , fragment2)
                addToBackStack(null)
                commit()
            }
        }

    }

}