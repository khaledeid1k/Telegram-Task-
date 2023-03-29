package com.example.telegram.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager2.widget.ViewPager2
import com.example.telegram.R
import com.example.telegram.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {
    private val dataArray = arrayOf(
        "Media",
        "Files",
        "Links",
        "Musics"
    )
    private val fragmentList = arrayOf(
        Media(),
        Files(),
        Links(),
        Music()
    )
 private lateinit  var viewPager : ViewPager2
 private lateinit  var tabLayout : TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
         viewPager= findViewById(R.id.viewPager)
         tabLayout=findViewById<TabLayout>(R.id.tabLayout)

        initViewPager()
        initTabLayout()

    }

    private fun initViewPager(){
        val adapter = ViewPagerAdapter(this, fragmentList)
        viewPager.adapter=adapter
    }

    private fun initTabLayout(){
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = dataArray[position]
        }.attach()
    }
}