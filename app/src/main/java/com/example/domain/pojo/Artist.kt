package com.example.domain.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Artist(
    @SerializedName("name")
    @Expose
    var name: String? = null,
    @SerializedName("mbid")
    @Expose
    var mbid: String? = null,
    @SerializedName("url")
    @Expose
    var url: String? = null,
    @SerializedName("image")
    @Expose
    var image: List<Image>? = null,
    @SerializedName("streamable")
    @Expose
    var streamable: String? = null,
    @SerializedName("ontour")
    @Expose
    var ontour: String? = null,
    @SerializedName("stats")
    @Expose
    var stats: Stats? = null,
    @SerializedName("similar")
    @Expose
    var similar: Similar? = null,
    @SerializedName("tags")
    @Expose
    var tags: Tags? = null,
    @SerializedName("bio")
    @Expose
    var bio: Bio? = null
)