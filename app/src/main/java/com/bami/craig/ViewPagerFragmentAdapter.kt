package com.bami.craig

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerFragmentAdapter(fragment: MainActivity) :
    FragmentStateAdapter(fragment) {


    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        when(position) {
           0->{
               return devicesFragment()
           }
           1->{
               return roomsFragment()
           }
           2->{
               return routinesFragment()
           }
           else->{
               return devicesFragment()
           }
        }

    }


}