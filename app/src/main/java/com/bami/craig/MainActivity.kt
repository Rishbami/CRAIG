package com.bami.craig
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.my_toolbar))

        val tabLayout = findViewById<TabLayout>(R.id.tabmenu)
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val viewPagerFragmentAdapter = ViewPagerFragmentAdapter(this)

        viewPager.adapter = viewPagerFragmentAdapter
        tabLayout.getTabAt(0)?.setIcon(R.drawable.ic_devices)


        TabLayoutMediator(tabLayout, viewPager) { tab, position ->

            tab.text = when(position) {
                0 -> {
                    "Devices"
                }
                1 -> {
                    "Rooms"
                }
                2 -> {
                    "Routines"
                }
                else -> {
                    "Unknown page"
                }
            }
        }.attach()
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {

        R.id.action_settings -> {
            true
        }

        R.id.action_favorite -> {
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }

    }

   override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.tool_bar_items,menu)
       println("Hello")
        return true
    }
}