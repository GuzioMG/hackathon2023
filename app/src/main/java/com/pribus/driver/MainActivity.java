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
                ImageView bottom00 = findViewById(R.id.map0);
                bottom00.setVisibility(View.INVISIBLE);
                break;
            case 1:
                ImageView bottom1 = findViewById(R.id.map1);
                bottom1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                ImageView bottom2 = findViewById(R.id.map2);
                bottom2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                ImageView bottom3 = findViewById(R.id.map3);
                bottom3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                ImageView bottom4 = findViewById(R.id.map4);
                bottom4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                ImageView bottom5 = findViewById(R.id.map5);
                bottom5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                ImageView bottom6 = findViewById(R.id.map6);
                bottom6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                ImageView bottom7 = findViewById(R.id.map7);
                bottom7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                ImageView bottom8 = findViewById(R.id.map8);
                bottom8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                ImageView bottom9 = findViewById(R.id.map9);
                bottom9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                ImageView bottom10 = findViewById(R.id.map10);
                bottom10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                ImageView bottom11 = findViewById(R.id.map11);
                bottom11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                ImageView bottom12 = findViewById(R.id.map12);
                bottom12.setVisibility(View.INVISIBLE);
            case 13:
                ImageView bottom13 = findViewById(R.id.map13);
                bottom13.setVisibility(View.INVISIBLE);
            case 14:
                ImageView bottom14 = findViewById(R.id.map14);
                bottom14.setVisibility(View.INVISIBLE);
            case 15:
                ImageView bottom15 = findViewById(R.id.map15);
                bottom15.setVisibility(View.INVISIBLE);
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