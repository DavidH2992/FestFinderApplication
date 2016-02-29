package com.example.x11401282.festfinderapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;


public class MapSearchActivity extends FragmentActivity implements OnInfoWindowClickListener, OnMapReadyCallback {


        private GoogleMap festMap;

        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_search);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

        @Override
        public void onMapReady (GoogleMap googleMap){
        festMap = googleMap;

        // Add a custom FestFinder marker on the specified coordinates with a title and snippet of festival date.
        LatLng tomorrowland = new LatLng(51.091482, 4.385362);
        festMap.addMarker(new MarkerOptions().position(tomorrowland).snippet("22 July - 24 July.").icon(BitmapDescriptorFactory.fromResource(R.drawable.fficon)).title("Tomorrowland"));
            festMap.moveCamera(CameraUpdateFactory.newLatLng(tomorrowland));
            festMap.setOnInfoWindowClickListener(this);
    }

    @Override
        public void onInfoWindowClick(Marker marker) {
            Toast.makeText(this, "Info window clicked",
                    Toast.LENGTH_SHORT).show();
        }
    }
}


//https://developers.google.com/maps/documentation/android-api/start