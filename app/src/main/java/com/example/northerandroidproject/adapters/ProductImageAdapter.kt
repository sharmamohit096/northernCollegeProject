package com.example.northerandroidproject.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup

import androidx.viewpager.widget.PagerAdapter
import android.widget.LinearLayout

import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.widget.AppCompatImageView
import com.bumptech.glide.Glide
import com.example.northerandroidproject.R


class ProductImageAdapter (private var myContext: Context, private var totalTabs: Int, private var imagesData : List<String>):
    PagerAdapter() {
    private  var mContext: Context = myContext;
    private  var images: List<String> = imagesData
    private  var mLayoutInflater : LayoutInflater = mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return totalTabs
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val itemView: View = mLayoutInflater.inflate(R.layout.item_for_products, container, false)
        val imageView: ImageView = itemView.findViewById<View>(R.id.product_image) as AppCompatImageView

        Glide
            .with(mContext)
            .load(images[position])
            .centerCrop()
            .placeholder(R.drawable.loader_for_image)
            .into(imageView);
        container.addView(imageView, 0)
        return imageView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as AppCompatImageView)
    }


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as AppCompatImageView
    }
}