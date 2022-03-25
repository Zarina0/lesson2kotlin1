package com.example.lesson2kotlin1.models.location

import com.google.gson.annotations.SerializedName

data class RickAndMortyLocation(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("dimension")
    val dimension: String
)