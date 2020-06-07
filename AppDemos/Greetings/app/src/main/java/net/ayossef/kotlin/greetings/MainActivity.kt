package net.ayossef.kotlin.greetings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val manager:GreetingsManager = GreetingsManager()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sayHello(v: View){
        outputTV.text = "${manager.nextGreeting()}, ${inputET.text.toString()}"
    }
}
