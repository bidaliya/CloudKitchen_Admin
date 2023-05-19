package com.example.cloudkitchen_admin.FrontEnd

import android.content.Intent
import android.graphics.Paint
import android.os.Build
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.denzcoskun.imageslider.models.SlideModel
import com.example.cloudkitchen_admin.FrontEnd.LoginSignUp.LoginSignUp_Container
import com.example.cloudkitchen_admin.R
import com.example.cloudkitchen_admin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var loginBtn:AppCompatButton
    private lateinit var signUpBtn:AppCompatButton
    private lateinit var continue_as_guest_tv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        loginBtn = binding.loginBtn
        signUpBtn = binding.signUpBtn
        continue_as_guest_tv = binding.continueAsGuestTv


        continue_as_guest_tv.paintFlags = continue_as_guest_tv.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        loginBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, LoginSignUp_Container::class.java))
        }

    }


}