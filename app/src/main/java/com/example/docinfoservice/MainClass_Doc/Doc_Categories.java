package com.example.docinfoservice.MainClass_Doc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.docinfoservice.R;

public class Doc_Categories extends AppCompatActivity {

    private ListView listView;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc__categories);


        listView = (ListView) findViewById(R.id.listviewId);
        String[] Categories_Name = getResources().getStringArray(R.array.categories_name);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Doc_Categories.this,R.layout.doc_sampleview,R.id.textviewId,Categories_Name);
        listView.setAdapter(adapter);


        searchView = findViewById(R.id.searchviewId);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               if(position == 0)
               {
                   startActivity( new Intent(Doc_Categories.this, Anesthesiology.class));
               }
               else if(position == 1)
               {
                   startActivity( new Intent(Doc_Categories.this, Cancer.class));
               }

               else if(position == 2)
               {
                   startActivity( new Intent(Doc_Categories.this, Cardiology.class));
               }
               else if(position == 3)
               {
                   startActivity( new Intent(Doc_Categories.this,Cardiology.class));
               }
               else if(position == 4)
               {
                   startActivity( new Intent(Doc_Categories.this, Chest_Asthma.class));
               }
               else if(position == 5)
               {
                   startActivity( new Intent(Doc_Categories.this, Child.class));
               }

               else if(position == 6)
               {
                   startActivity( new Intent(Doc_Categories.this, Colorectal_Surgery.class));
               }
               else if(position == 7)
               {
                   startActivity( new Intent(Doc_Categories.this, Dental.class));
               }
               else if(position == 8)
               {
                   startActivity( new Intent(Doc_Categories.this, Diabetes_Hormone.class));
               }
               else if(position == 9)
               {
                   startActivity( new Intent(Doc_Categories.this, ENT.class));
               }
               else if(position == 10)
               {
                   startActivity( new Intent(Doc_Categories.this, Eye.class));
               }
               else if(position == 11)
               {
                   startActivity( new Intent(Doc_Categories.this, Gastroenterology.class));
               }
               else if(position == 12)
               {
                   startActivity( new Intent(Doc_Categories.this, Gynecology_obstetrics.class));
               }
               else if(position == 13)
               {
                   startActivity( new Intent(Doc_Categories.this, General_Surgery.class));
               }
               else if(position == 14)
               {
                   startActivity( new Intent(Doc_Categories.this, Hematology__Blood.class));
               }
               else if(position == 15)
               {
                   startActivity( new Intent(Doc_Categories.this, Infertility.class));
               }
               else if(position == 16)
               {
                   startActivity( new Intent(Doc_Categories.this, Kidney.class));
               }
               else if(position == 17)
               {
                   startActivity( new Intent(Doc_Categories.this, Laparoscopic_Surgery.class));
               }
               else if(position == 18)
               {
                   startActivity( new Intent(Doc_Categories.this, Liver.class));
               }
               else if(position == 19)
               {
                   startActivity( new Intent(Doc_Categories.this, Medicine.class));
               }
               else if(position == 20)
               {
                   startActivity( new Intent(Doc_Categories.this, Neurology.class));
               }
               else if(position == 21)
               {
                   startActivity( new Intent(Doc_Categories.this, Neuromedicine.class));
               }
               else if(position == 22)
               {
                   startActivity( new Intent(Doc_Categories.this, Neurosurgery.class));
               }
               else if(position == 23)
               {
                   startActivity( new Intent(Doc_Categories.this, Orthopedic.class));
               }
               else if(position == 24)
               {
                   startActivity( new Intent(Doc_Categories.this, Pediatric.class));
               }
               else if(position == 25)
               {
                   startActivity( new Intent(Doc_Categories.this, PlasticSurgery.class));
               }
               else if(position == 26)
               {
                   startActivity( new Intent(Doc_Categories.this, PhysicalMedicine.class));
               }
               else if(position == 27)
               {
                   startActivity( new Intent(Doc_Categories.this, Psychiatry_Mental.class));
               }
               else if(position == 28)
               {
                   startActivity( new Intent(Doc_Categories.this, Rheumatology.class));
               }
               else if(position == 29)
               {
                   startActivity( new Intent(Doc_Categories.this, Sex.class));
               }
               else if(position == 30)
               {
                   startActivity( new Intent(Doc_Categories.this, Skin.class));
               }
               else if(position == 31)
               {
                   startActivity( new Intent(Doc_Categories.this, Urology.class));
               }
               else if(position == 32)
               {
                   startActivity( new Intent(Doc_Categories.this, VascularSurgery.class));
               }

            }
        });
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        }

    }
