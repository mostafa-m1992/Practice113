package com.shia.practice113;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactViewHolder> {

    private String[] contacts = new String[20];

    public ContactsAdapter() {
        contacts[0] = "Mostafa A";
        contacts[1] = "Mostafa B";
        contacts[2] = "Mostafa C";
        contacts[3] = "Mostafa D";
        contacts[4] = "Mostafa E";
        contacts[5] = "Mostafa F";
        contacts[6] = "Mostafa G";
        contacts[7] = "Mostafa H";
        contacts[8] = "Mostafa I";
        contacts[9] = "Mostafa G";
        contacts[10] = "Mostafa K";
        contacts[11] = "Mostafa L";
        contacts[12] = "Mostafa M";
        contacts[13] = "Mostafa N";
        contacts[14] = "Mostafa O";
        contacts[15] = "Mostafa P";
        contacts[16] = "Mostafa Q";
        contacts[17] = "Mostafa R";
        contacts[18] = "Mostafa S";
        contacts[19] = "Mostafa T";

    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false);

        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.bindContact(contacts[position]);
    }

    @Override
    public int getItemCount() {
        return contacts.length;
    }


    //ViewHolder

    public class ContactViewHolder extends RecyclerView.ViewHolder{

        private TextView firstChar;
        private TextView fullNameTv;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);

            firstChar = itemView.findViewById(R.id.shape);
            fullNameTv = itemView.findViewById(R.id.tv_contact_fullName);
        }

        public void bindContact(String fullName) {
            fullNameTv.setText(fullName);
            firstChar.setText(fullName.substring(0,1));

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(), fullName, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
