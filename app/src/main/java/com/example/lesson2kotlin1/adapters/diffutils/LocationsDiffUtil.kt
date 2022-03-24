package com.example.lesson2kotlin1.adapters.diffutils

import androidx.recyclerview.widget.DiffUtil
import com.example.lesson2kotlin1.data.remote.models.location.RickAndMortyLocation

class LocationsDiffUtil : DiffUtil.ItemCallback<RickAndMortyLocation>() {
    override fun areItemsTheSame(
        oldItem: RickAndMortyLocation,
        newItem: RickAndMortyLocation
    ) = oldItem.id == newItem.id


    override fun areContentsTheSame(
        oldItem: RickAndMortyLocation,
        newItem: RickAndMortyLocation
    ) = oldItem == newItem
}