package com.example.docinfoservice.MainClass_Hos.Central_Hospital;

import android.os.Bundle;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.docinfoservice.Adapter.MyAdapter_Hos;
import com.example.docinfoservice.Model.MyModel_Hos;
import com.example.docinfoservice.R;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class Cardiology extends AppCompatActivity {

    private SearchView searchView;

    RecyclerView recyclerView;
    FirebaseFirestore db;

    private MyAdapter_Hos adapter;
    private CollectionReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hospital_model);

        recyclerView = findViewById(R.id.recyclerView);

        db = FirebaseFirestore.getInstance();
        ref = db.collection("Rajshahi Central HD Cardiology");

        setUpRecyclerView();
    }

    private void setUpRecyclerView() {

        Query query = ref.orderBy("name", Query.Direction.DESCENDING);

        FirestoreRecyclerOptions<MyModel_Hos> options = new FirestoreRecyclerOptions.Builder<MyModel_Hos>()
                .setQuery(query, MyModel_Hos.class)
                .build();

        adapter = new MyAdapter_Hos(options);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        adapter.startListening();
    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

//    @Override
//    protected void onStop() {
//        super.onStop();
//        adapter.stopListening();
//    }
}
