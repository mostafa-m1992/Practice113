package com.shia.practice113;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditProfile extends AppCompatActivity {

    AppCompatEditText editText;
    Button doneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        editText = findViewById(R.id.editText);
        doneButton = findViewById(R.id.doneButton);

        String fullName = getIntent().getStringExtra(MainActivity.EXTRA_KEY_NAME);
        editText.setText(fullName);

        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullName = editText.getText().toString().trim();
                Intent intent1 = new Intent();
                intent1.putExtra(MainActivity.EXTRA_KEY_NAME, fullName);
                setResult(Activity.RESULT_OK, intent1);
                finish();
            }
        });
    }
}