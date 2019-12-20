package com.graduation.android.kotindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


/**
 * 练手demo
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn = findViewById<Button>(R.id.btn_ok)

        var tv_content = findViewById<TextView>(R.id.tv_content)
        btn.setOnClickListener {
            //输出print
            tv_content.text=""+add(5, 8)
        }
    }

    fun add(m: Int, n: Int): Int {
        return m + n

    }
}
