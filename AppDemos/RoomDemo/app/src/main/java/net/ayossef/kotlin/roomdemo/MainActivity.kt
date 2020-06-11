package net.ayossef.kotlin.roomdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import net.ayossef.kotlin.roomdemo.data.AppDatabase
import net.ayossef.kotlin.roomdemo.data.User
import net.ayossef.kotlin.roomdemo.data.UserDAO

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user1 = User(1,"Seba3y","ali@mail.com")
        val userDao = AppDatabase.getAppDataBase(this)!!.getUserDao()
        userDao.addUser(user1)
        val userFromDB = userDao.allUser().get(0)
        Log.d("db_test","name is ${userFromDB.name}")
        textView.text = "Fisrt User from DB is: ${userFromDB.name}"

    }
}
