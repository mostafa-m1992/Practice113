package com.shia.practice113;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity13 extends AppCompatActivity {

    ViewPager2 viewPager2;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        viewPager2 = findViewById(R.id.viewPager);
        SlideAdapter slideAdapter = new SlideAdapter(this);
        viewPager2.setAdapter(slideAdapter);
        viewPager2.setOrientation(viewPager2.ORIENTATION_HORIZONTAL);
        viewPager2.setCurrentItem(2);

        tabLayout = findViewById(R.id.tabLayout);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("a");
                        break;
                    case 1:
                        tab.setText("b");
                        break;
                    case 2:
                        tab.setText("c");
                        break;
                    case 3:
                        tab.setText("d");
                        break;
                    case 4:
                        tab.setText("e");
                        break;
                }
            }
        });

        tabLayoutMediator.attach();
    }
}