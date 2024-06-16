package com.ibrahim.asb2_createfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.ibrahim.asb2_createfragment.adapters.ViewPagerAdapter
import com.ibrahim.asb2_createfragment.fragments.*


class SecondActivity : AppCompatActivity() {
    lateinit var tabs : TabLayout
    lateinit var viewPager: ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tabs = findViewById(R.id.tabs)
        viewPager = findViewById(R.id.viewPager)

        setUpTabs()
    }
    private fun setUpTabs(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "Home")
        adapter.addFragment(FavouritesFragment(), "Favourites")
        adapter.addFragment(SettingsFragment(), "Settings")

        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
        tabs.getTabAt(0)!!.setIcon(R.drawable.baseline_home_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.baseline_favorite_24)
        tabs.getTabAt(2)!!.setIcon(R.drawable.baseline_settings_24)
    }
}