package com.example.docinfoservice.MainClass_Doc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.SearchView;

import com.example.docinfoservice.Adapter.MyAdapter_Doc;
import com.example.docinfoservice.Model.MyModel_Doc;
import com.example.docinfoservice.R;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class Psychiatry_Mental extends AppCompatActivity {

    private SearchView searchView;

    RecyclerView recyclerView;
    FirebaseFirestore db;

    private MyAdapter_Doc adapter;
    private CollectionReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psychiatry__mental);

        recyclerView = findViewById(R.id.recyclerView);

        db = FirebaseFirestore.getInstance();
        ref = db.collection("Psychiatry (Mental)");

        setUpRecyclerView();
    }

    private void setUpRecyclerView() {

        Query query = ref.orderBy("name", Query.Direction.DESCENDING);

        FirestoreRecyclerOptions<MyModel_Doc> options = new FirestoreRecyclerOptions.Builder<MyModel_Doc>()
                .setQuery(query, MyModel_Doc.class)
                .build();

        adapter = new MyAdapter_Doc(options);

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