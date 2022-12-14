package com.bami.craig
import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {

    val imageList = listOf<Int>(R.drawable.ic_devices, R.drawable.ic_bed, R.drawable.ic_sunny)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val addNewComponent     = findViewById<FloatingActionButton>(R.id.addNewComponent)

        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.my_toolbar))

        val tabLayout = findViewById<TabLayout>(R.id.tabmenu)
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val viewPagerFragmentAdapter = ViewPagerFragmentAdapter(this)
        viewPager.adapter = viewPagerFragmentAdapter
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->

            tab.text = when(position) {
                0 -> "Devices"
                1 -> "Rooms"
                2 -> "Routines"
                else -> "Unknown page"
            }

            tab.setIcon(getDrawable(imageList[position]))
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
