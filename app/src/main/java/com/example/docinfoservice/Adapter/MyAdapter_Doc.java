package com.example.docinfoservice.Adapter;

import android.content.Context;
import android.net.Uri;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.docinfoservice.R;
import com.example.docinfoservice.Model.MyModel_Doc;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

public class MyAdapter_Doc extends FirestoreRecyclerAdapter<MyModel_Doc, MyAdapter_Doc.MyViewHolder> {

     Context mContext;

    public MyAdapter_Doc(@NonNull FirestoreRecyclerOptions<MyModel_Doc> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull MyViewHolder holder, int position, @NonNull MyModel_Doc model) {
        holder.Name.setText(model.getName());
        holder.Designation.setText(model.getDesignation());
        holder.Address.setText(String.valueOf(model.getAddress()));
        holder.Contact.setText(String.valueOf(model.getContact()));
        //holder.Call.setText(String.valueOf(model.getCall()));


        holder.Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View itemview) {

                String number = model.getContact();
                Intent callingIntent = new Intent(Intent.ACTION_DIAL);
                callingIntent.setData(Uri.parse("tel:+88"+number));
                mContext.startActivity(callingIntent);
            }
        });
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,
                parent, false);
        return new MyViewHolder(v);
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView Name;
        TextView Designation;
        TextView Address;
        TextView Contact;
        Button Call;


        public MyViewHolder(View itemView) {
            super(itemView);
            Name = itemView.findViewById(R.id.textviewId1);
            Designation = itemView.findViewById(R.id.textviewId2);
            Address = itemView.findViewById(R.id.textviewId3);
            Contact = itemView.findViewById(R.id.textviewId4);
            Call = itemView.findViewById(R.id.buttoncall);
            mContext = itemView.getContext();
        }

    }

}