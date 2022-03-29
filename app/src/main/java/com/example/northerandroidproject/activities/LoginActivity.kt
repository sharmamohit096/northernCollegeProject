package com.example.northerandroidproject.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.northerandroidproject.R
import com.example.northerandroidproject.databinding.ActivityLoginBinding
import com.example.northerandroidproject.interfaces.ApiInterface
import com.example.northerandroidproject.models.Categories
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    private lateinit var mContext: Context;
    private lateinit var mBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.mContext = this;
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        mBinding.loginButton.setOnClickListener({ startActivity(Intent(this, MainActivity::class.java)) })
        mBinding.signUp.setOnClickListener({ startActivity(Intent(this, SignUpActivity::class.java)) })


//        val apiInterface = ApiInterface.create().getMovies()
//        apiInterface.enqueue( object : Callback<List<Categories>> {
//            override fun onResponse(call: Call<List<Categories>>?, response: Response<List<Categories>>?) {
//                if(response?.body() != null)
//                    Toast.makeText(mContext, response.body()!![0].title+"", Toast.LENGTH_SHORT).show();
//            }
//
//            override fun onFailure(call: Call<List<Categories>>?, t: Throwable?) {
//                if (t != null) {
//                    Toast.makeText(mContext, t.localizedMessage, Toast.LENGTH_SHORT).show()
//                };
//            }
//        })
    }
}