package com.extcode.project.mysimplecleanarchitecture.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.extcode.project.mysimplecleanarchitecture.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var activityMainBinding : ActivityMainBinding? = null
    private val binding get() = activityMainBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val factory = ViewModelFactory.getInstance()
        val viewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]

        viewModel.setName("Adit")
        viewModel.message.observe(this, { message ->
            binding.tvWelcome.text = message.welcomeMessage
        })

    }

    override fun onDestroy() {
        super.onDestroy()
        activityMainBinding = null
    }
}