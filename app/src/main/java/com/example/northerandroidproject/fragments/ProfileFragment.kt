package com.example.northerandroidproject.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.northerandroidproject.R
import com.example.northerandroidproject.databinding.ProfileLayoutBinding

class ProfileFragment: Fragment() {
    private lateinit var mContext : Context
    private lateinit var mBinding : ProfileLayoutBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.mContext = context
    }
    fun newInstance(): ProfileFragment  {
        val args = Bundle()
        val fragment = ProfileFragment()
        fragment.arguments = args
        return fragment
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.profile_layout, container,false)
        return mBinding.root
    }
}