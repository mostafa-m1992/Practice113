package com.shia.practice113;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frameLayout2, new FragmentA());
        transaction.addToBackStack("Fragment_A");
        transaction.commit();

        Button remove = findViewById(R.id.btn_remove);
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.frameLayout2);
                if (fragment!=null) {
                    FragmentTransaction removeTransaction = getSupportFragmentManager().beginTransaction();
                    removeTransaction.remove(fragment);
                    removeTransaction.addToBackStack(null);
                    removeTransaction.commit();
                }
            }
        });
    }
}