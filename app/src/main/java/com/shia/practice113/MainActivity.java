package com.shia.practice113;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_KEY_NAME = "fullName";

    AppCompatCheckBox androidDeveloper, uiDesign, deepLeaning;
    RadioGroup radioGroup;

    AppCompatTextView name;
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidDeveloper = findViewById(R.id.androidDeveloper);
        uiDesign = findViewById(R.id.uiDesign);
        deepLeaning = findViewById(R.id.deepLeaning);

        radioGroup = findViewById(R.id.radioGroup);

        name = findViewById(R.id.name);
        button1 = findViewById(R.id.button1);
        button2 =findViewById(R.id.button2);

        androidDeveloper.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity.this, "androidDeveloper.is checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "androidDeveloper.Is NOT Checked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        uiDesign.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity.this, "uiDesign.is checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "uiDesign.Is NOT Checked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        deepLeaning.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity.this, "deepLeaning.is checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "deepLeaning.Is NOT Checked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.gilanRasht:
                        Toast.makeText(getApplicationContext(), "gilan Rasht", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.tehran:
                        Toast.makeText(getApplicationContext(), "tehran", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.alborzKaraj:
                        Toast.makeText(getApplicationContext(), "alborzKaraj", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, EditProfile.class);
                intent1.putExtra(EXTRA_KEY_NAME, name.getText());
                startActivityForResult(intent1, 1001);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
                startActivity(intent2);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1001 && resultCode == Activity.RESULT_OK && data != null) {
            String fullName = data.getStringExtra(EXTRA_KEY_NAME);
            name.setText(fullName);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.page2:
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
                break;
            case R.id.page3:
                startActivity(new Intent(MainActivity.this, MainActivity3.class));
                break;
            case R.id.page4:
                startActivity(new Intent(MainActivity.this, MainActivity4.class));
                break;
            case R.id.page5:
                startActivity(new Intent(MainActivity.this, MainActivity5.class));
                break;
            case R.id.page6:
                startActivity(new Intent(MainActivity.this, MainActivity6.class));
                break;
            case R.id.page7:
                startActivity(new Intent(MainActivity.this, MainActivity7.class));
                break;
            case R.id.page8:
                startActivity(new Intent(MainActivity.this, MainActivity8.class));
                break;
            case R.id.page9:
                startActivity(new Intent(MainActivity.this, MainActivity9.class));
                break;
            case R.id.page10:
                startActivity(new Intent(MainActivity.this, MainActivity10.class));
                break;
            case R.id.page11:
                startActivity(new Intent(MainActivity.this, MainActivity11.class));
                break;
            case R.id.page12:
                startActivity(new Intent(MainActivity.this, MainActivity12.class));
                break;
            case R.id.page13:
                startActivity(new Intent(MainActivity.this, MainActivity13.class));
                break;
            case R.id.page14:
                startActivity(new Intent(MainActivity.this, MainActivity14.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}