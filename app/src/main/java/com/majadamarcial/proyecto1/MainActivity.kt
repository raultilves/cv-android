package com.majadamarcial.proyecto1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.majadamarcial.proyecto1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.iniciarServicioButton.setOnClickListener {
            val intent = Intent(this, Servicio::class.java)
            startService(intent)
        }

        binding.detenerServicioButton.setOnClickListener{
            val intent = Intent(this, Servicio::class.java)
            stopService(intent)
        }
    }
}