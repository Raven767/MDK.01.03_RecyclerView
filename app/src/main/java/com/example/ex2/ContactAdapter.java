package com.example.ex2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {
    @Override
    public ContactAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.item_contact, parent, false);
        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contact contact = mContacts.get(position);
        // Set item views based on your views and data model
        TextView textView = holder.nameTextView;
        textView.setText(contact.getName());
        ImageView imageView = holder.fotoView;
        imageView.setImageResource(contact.getlastName());
        TextView textView1 = holder.TextView;
        textView1.setText(contact.getText());
        TextView textView2 = holder.TextView2;
        textView2.setText(contact.getText2());
        TextView textView3 = holder.TextView3;
        textView3.setText(contact.getText3());
        TextView textView4 = holder.TextView4;
        textView4.setText(contact.getText4());
    }

    public ContactAdapter(ArrayList<Contact> contacts) {
        mContacts = contacts;
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nameTextView;
        public ImageView fotoView;
        public TextView TextView;
        public TextView TextView2;
        public TextView TextView3;
        public TextView TextView4;

        public ViewHolder(View itemView) {

            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.textView_surname);
            TextView = (TextView) itemView.findViewById(R.id.textall);
            TextView2 = (TextView) itemView.findViewById(R.id.textall2);
            TextView3 = (TextView) itemView.findViewById(R.id.textall3);
            TextView4 = (TextView) itemView.findViewById(R.id.textView);
            fotoView = (ImageView) itemView.findViewById(R.id.imageView_back);
        }
    }
    private List<Contact> mContacts;
    // Pass in the contact array into the constructor
}
