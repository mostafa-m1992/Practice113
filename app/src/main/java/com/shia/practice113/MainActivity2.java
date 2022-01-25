package com.shia.practice113;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView = findViewById(R.id.imageView1);

        Picasso.get().load(R.drawable.flower16).into(imageView);
        Picasso.get().load("https://resi.ze-robot.com/dl/4k/4k-desktop-wallpaper.-1920%C3%971200.jpg")
                .placeholder(R.drawable.flower16)
                .error(R.drawable.profile4)
                .into(imageView);
    }
}