package net.ayossef.kotlin.apps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun echoAction(v: View){
        // show next screen

        val nextScreenMessage: Intent = Intent(this,SecondScreen::class.java)

        // send data to the second screen
        val userInput:String = userInputET.text.toString()

        nextScreenMessage.putExtra("data", userInput)

        startActivity(nextScreenMessage)

    }

}
