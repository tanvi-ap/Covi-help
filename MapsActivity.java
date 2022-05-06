package edu.niu.z1906477.final_project;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.Dot;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;


import java.util.Locale;

import edu.niu.z1906477.final_project.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    private Double lat,lng;
    LocationData ld;
    String name;
    Integer boundaries[];




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        ld = new LocationData();
        Bundle extras = getIntent().getExtras();
        name = extras.getString("StateName");

        System.out.println("Name: "+name);
        name=name.substring(0,1).toUpperCase(Locale.ROOT)+name.substring(1);


      try {
          lat = ld.getLat(name);
          lng = ld.getLongitude(name);

      }
    catch(Exception e) {
        Toast.makeText(MapsActivity.this, "Incorrect state value provided!", Toast.LENGTH_LONG).show();
    }

    }//end onCreate


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;



        System.out.println("Lat lng "+lat+" "+lng);


        try {
            // Add a marker in the location and move the camera

            LatLng loc = new LatLng(lat, lng);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(loc));

            mMap.getUiSettings().setZoomControlsEnabled(true);



            // Zoom in, animating the camera.
            mMap.animateCamera(CameraUpdateFactory.zoomIn());

            // Zoom out to zoom level 10, animating with a duration of 2 seconds.
            mMap.animateCamera(CameraUpdateFactory.zoomTo(6), 2000, null);

            Polygon polygon = mMap.addPolygon(new PolygonOptions()
                    .add(new LatLng(lat-1, lng), new LatLng(lat+1, lng-2),
                            new LatLng(lat+2, lng-1), new LatLng(lat, lng))
                    .strokeColor(Color.argb(255,222,58,4))
                    .fillColor(Color.argb(255,222,58,4)));



        }

        catch(NullPointerException npe)
        {
            Toast.makeText(MapsActivity.this,"Incorrect value provided!", Toast.LENGTH_LONG).show();
        }

    }//end onMapReady



}