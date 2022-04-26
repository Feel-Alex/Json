package com.example.domain.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Example(
    @SerializedName("artist")
    @Expose
    var artist: Artist? = null
)
