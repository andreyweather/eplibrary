package com.example.jetpack_new


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.enkod.enkodpushlibrary.EnkodPushLibrary
import com.enkod.enkodpushlibrary.Product
import com.enkod.enkodpushlibrary.enkodConnect
import com.example.jetpack_new.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val product = Product("id1", "TS", 1, "1000","")

        enkodConnect("andrey_pogodin3").start(this)
        EnkodPushLibrary.addContact("fcm_a32_5@gmail.com")
        EnkodPushLibrary.AddToFavourite(product)

        }
    }
