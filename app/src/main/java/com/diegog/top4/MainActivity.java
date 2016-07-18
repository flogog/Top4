package com.diegog.top4;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.google.android.gms.maps.model.LatLng;

import static com.diegog.top4.R.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        Toolbar mascotaActionBar = (Toolbar) findViewById(id.top4ActionBar);
        mascotaActionBar.setSaveFromParentEnabled(true);
        //Habilita boton atras
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mascotaActionBar.setTitle("Lancaster Top 4 Locations");
        mascotaActionBar.setTitleTextColor(getResources().getColor(color.whiteColor));

    }

    public void goToHershey(View v){
        Intent location = new Intent(this, SpecificLocation.class);
        LatLng hersheyPark = new LatLng(MapConstants.HERSHEY_LAT, MapConstants.HERSHEY_LONG);
        location.putExtra(getString(string.param_location),hersheyPark);
        location.putExtra(getString(string.param_name),getString(string.hershey_name));
        location.putExtra(getString(string.param_desc),getString(string.hershey_desc));
        startActivity(location);

    }

    public void goToChocolateWorld(View v){
        Intent location = new Intent(this, SpecificLocation.class);
        LatLng chocolateWorld = new LatLng(MapConstants.CHOCOLATE_LAT, MapConstants.CHOCOLATE_LONG);
        location.putExtra(getString(string.param_location),chocolateWorld);
        location.putExtra(getString(string.param_name),getString(string.choco_name));
        location.putExtra(getString(string.param_desc),getString(string.choco_desc));
        startActivity(location);

    }

    public void goToCasino(View v){
        Intent location = new Intent(this, SpecificLocation.class);
        LatLng hwCasino = new LatLng(MapConstants.CASINO_LAT, MapConstants.CASINO_LONG);
        location.putExtra(getString(string.param_location),hwCasino);
        location.putExtra(getString(string.param_name),getString(string.casino_name));
        location.putExtra(getString(string.param_desc),getString(string.casino_desc));
        startActivity(location);

    }

    public void goToWonderland(View v){
        Intent location = new Intent(this, SpecificLocation.class);
        LatLng dutchWonderland = new LatLng(MapConstants.DUTCH_LAT, MapConstants.DUTCH_LONG);
        location.putExtra(getString(string.param_location),dutchWonderland);
        location.putExtra(getString(string.param_name),getString(string.dutch_name));
        location.putExtra(getString(string.param_desc),getString(string.dutch_desc));
        startActivity(location);

    }
}
