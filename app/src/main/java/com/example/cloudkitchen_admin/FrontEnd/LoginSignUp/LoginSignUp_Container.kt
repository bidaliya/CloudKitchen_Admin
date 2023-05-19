package com.example.cloudkitchen_admin.FrontEnd.LoginSignUp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.cloudkitchen_admin.R
import com.example.cloudkitchen_admin.databinding.ActivityLoginSignUpContainerBinding

class LoginSignUp_Container : AppCompatActivity() {

    private lateinit var binding: ActivityLoginSignUpContainerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginSignUpContainerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)


    }

}