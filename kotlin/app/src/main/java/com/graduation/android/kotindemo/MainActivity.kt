package com.graduation.android.kotindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


/**
 * 练手demo
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn=findViewById<Button>(R.id.btn_ok)
        btn.setOnClickListener{//输出print
            println("你好吗？")
        }
    }
}
