package com.example.northerandroidproject.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.example.northerandroidproject.R
import com.example.northerandroidproject.adapters.ProductImageAdapter
import com.example.northerandroidproject.databinding.ActivityProductDetailBinding

class ProductDetailActivity : AppCompatActivity() {
    private lateinit var mAdapter: ProductImageAdapter
    private lateinit var images: List<String>
    private lateinit var mBinding : ActivityProductDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_product_detail)
        images = listOf("https://reqres.in/img/faces/7-image.jpg", "https://reqres.in/img/faces/7-image.jpg", "https://reqres.in/img/faces/7-image.jpg", "https://reqres.in/img/faces/7-image.jpg")
        mBinding.header.titleText.text = "Product Details"

        mAdapter = ProductImageAdapter(this, images.size, images)
        mBinding.viewPagerMain.adapter = mAdapter

    }
}