package com.example.equiphy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlin.system.exitProcess

class WelcomeActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val btnList: Button = findViewById(R.id.button_equip)
        val btnABout: Button = findViewById(R.id.button_about)
        val btnExit: Button = findViewById(R.id.button_exit)

        btnList.setOnClickListener(this)
        btnABout.setOnClickListener(this)
        btnExit.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.button_equip -> {
                    val moveIntent = Intent(this@WelcomeActivity, MainActivity::class.java)
                    startActivity(moveIntent)
                }
                R.id.button_about -> {
                    val moveIntent = Intent(this@WelcomeActivity, AboutActivity::class.java)
                    startActivity(moveIntent)
                }
                R.id.button_exit -> {
                    finish()
                    exitProcess(0)
                }
            }
        }
    }
}
