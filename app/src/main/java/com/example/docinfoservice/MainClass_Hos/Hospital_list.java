package com.example.docinfoservice.MainClass_Hos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.docinfoservice.MainClass_Doc.Cardiology;
import com.example.docinfoservice.MainClass_Doc.Chest_Asthma;
import com.example.docinfoservice.MainClass_Doc.Child;
import com.example.docinfoservice.MainClass_Doc.Colorectal_Surgery;
import com.example.docinfoservice.MainClass_Hos.Al_Arafa_Hospital.Al_Arafa_Hospital;
import com.example.docinfoservice.MainClass_Hos.Amana_Hospital.Amana_Hospital;
import com.example.docinfoservice.MainClass_Hos.CDM_Hospital.CDM_Hospital;
import com.example.docinfoservice.MainClass_Hos.Central_Hospital.Central_Hospital;
import com.example.docinfoservice.MainClass_Hos.IBMC_Hospital.IBMC_Hospital;
import com.example.docinfoservice.MainClass_Hos.Labaid_Hospital.Labaid_Hospital;
import com.example.docinfoservice.MainClass_Hos.Medipath_Hospital.Medipath_Hospital;
import com.example.docinfoservice.MainClass_Hos.Metropolitan_Hospital.Metropolitan_Hospital;
import com.example.docinfoservice.MainClass_Hos.Micropath_Hospital.Micropath_Hospital;
import com.example.docinfoservice.MainClass_Hos.Model_Hospital.Model_Hospital;
import com.example.docinfoservice.MainClass_Hos.Popular_D_C_LTD.Popular_D_C_LTD;
import com.example.docinfoservice.MainClass_Hos.Royal_Hospital.Royal_Hospital;
import com.example.docinfoservice.MainClass_Hos.Shapla_Hospital.Shapla_Hospital;
import com.example.docinfoservice.MainClass_Hos.Sharmin_Hospital.Sharmin_Hospital;
import com.example.docinfoservice.MainClass_Hos.Zamzam_Hospital.Zamzam_Hospital;
import com.example.docinfoservice.R;
import com.example.docinfoservice.Up_testreport;

public class Hospital_list extends AppCompatActivity {

    private ListView listView;
    private SearchView searchView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_list);

        listView = (ListView) findViewById(R.id.listviewId);
        String[] List_Name = getResources().getStringArray(R.array.hospitallist_name);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Hospital_list.this,R.layout.hospital_sampleview,R.id.textviewId,List_Name);
        listView.setAdapter(adapter);


        searchView = findViewById(R.id.searchviewId);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0)
                {
                    startActivity( new Intent(Hospital_list.this, Amana_Hospital.class));
                }
                else if(position == 1)
                {
                    startActivity( new Intent(Hospital_list.this, Al_Arafa_Hospital.class));
                }
                else if(position == 2)
                {
                    startActivity( new Intent(Hospital_list.this, CDM_Hospital.class));
                }
                else if(position == 3)
                {
                    startActivity( new Intent(Hospital_list.this, IBMC_Hospital.class));
                }
                else if(position == 4)
                {
                    startActivity( new Intent(Hospital_list.this, Labaid_Hospital.class));
                }

                else if(position == 5)
                {
                    startActivity( new Intent(Hospital_list.this, Medipath_Hospital.class));
                }
                else if(position == 6)
                {
                    startActivity( new Intent(Hospital_list.this, Metropolitan_Hospital.class));
                }
                else if(position == 7)
                {
                    startActivity( new Intent(Hospital_list.this, Micropath_Hospital.class));
                }

                else if(position == 8)
                {
                    startActivity( new Intent(Hospital_list.this, Popular_D_C_LTD.class));
                }
                else if(position == 9)
                {
                    startActivity( new Intent(Hospital_list.this, Central_Hospital.class));
                }
                else if(position == 10)
                {
                    startActivity( new Intent(Hospital_list.this, Model_Hospital.class));
                }
                else if(position == 11)
                {
                    startActivity( new Intent(Hospital_list.this, Royal_Hospital.class));
                }
                else if(position == 12)
                {
                    startActivity( new Intent(Hospital_list.this, Shapla_Hospital.class));
                }
                else if(position == 13)
                {
                    startActivity( new Intent(Hospital_list.this, Sharmin_Hospital.class));
                }
                else if(position == 14)
                {
                    startActivity( new Intent(Hospital_list.this, Zamzam_Hospital.class));
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
