package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var bike: Bike
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerBIkeComponent.create().inject(this)
//        bike = DaggerBIkeComponent.create().getBike()
        bike.drive()
    }
}