package com.my.plug_yash

import com.google.firebase.firestore.auth.User
import retrofit2.http.GET

//data class AnonymousUser()
//data class Info(val results: List<AnonymousUser>)
interface getAnonymousUser {

    @GET("api/?format=pretty")
    suspend fun getAnonymousUsers() : User
}