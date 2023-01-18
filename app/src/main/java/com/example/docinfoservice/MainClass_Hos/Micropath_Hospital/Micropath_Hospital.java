package com.example.docinfoservice.MainClass_Hos.Micropath_Hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.docinfoservice.MainClass_Hos.Amana_Hospital.Amana_Hospital;
import com.example.docinfoservice.MainClass_Hos.Amana_Hospital.Colorectal_Surgery;
import com.example.docinfoservice.MainClass_Hos.Amana_Hospital.Gynecology_Obstetrics;
import com.example.docinfoservice.MainClass_Hos.Amana_Hospital.Neurology;
import com.example.docinfoservice.R;

public class Micropath_Hospital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_micropath__hospital);
    }

    public void bt(View view) {

        if(view.getId() == R.id.button1)
        {
            Intent intent = new Intent(Micropath_Hospital.this, Child.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button2)
        {
            Intent intent = new Intent(Micropath_Hospital.this, ENT.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button3)
        {
            Intent intent = new Intent(Micropath_Hospital.this, Gynecology.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button4)
        {
            Intent intent = new Intent(Micropath_Hospital.this, Medicine_Rheumatology.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button5)
        {
            Intent intent = new Intent(Micropath_Hospital.this, Orthopedic.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button6)
        {
            Intent intent = new Intent(Micropath_Hospital.this, Urology.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button7)
        {
            Intent intent = new Intent(Micropath_Hospital.this, General_Surgery.class);
            startActivity(intent);
        }
    }

}