package com.example.ui_test

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            initViews()
    }
    private fun initViews(){
        btn_test.setOnClickListener {
            tv_showText.text = "Hello ${ed_test.text}"
        }
    }
}
