package com.shia.practice113;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class MainActivity9 extends AppCompatActivity {

    RecyclerView recyclerView;
    AppCompatEditText editTextContact;
    AppCompatImageView imageViewContact;

    ContactsAdapter2 adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        recyclerView = findViewById(R.id.recyclerViewContact);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        adapter2 = new ContactsAdapter2();
        recyclerView.setAdapter(adapter2);

        editTextContact = findViewById(R.id.editTextContact);
        imageViewContact = findViewById(R.id.imageViewContact);

        imageViewContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextContact.length()>0) {
                    adapter2.addNewContact(editTextContact.getText().toString().trim());
                    //recyclerView.scrollToPosition(0);
                    recyclerView.smoothScrollToPosition(0);
                }
            }
        });
    }
}