package com.shia.practice113;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity11 extends AppCompatActivity implements MyDialog.MyDialogEventListener {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDialog myDialog = new MyDialog();
                myDialog.setCancelable(false);
                myDialog.show(getSupportFragmentManager(), null);
            }
        });
    }

    @Override
    public void onOkButtonClicked(String data) {
        textView.setText(data);
    }

    @Override
    public void onCancelButtonClicked() {
        Toast.makeText(getApplicationContext(), "cancel button cliched", Toast.LENGTH_SHORT).show();
    }
}