package com.example.domain.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Stats(
    @SerializedName("listeners")
    @Expose
    var listeners: String? = null,
    @SerializedName("playcount")
    @Expose
    var playcount: String? = null
)