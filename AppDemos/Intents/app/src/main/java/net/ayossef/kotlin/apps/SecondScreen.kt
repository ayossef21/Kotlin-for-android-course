package net.ayossef.kotlin.apps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second_screen.*

class SecondScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        // read value
        val userInput:String = intent.getStringExtra("data2") ?: "Value not found"

        // display value to textview
        userOutputTV.text = userInput
    }
}
