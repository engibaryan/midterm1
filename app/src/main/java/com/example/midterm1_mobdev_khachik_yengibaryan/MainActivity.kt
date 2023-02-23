package com.example.midterm1_mobdev_khachik_yengibaryan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var n = 4
        var initial = arrayOf("A", "B", "C")
        var helper = arrayOf<String>()
        var goal = arrayOf<String>()
        fun hanoiTower(n: Int, initial: Array<String>, goal:  Array<String>, helper:  Array<String>) {

            if(n == 0)
                return

            hanoiTower(n-1,initial,helper,goal)

            hanoiTower(n-1,helper,goal,initial)
        }
        hanoiTower(n,initial,goal,helper)
    }
}