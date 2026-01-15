package com.example.kotlin.nav_drawer_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.kotlin.R
import com.google.android.material.navigation.NavigationView

class NavDrawerApp : AppCompatActivity() {
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav_drawer_app)
        val drawerLayout: DrawerLayout = findViewById(R.id.drawerLayout)
        toggle = ActionBarDrawerToggle(
            this@NavDrawerApp,
            drawerLayout,
            R.string.open,
            R.string.close)

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val navView: NavigationView = findViewById(R.id.drawerNavView)
        navView.setNavigationItemSelectedListener {
            it.isChecked = true
            when(it.itemId){
                R.id.drawerHome -> replaceFragment(HomeFragment(), it.title.toString())
                R.id.drawerLogin -> replaceFragment(LoginFragment(), it.title.toString())
                R.id.drawerMessage -> replaceFragment(MessageFragment(), it.title.toString())
                R.id.drawerSettings -> replaceFragment(SettingsFragment(), it.title.toString())
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment, title:String) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.drawerFrameLayout, fragment)
        fragmentTransaction.commit()

        drawerLayout.closeDrawers()
        setTitle(title)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)) return true
        return super.onOptionsItemSelected(item)
    }
}