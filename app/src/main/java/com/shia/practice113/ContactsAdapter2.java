package com.shia.practice113;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactsAdapter2 extends RecyclerView.Adapter<ContactsAdapter2.ContactViewHolder> {

    private ArrayList<String> contacts = new ArrayList<>();

    public ContactsAdapter2() {
        contacts.add("Mostafa A");
        contacts.add("Mostafa B");
        contacts.add("Mostafa C");
        contacts.add("Mostafa D");
        contacts.add("Mostafa E");
        contacts.add("Mostafa F");
        contacts.add("Mostafa G");
        contacts.add("Mostafa H");
        contacts.add("Mostafa I");
        contacts.add("Mostafa G");
        contacts.add("Mostafa K");
        contacts.add("Mostafa L");
        contacts.add("Mostafa M");
        contacts.add("Mostafa N");
        contacts.add("Mostafa O");
        contacts.add("Mostafa P");
        contacts.add("Mostafa Q");
        contacts.add("Mostafa R");
        contacts.add("Mostafa S");
        contacts.add("Mostafa T");
    }

    public void addNewContact(String fullName){
        contacts.add(0, fullName);
        notifyItemInserted(0);
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact2, parent, false);

        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.bindContact(contacts.get(position));
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {

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
