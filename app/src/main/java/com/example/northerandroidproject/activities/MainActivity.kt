package com.example.northerandroidproject.activities


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.northerandroidproject.R
import com.example.northerandroidproject.databinding.ActivityMainBinding

import androidx.fragment.app.FragmentManager
import com.example.northerandroidproject.fragments.ProfileFragment


class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setCurrentFragment(ProfileFragment())
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mBinding.bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home->setCurrentFragment(ProfileFragment())
                R.id.profile->setCurrentFragment(ProfileFragment())
                R.id.category->setCurrentFragment(ProfileFragment())

            }
            true
        }
    }

    // yugpreet branch
    private fun setCurrentFragment(fragment:Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container,fragment)
            commit()
        }



    fun switchToFragment1(fragment : Fragment) {
        val manager: FragmentManager = supportFragmentManager
        manager.beginTransaction().replace(R.id.container, fragment).commit()
    }
}

