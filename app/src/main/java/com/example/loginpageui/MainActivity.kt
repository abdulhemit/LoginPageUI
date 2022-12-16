package com.example.loginpageui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.loginpageui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.singUp.setOnClickListener {
            binding.singUp.background = resources.getDrawable(R.drawable.switch_trcks,null)
            binding.singUp.setTextColor(resources.getColor(R.color.textColor))
            binding.logIn.background = null
            binding.logIn.setTextColor(resources.getColor(R.color.pickColor))
            binding.SingUpLayout.visibility = View.VISIBLE
            binding.loginLayout.visibility = View.GONE
        }
        binding.logIn.setOnClickListener {
            binding.logIn.background = resources.getDrawable(R.drawable.switch_trcks,null)
            binding.logIn.setTextColor(resources.getColor(R.color.textColor))
            binding.singUp.background = null
            binding.singUp.setTextColor(resources.getColor(R.color.pickColor))
            binding.SingUpLayout.visibility = View.GONE
            binding.loginLayout.visibility = View.VISIBLE
        }
        binding.singIn.setOnClickListener {
            startActivity(Intent(this,newActivity::class.java))
        }

    }
}