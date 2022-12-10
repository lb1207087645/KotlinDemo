package com.graduation.android.kotindemo

import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView


/**
 * tab 页切换 主页面 底部导航栏
 */
class TabMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_tab_layout)
        //tabLayout 用法
        val navController:NavController=Navigation.findNavController(this,R.id.nav_host_fragment)//上面tab页fragment
        val navigationView = findViewById<BottomNavigationView>(R.id.nav_view)//底部导航栏
        NavigationUI.setupWithNavController(navigationView, navController)
    }

}