package com.shia.practice113;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class MainActivity10 extends AppCompatActivity implements ContactsAdapter3.ItemEventListener {

    RecyclerView recyclerView;
    AppCompatEditText editTextContactEdit;
    AppCompatImageView imageViewContactEdit;

    ContactsAdapter3 adapter3;

    private int editingItemPosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        recyclerView = findViewById(R.id.recyclerViewContactEdit);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        adapter3 = new ContactsAdapter3(this);

        recyclerView.setAdapter(adapter3);

        editTextContactEdit = findViewById(R.id.editTextContactEdit);
        imageViewContactEdit = findViewById(R.id.imageViewContactEdit);

        imageViewContactEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextContactEdit.length()>0){
                    if (editingItemPosition>-1){
                        adapter3.updateContact(editTextContactEdit.getText().toString().trim(), editingItemPosition);
                        editingItemPosition = -1;
                        imageViewContactEdit.setImageResource(R.drawable.ic_add);
                    }else {
                        adapter3.addNewContact(editTextContactEdit.getText().toString().trim());
                        recyclerView.scrollToPosition(0);
                        //recyclerView.smoothScrollToPosition(0);
                    }
                    editTextContactEdit.setText("");
                }
            }
        });
    }

    @Override
    public void onItemClick(String fullName, int position) {
        editingItemPosition = position;
        editTextContactEdit.setText(fullName);
        imageViewContactEdit.setImageResource(R.drawable.ic_baseline_done_24);
    }
}