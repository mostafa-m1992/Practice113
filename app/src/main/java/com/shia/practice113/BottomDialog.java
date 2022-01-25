package com.shia.practice113;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomDialog extends BottomSheetDialogFragment {

    EditText insetName;
    Button btnOk, btnCancel;

    public BottomDialogEventListener bottomDialogEventListener;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.bottomDialogEventListener = (BottomDialogEventListener) context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.my_dialog, null, false);

        insetName = view.findViewById(R.id.insert_name);
        btnOk = view.findViewById(R.id.btn_ok);
        btnCancel = view.findViewById(R.id.btn_cancel);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomDialogEventListener.onOkButtonClicked(insetName.getText().toString().trim());
                dismiss();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomDialogEventListener.onCancelButtonClicked();
                dismiss();
            }
        });
        return view;
    }

    public interface BottomDialogEventListener{
        void onOkButtonClicked(String data);
        void onCancelButtonClicked();
    }
}
