package com.example.gateway

import com.example.domain.pojo.Artist
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServise {

    @GET(END_POINT)
    fun getArtist(
        @Query(API_KEY) apiKey: String = "b54fe506966a6f95feba0cd12711a72e",
        @Query(METHOD) method: String = "",
        @Query(ARTIST) artist: String = ""
        ): Single<Artist>


    companion object {
        const val END_POINT = "2.0/"
        const val API_KEY = "api_key"
        const val METHOD = "method"
        const val ARTIST = "artist"
        const val YOUR_API_KEY = "b54fe506966a6f95feba0cd12711a72e"
        const val SHARED_SECRET = "b54f46ee99799180c2923ac1c3b3e7f0"
    }
}

