package com.example.docinfoservice;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter_ViewData extends RecyclerView.Adapter<MyAdapter_ViewData.ViewHolder> {

    RecyclerView recyclerView;
    Context context;
    ArrayList<String> items= new ArrayList<>();
    ArrayList<String> urls = new ArrayList<>();

    public void update(String name, String url){

        items.add(name);
        urls.add(url);
        notifyDataSetChanged();
    }

    public MyAdapter_ViewData(RecyclerView recyclerView, Context context, ArrayList<String> items, ArrayList<String> urls)  {
        this.recyclerView = recyclerView;
        this.context = context;
        this.items = items;
        this.urls =urls;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.item_for_viewdata,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.NameOfFile.setText(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView NameOfFile;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            NameOfFile= itemView.findViewById(R.id.nameOfFile);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int positon = recyclerView.getChildLayoutPosition(v);
                    Intent intent= new Intent();
                    intent.setType(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(urls.get(positon)));
                    context.startActivity(intent);
                }
            });
        }
    }
}