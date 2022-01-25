package com.shia.practice113;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactsAdapter3 extends RecyclerView.Adapter<ContactsAdapter3.ContactViewHolder> {

    private ArrayList<String> contacts = new ArrayList<>();

    private ItemEventListener itemEventListener;

    public ContactsAdapter3(ItemEventListener itemEventListener) {
        this.itemEventListener = itemEventListener;
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

    public void updateContact(String fullName, int position){
        contacts.set(position, fullName);
        notifyItemChanged(position);
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
                    itemEventListener.onItemClick(fullName, getAdapterPosition());
                }
            });
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    contacts.remove(getAdapterPosition());
                    notifyItemRemoved(getAdapterPosition());
                    return false;
                }
            });
        }
    }

    public interface ItemEventListener {
        void onItemClick(String fullName, int position);
    }
}
