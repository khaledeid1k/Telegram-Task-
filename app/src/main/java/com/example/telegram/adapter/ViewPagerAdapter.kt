package com.example.telegram.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.telegram.ui.Media
import com.example.telegram.ui.Music



class ViewPagerAdapter(
    container: FragmentActivity,
    private val fragmentList: Array<Fragment>

) : FragmentStateAdapter(container) {
    override fun getItemCount()= fragmentList.size
    override fun createFragment(position: Int)=fragmentList[position]
}
