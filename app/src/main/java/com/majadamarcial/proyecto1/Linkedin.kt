package com.majadamarcial.proyecto1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.majadamarcial.proyecto1.databinding.ActivityLinkedinBinding

class Linkedin : AppCompatActivity() {
    val FragmentQr = QR()
    val FragmentLink = Link()

    var qr = true
    var transaction = supportFragmentManager.beginTransaction()
    private lateinit var binding: ActivityLinkedinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLinkedinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        transaction.add(R.id.contenedorQr, FragmentQr)
        transaction.addToBackStack(null)
        transaction.commit()

        binding.cambiarButton.setOnClickListener() {
            if (qr){
                transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.contenedorQr, FragmentLink)
                transaction.addToBackStack(null)
                transaction.commit()
                qr = false
            } else {
                transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.contenedorQr, FragmentQr)
                transaction.addToBackStack(null)
                transaction.commit()
                qr = true
            }

        }
    }
}