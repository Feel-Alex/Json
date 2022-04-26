package com.example.gateway

import com.example.domain.pojo.Artist
import com.example.domain.pojo.Artists
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServise {

    @GET(END_POINT)
    fun getArtist(
        @Query(METHOD) method: String = "artist.getInfo",
        @Query(ARTIST) artist: String = "",
        @Query(API_KEY) apiKey: String = YOUR_API_KEY,
        @Query(FORMAT) format: String = "json",
        ): Single<Artist>


    companion object {
        const val END_POINT = "2.0/"
        const val API_KEY = "api_key"
        const val METHOD = "method"
        const val ARTIST = "artist"
        const val FORMAT = "format"
        const val YOUR_API_KEY = "b54fe506966a6f95feba0cd12711a72e"
        const val SHARED_SECRET = "b54f46ee99799180c2923ac1c3b3e7f0"
    }
}

