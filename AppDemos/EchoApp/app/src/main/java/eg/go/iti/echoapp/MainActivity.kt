package eg.go.iti.echoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun echoAction(v: View){
        var nameET:EditText = findViewById(R.id.nameETId)
        var messageTV: TextView = findViewById(R.id.messageTVId)

       messageTV.text = "Hello, ${nameET.text.toString()}"

    }
}
