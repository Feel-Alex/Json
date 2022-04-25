package com.example.domain.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Similar(
    @SerializedName("artist")
    @Expose
    var artist: List<Artists>? = null
)