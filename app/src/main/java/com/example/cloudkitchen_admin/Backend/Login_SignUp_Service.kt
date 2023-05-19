package com.example.cloudkitchen_admin.Backend

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface Login_SignUp_Service {



    @POST("users")
    @Headers("Authorization:Bearer b830bc3148d27f8806d2d13724d60f83417bb6ef589688732f8478adce2d0712",
        "Accept:application/json", "Content-Type:application/json")
    // we have to pass a user in the body of the API to create a user along with access token
    fun createUser(@Body params: Users): Call<Users?>


}