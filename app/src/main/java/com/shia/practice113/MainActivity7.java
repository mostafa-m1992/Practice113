package com.shia.practice113;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity7 extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_main, new MainFragment());
        transaction.commit();

        bottomNavigationView = findViewById(R.id.bottomNavigation);

        /*bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fragment_main, new MainFragment());
                        transaction.commit();
                        break;
                    case R.id.recent:
                        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                        transaction1.replace(R.id.fragment_main, new RecentFragment());
                        transaction1.commit();
                        break;
                    case R.id.nearby:
                        FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                        transaction2.replace(R.id.fragment_main, new NearbyFragment());
                        transaction2.commit();
                        break;
                }
                return true;
            }
        });*/

        /*bottomNavigationView.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                switch (view.getId()) {
                    case R.id.home:
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fragment_main, new MainFragment());
                        transaction.commit();
                        break;
                    case R.id.recent:
                        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                        transaction1.replace(R.id.fragment_main, new RecentFragment());
                        transaction1.commit();
                        break;
                    case R.id.nearby:
                        FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                        transaction2.replace(R.id.fragment_main, new NearbyFragment());
                        transaction2.commit();
                        break;
                }

                return true;
            }
        });*/

        /*bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home:
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fragment_main, new MainFragment());
                        transaction.commit();
                        break;
                    case R.id.recent:
                        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                        transaction1.replace(R.id.fragment_main, new RecentFragment());
                        transaction1.commit();
                        break;
                    case R.id.nearby:
                        FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                        transaction2.replace(R.id.fragment_main, new NearbyFragment());
                        transaction2.commit();
                        break;
                }

                return true;
            }
        });*/

        /*bottomNavigationView.setOnItemSelectedListener(item -> {

            if (item.getItemId() == R.id.home){
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_main, new MainFragment());
                transaction.commit();
            } else if (item.getItemId() == R.id.recent) {
                FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                transaction1.replace(R.id.fragment_main, new RecentFragment());
                transaction1.commit();
            } else if (item.getItemId() == R.id.nearby) {
                FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                transaction2.replace(R.id.fragment_main, new NearbyFragment());
                transaction2.commit();
            }
            return true;
        });*/

        /*bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()) {
                case R.id.home:
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.fragment_main, new MainFragment());
                    transaction.commit();
                    break;
                case R.id.recent:
                    FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                    transaction1.replace(R.id.fragment_main, new RecentFragment());
                    transaction1.commit();
                    break;
                case R.id.nearby:
                    FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                    transaction2.replace(R.id.fragment_main, new NearbyFragment());
                    transaction2.commit();
                    break;
            }

            return true;
        });*/

        /*bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home:
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fragment_main, new MainFragment());
                        transaction.commit();
                        break;
                    case R.id.recent:
                        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                        transaction1.replace(R.id.fragment_main, new RecentFragment());
                        transaction1.commit();
                        break;
                    case R.id.nearby:
                        FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                        transaction2.replace(R.id.fragment_main, new NearbyFragment());
                        transaction2.commit();
                        break;
                }

                return true;
            }
        });*/

        /*bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fragment_main, new MainFragment());
                        transaction.commit();
                        break;
                    case R.id.recent:
                        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                        transaction1.replace(R.id.fragment_main, new RecentFragment());
                        transaction1.commit();
                        break;
                    case R.id.nearby:
                        FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                        transaction2.replace(R.id.fragment_main, new NearbyFragment());
                        transaction2.commit();
                        break;
                }
            }
        });*/

        /*bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home:
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.fragment_main, new MainFragment());
                    transaction.commit();
                    break;
                    case R.id.recent:
                        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                        transaction1.replace(R.id.fragment_main, new RecentFragment());
                        transaction1.commit();
                        break;
                    case R.id.nearby:
                        FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                        transaction2.replace(R.id.fragment_main, new NearbyFragment());
                        transaction2.commit();
                        break;
                }
                return true;
            }
        });*/

        //bottomNavigationView.setSelectedItemId(R.id.home);
    }
}