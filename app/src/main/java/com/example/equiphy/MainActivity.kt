package com.example.equiphy

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var menu: Menu

    private lateinit var rvEquipment: RecyclerView
    private var list: ArrayList<Equipment> = arrayListOf()
    private var title = "Equipment List"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }

        rvEquipment = findViewById(R.id.rv_equip)
        rvEquipment.setHasFixedSize(true)

        list.addAll(EquipmentList.listData)
        showRecycleList()
    }

    private fun showRecycleList() {
        rvEquipment.layoutManager = LinearLayoutManager(this)
        val listAdapter = ListAdapter(list)
        rvEquipment.adapter = listAdapter

        listAdapter.setOnItemClickCallback(object: ListAdapter.OnItemClickCallback{
            override fun onItemClickCallBack(data: Equipment) {
                showSelectedEquipment(data)
            }
        })
    }
    private fun showRecycleCard() {
        rvEquipment.layoutManager = LinearLayoutManager(this)
        val cardViewAdapter = CardViewAdapter(list)
        rvEquipment.adapter = cardViewAdapter

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        this.menu = menu
        menuInflater.inflate(R.menu.menu_item, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var id = item.itemId
        when (id) {
            R.id.cv -> {
                menu.getItem(0).isVisible = false
                menu.getItem(1).isVisible = true
                showRecycleCard()
            }
            R.id.list -> {
                menu.getItem(1).isVisible = false
                menu.getItem(0).isVisible = true
                showRecycleList()
            }
            R.id.about -> {
                val moveAboutActivity = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveAboutActivity)

            }
        }
        return super.onOptionsItemSelected(item)
    }


    private fun showSelectedEquipment(equipment: Equipment) {
        val moveDetail = Intent(this@MainActivity, DetailActivity::class.java)
        moveDetail.putExtra("Nama", equipment.name)
        moveDetail.putExtra("Type", equipment.type)
        moveDetail.putExtra("Desc", equipment.desc)
        moveDetail.putExtra("Img", equipment.img)

        startActivity(moveDetail)
    }
}
