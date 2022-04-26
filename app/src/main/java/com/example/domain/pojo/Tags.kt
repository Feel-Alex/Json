package com.example.domain.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Tags(
    @SerializedName("tag")
    @Expose
    var tag: List<Tag>? = null
)