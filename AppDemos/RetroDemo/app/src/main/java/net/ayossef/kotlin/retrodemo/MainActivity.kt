package net.ayossef.kotlin.retrodemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import net.ayossef.kotlin.retrodemo.network.UserDH
import net.ayossef.kotlin.retrodemo.network.UsersAPIClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiClient: UsersAPIClient = UsersAPIClient.create()
        Log.d("retrodata","Connection Started ..")
        apiClient.listAllUser()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {list ->
                    list.forEach { user ->
                        Log.d("retrodata","User ${user.name} has Id:${user.id}" +
                                "and email ${user.email}")
                    }
                },
                {error ->
                    Log.e("retrodata",error.localizedMessage)
                })
        Log.d("retrodata","Connection Ended ..")

        apiClient.listAllPosts()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { list -> list.forEach { post -> Log.d("retrodata","Post title: ${post.title}") }},
                {error -> Log.e("retrodata",error.localizedMessage)})

    }

    fun buttonClick(){
        //


        //

    }
}
