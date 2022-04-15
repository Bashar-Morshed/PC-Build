package com.example.pc_build

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.AdapterView
import android.widget.ArrayAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.FLfragment, main())
            commit()
        }
    }
    override  fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater= menuInflater
        inflater.inflate(R.menu.my_first_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1->Toast.makeText(this,"Full Build has been chosen",Toast.LENGTH_SHORT).show()
            R.id.item2->Toast.makeText(this,"Component has been chosen",Toast.LENGTH_SHORT).show()
        }
        if (item.itemId == R.id.item1) {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.FLfragment, FirstFragment())
                commit()
            }
        }
            else if (item.itemId == R.id.item2) {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.FLfragment, SecondFragment())
                    commit()
                }

            }


        return super.onOptionsItemSelected(item)
    }
}