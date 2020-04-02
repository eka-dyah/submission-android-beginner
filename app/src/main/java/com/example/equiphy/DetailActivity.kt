package com.example.equiphy

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val actionBar  = supportActionBar
        if (actionBar != null) {
            actionBar.title = "About"
        }
        actionBar?.setDisplayHomeAsUpEnabled(true)

        var name = intent.getStringExtra("Nama")
        var type = intent.getStringExtra("Type")
        var desc = intent.getStringExtra("Desc")
        var img = intent.getIntExtra("Img", 0)

        var setName: TextView = findViewById(R.id.equip_name)
        var setType: TextView = findViewById(R.id.type)
        var setDesc: TextView = findViewById(R.id.equip_desc)
        var setImg: ImageView = findViewById(R.id.img_item)

        setName.text = name
        setDesc.text = desc
        setType.text = type
        setImg.setImageResource(img)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

