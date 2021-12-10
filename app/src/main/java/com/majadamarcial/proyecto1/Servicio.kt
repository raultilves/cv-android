package com.majadamarcial.proyecto1

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.widget.Toast
import java.util.logging.Logger

class Servicio : Service() {

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Toast.makeText(this, "Mi servicio está corriendo!", Toast.LENGTH_LONG).show();
        println("Mi servicio está corriendo")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        Toast.makeText(this, "RIP mi servicio :(", Toast.LENGTH_LONG).show();
        println("RIP mi servicio")
        super.onDestroy()
    }
}