package net.ayossef.kotlin.retrodemo.network

import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface UsersAPIClient {

    @GET("users")
    fun listAllUser():Observable<List<UserDH>>

    @GET("posts")
    fun listAllPosts():Observable<List<PostDH>>

    companion object{
        fun create():UsersAPIClient{
            val retroBuilder = Retrofit.Builder()
            retroBuilder.addConverterFactory(GsonConverterFactory.create())
            retroBuilder.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            retroBuilder.baseUrl("https://jsonplaceholder.typicode.com/")
            return retroBuilder.build().create(UsersAPIClient::class.java)
        }
    }
}