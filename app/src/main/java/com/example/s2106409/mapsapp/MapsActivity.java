package com.example.s2106409.mapsapp;

import android.graphics.Bitmap;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity {
    Marker correctCity;
    Marker tokyo;
    Marker hongkong;
    Marker northpole;
    Marker london;
    Marker rome;
    public void setCorrectCity(Marker correctCity) {
    }

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.


    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #mMap} is not null.
     * <p/>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p/>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }


    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near Africa.
     * <p/>
     * This should only be called once and when we are sure that {@link #mMap} is not null.
     */
    private void setUpMap() {
        tokyo = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(0, 36))
                .title("tokyo")
                .snippet("A place with a lot of sushi!")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.sushi)));
        hongkong = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(60, 130))
                .title("hongkong")
                .snippet("A city with octopus cards!")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.octopuscard)));
        northpole = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(65, -145))
                .title("northpole")
                .snippet("Where Santa lives!")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.northpolealaska)));
        london = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(50, -7))
                .title("london")
                .snippet("The queen lives here!")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.buckinghampalace)));
        rome = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(38, 15))
                .title("rome")
                .snippet("The city of seven hills!")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rome)));






    }
}
