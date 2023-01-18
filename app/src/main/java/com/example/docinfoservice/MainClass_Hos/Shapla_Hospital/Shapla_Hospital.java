package com.example.docinfoservice.MainClass_Hos.Shapla_Hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.docinfoservice.MainClass_Hos.Al_Arafa_Hospital.Al_Arafa_Hospital;
import com.example.docinfoservice.MainClass_Hos.Al_Arafa_Hospital.Cardiology;
import com.example.docinfoservice.MainClass_Hos.Al_Arafa_Hospital.Child;
import com.example.docinfoservice.MainClass_Hos.Al_Arafa_Hospital.ENT;
import com.example.docinfoservice.MainClass_Hos.Al_Arafa_Hospital.Gynecology;
import com.example.docinfoservice.MainClass_Hos.Al_Arafa_Hospital.Medicine;
import com.example.docinfoservice.MainClass_Hos.Al_Arafa_Hospital.Orthopedic;
import com.example.docinfoservice.MainClass_Hos.Sharmin_Hospital.Sharmin_Hospital;
import com.example.docinfoservice.R;

public class Shapla_Hospital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapla__hospital);
    }

    public void bt(View view) {

        if(view.getId() == R.id.button1)
        {
            Intent intent = new Intent(Shapla_Hospital.this, Cancer.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button2)
        {
            Intent intent = new Intent(Shapla_Hospital.this, Chest.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button3)
        {
            Intent intent = new Intent(Shapla_Hospital.this, Kidney.class);
            startActivity(intent);
        }

    }
}