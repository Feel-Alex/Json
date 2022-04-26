package com.example.domain.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("link")
    @Expose
    var link: Link? = null
)