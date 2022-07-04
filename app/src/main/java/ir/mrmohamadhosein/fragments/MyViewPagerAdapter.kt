package ir.mrmohamadhosein.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {

        when (position) {

            0 -> {
                return Fragment1()
            }

            1 -> {
                return Fragment2()
            }

            2 -> {
                return Fragment3()
            }

            else -> {
                return Fragment()
            }

        }
    }

    override fun getItemCount(): Int {
        return 3
    }


}