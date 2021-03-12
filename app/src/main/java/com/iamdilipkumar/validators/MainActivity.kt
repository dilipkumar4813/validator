package com.iamdilipkumar.validators

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iamdilipkumar.dkvalidator.MobileNumber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileNumber("+601112223345").encryptCharacters("x",2,3)
    }
}