package com.example.kotlin.view_pager_app

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAppAdapter(fragmentManager: FragmentManager, lifeCycle: Lifecycle)
    : FragmentStateAdapter(fragmentManager, lifeCycle) {

    private var fragmentsList = ArrayList<Fragment>()
    fun addFragment(fragment: Fragment){
        fragmentsList.add(fragment)
    }
    override fun getItemCount(): Int {
        return fragmentsList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentsList[position]
    }
}