package com.shia.practice113;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Toolbar mainToolbar = view.findViewById(R.id.toolbar_main);
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        appCompatActivity.setSupportActionBar(mainToolbar);

        final MaterialCardView materialCardView = view.findViewById(R.id.card_main_text);
        materialCardView.setChecked(true);

        materialCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                materialCardView.setChecked(!materialCardView.isChecked());
            }
        });

        materialCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.fragment_main, new DetailFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        FloatingActionButton mainFab = view.findViewById(R.id.mainFab);
        mainFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(getView(), "Material Design Snack Bar", Snackbar.LENGTH_SHORT)
                        .setAction("Retry", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                            }
                        })
                        .show();
            }
        });
    }
}
