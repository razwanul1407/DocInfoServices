package com.example.docinfoservice.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.docinfoservice.Model.MyModel_Doc;
import com.example.docinfoservice.Model.MyModel_Hos;
import com.example.docinfoservice.R;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

public class MyAdapter_Hos extends FirestoreRecyclerAdapter<MyModel_Hos, MyAdapter_Hos.MyViewHolder> {
    Context mContext;

    public MyAdapter_Hos(@NonNull FirestoreRecyclerOptions<MyModel_Hos> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull MyViewHolder holder, int position, @NonNull MyModel_Hos model) {
        holder.Name.setText(model.getName());
        holder.Designation.setText(model.getDesignation());
        holder.Speciality.setText(model.getSpeciality());
        holder.Chamber.setText(model.getChamber());
        holder.Address.setText(String.valueOf(model.getAddress()));
        holder.Visiting_hour.setText(model.getVisiting_hour());
        holder.Appointment.setText(String.valueOf(model.getAppointment()));

        holder.Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View itemview) {

                String number = model.getAppointment();
                Intent callingIntent = new Intent(Intent.ACTION_DIAL);
                callingIntent.setData(Uri.parse("tel:+88"+number));
                mContext.startActivity(callingIntent);
            }
        });
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hos,
                parent, false);
        return new MyViewHolder(v);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView Name;
        TextView Designation;
        TextView Speciality;
        TextView Chamber;
        TextView Address;
        TextView Visiting_hour;
        TextView Appointment;
        Button Call;

        public MyViewHolder(View itemView) {
            super(itemView);
            Name = itemView.findViewById(R.id.textId1);
            Designation = itemView.findViewById(R.id.textId2);
            Speciality = itemView.findViewById(R.id.textId3);
            Chamber = itemView.findViewById(R.id.textId4);
            Address = itemView.findViewById(R.id.textId5);
            Visiting_hour = itemView.findViewById(R.id.textId6);
            Appointment = itemView.findViewById(R.id.textId7);
            Call = itemView.findViewById(R.id.buttoncall);
            mContext = itemView.getContext();
        }
    }
}
