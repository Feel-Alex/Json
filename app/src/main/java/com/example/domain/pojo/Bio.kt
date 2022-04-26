package com.example.domain.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Bio(
    @SerializedName("links")
    @Expose
    var links: Links? = null,
    @SerializedName("published")
    @Expose
    var published: String? = null,
    @SerializedName("summary")
    @Expose
    var summary: String? = null,
    @SerializedName("content")
    @Expose
    var content: String? = null
)