package com.example.cloudkitchen_admin.FrontEnd.LoginSignUp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.lifecycle.ViewModelProvider
import com.example.cloudkitchen_admin.FrontEnd.LoginSignUp.data.Result
import com.example.cloudkitchen_admin.FrontEnd.LoginSignUp.ui.login.LoggedInUserView
import com.example.cloudkitchen_admin.FrontEnd.LoginSignUp.ui.login.LoginResult
import com.example.cloudkitchen_admin.FrontEnd.LoginSignUp.ui.login.LoginViewModel
import com.example.cloudkitchen_admin.FrontEnd.LoginSignUp.ui.login.LoginViewModelFactory
import com.example.cloudkitchen_admin.R
import com.example.cloudkitchen_admin.databinding.FragmentLoginBinding
import com.google.android.material.textfield.TextInputEditText

class LoginFragment : Fragment() {

    private  var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    private lateinit var mContext: Context
    private lateinit var email_TIEDT:TextInputEditText
    private lateinit var password_TIEDT:TextInputEditText
    private lateinit var loginBtn:AppCompatButton


    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(layoutInflater, container, false)
        return binding.root
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        email_TIEDT = binding.emailTIEDT
        password_TIEDT = binding.passwordTIEDT
        loginBtn = binding.loginBtn
        
        if(isAdded){
            binding.signUpTv.setOnClickListener{
                Toast.makeText(mContext, "Hello", Toast.LENGTH_SHORT).show()
            }

            val emailEntered = email_TIEDT.text.toString()
            val passwordEntered = password_TIEDT.text.toString()

            if(emailEntered.isNotBlank() && passwordEntered.isNotBlank()){

            }
            else{
                Toast.makeText(mContext, "Enter All Information", Toast.LENGTH_SHORT).show()
            }



        }

    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun login(email: String, password: String) {
        // can be launched in a separate asynchronous job

    }


}