package com.example.x11401282.festfinderapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapSearchActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap festMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_search);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        festMap = googleMap;

        // Add a marker in Sydney, Australia, and move the camera.
        LatLng tomorrowland = new LatLng(51.091482, 4.385362);
        festMap.addMarker(new MarkerOptions().position(tomorrowland).title("Tomorrowland"));
        festMap.moveCamera(CameraUpdateFactory.newLatLng(tomorrowland));
    }
}




//51.091482 , 4.385362
//https://developers.google.com/maps/documentation/android-api/start