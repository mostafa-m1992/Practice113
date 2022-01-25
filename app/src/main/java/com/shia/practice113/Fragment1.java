package com.shia.practice113;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.Objects;

public class Fragment1 extends Fragment {

    public static final String EXTRA_KEY_DATA = "key";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        EditText editText = view.findViewById(R.id.editText);
        Button goTo2 = view.findViewById(R.id.goTo2);

        goTo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String data = editText.getText().toString().trim();

                Bundle bundle = new Bundle();

                bundle.putString(EXTRA_KEY_DATA, data);

                Fragment2 fragment2 = new Fragment2();
                fragment2.setArguments(bundle);

                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.myFrame, fragment2);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }
}
