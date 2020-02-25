package com.example.placesofinterest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_places.*

class PlacesActivity : AppCompatActivity() {

    private var places = arrayListOf<Place>()
    private var placeAdapter = PlaceAdapter(places)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_places)

        initViews()
    }

    private fun initViews(){
        rvPlaces.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        rvPlaces.adapter = placeAdapter
        for (iPlace in Place.PLACE_NAMES.indices) {
            places.add(Place(Place.PLACE_NAMES[iPlace], Place.PLACE_RES_DRAWABLE_IDS[iPlace]))
        }
        placeAdapter.notifyDataSetChanged()
    }
}
