package com.example.telegram.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.telegram.ui.Files
import com.example.telegram.ui.Links
import com.example.telegram.ui.Media
import com.example.telegram.ui.Music


private const val NUM_TABS = 4

class ViewPagerAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle)
    :FragmentStateAdapter(fragmentManager,lifecycle) {

    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return Media()
            1 -> return Files()
            2 -> return Links()
        }
        return Music()

    }
}
