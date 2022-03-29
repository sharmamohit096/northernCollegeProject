package com.example.northerandroidproject.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.northerandroidproject.R
import com.example.northerandroidproject.databinding.CategoryFragmentBinding

class CategoriesFragment : Fragment() {
    private lateinit var mContext : Context
    private lateinit var mBinding : CategoryFragmentBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.mContext = context
    }
    fun newInstance(): CategoriesFragment  {
        val args = Bundle()
        val fragment = CategoriesFragment()
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
        mBinding = DataBindingUtil.inflate(inflater, R.layout.category_fragment, container,false)
        return mBinding.root
    }
}