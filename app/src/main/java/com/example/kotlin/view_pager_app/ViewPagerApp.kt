package com.example.kotlin.view_pager_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.kotlin.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ViewPagerApp : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPagerAppAdapter: ViewPagerAppAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager_app)
        viewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.viewPagerTabLayout)
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        viewPagerAppAdapter = ViewPagerAppAdapter(supportFragmentManager, lifecycle)

        viewPagerAppAdapter.addFragment(ViewPagerFragment1())
        viewPagerAppAdapter.addFragment(ViewPagerFragment2())
        viewPagerAppAdapter.addFragment(ViewPagerFragment3())

        viewPager.adapter = viewPagerAppAdapter
        TabLayoutMediator(tabLayout,
            viewPager
        ) {
            tab, position -> tab.text = "Tab ${position+1}"
        }.attach()
    }
}