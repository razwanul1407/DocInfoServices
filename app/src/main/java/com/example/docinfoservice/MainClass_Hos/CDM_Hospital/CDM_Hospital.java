package com.example.docinfoservice.MainClass_Hos.CDM_Hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.docinfoservice.MainClass_Doc.Anesthesiology;
import com.example.docinfoservice.R;

public class CDM_Hospital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cdm_hospital);

    }
    public void bt(View view) {

        if(view.getId() == R.id.button1)
        {
            Intent intent = new Intent(CDM_Hospital.this, Anesthesiology.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button2)
        {
            Intent intent = new Intent(CDM_Hospital.this, Cardiology.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button3)
        {
            Intent intent = new Intent(CDM_Hospital.this, Gynecology_Obstetrics.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button4)
        {
            Intent intent = new Intent(CDM_Hospital.this, Medicine.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button5)
        {
            Intent intent = new Intent(CDM_Hospital.this, Neuromedicine.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button6)
        {
            Intent intent = new Intent(CDM_Hospital.this, Nephrology.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button7)
        {
            Intent intent = new Intent(CDM_Hospital.this, Neurosurgery.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button8)
        {
            Intent intent = new Intent(CDM_Hospital.this, Oncology.class);
            startActivity(intent);
        }

    }
}
