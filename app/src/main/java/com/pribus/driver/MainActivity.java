package com.pribus.driver;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.pribus.driver.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private int slajd = 0;

    private ActivityMainBinding binding;
    public void nextsld(View v){
        Log.i("SLAJD",""+slajd);
        switch (slajd){

            case 0:
                ImageView bottom1 = findViewById(R.id.map1);
                bottom1.setVisibility(View.INVISIBLE);
                break;
            case 1:
                ImageView bottom2 = findViewById(R.id.map2);
                bottom2.setVisibility(View.INVISIBLE);
                break;

        }
        slajd++;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //this.i = this;
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_billing, R.id.navigation_rates, R.id.navigation_routes, R.id.navigation_fleet, R.id.navigation_history)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }

}