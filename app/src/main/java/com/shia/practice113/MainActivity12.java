package com.shia.practice113;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity12 extends AppCompatActivity implements BottomDialog.BottomDialogEventListener {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomDialog bottomDialog = new BottomDialog();
                bottomDialog.setCancelable(false);
                bottomDialog.show(getSupportFragmentManager(), null);
            }
        });
    }

    @Override
    public void onOkButtonClicked(String data) {
        textView.setText(data);
    }

    @Override
    public void onCancelButtonClicked() {
        Toast.makeText(getApplicationContext(), "cancel clicked", Toast.LENGTH_SHORT).show();
    }
}