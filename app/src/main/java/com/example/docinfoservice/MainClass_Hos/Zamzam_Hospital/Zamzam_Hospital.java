package com.example.docinfoservice.MainClass_Hos.Zamzam_Hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.docinfoservice.MainClass_Hos.Al_Arafa_Hospital.Al_Arafa_Hospital;
import com.example.docinfoservice.MainClass_Hos.Al_Arafa_Hospital.Cancer;
import com.example.docinfoservice.MainClass_Hos.Al_Arafa_Hospital.Cardiology;
import com.example.docinfoservice.MainClass_Hos.Al_Arafa_Hospital.ENT;
import com.example.docinfoservice.R;

public class Zamzam_Hospital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zamzam__hospital);
    }

    public void bt(View view) {

        if(view.getId() == R.id.button1)
        {
            Intent intent = new Intent(Zamzam_Hospital.this, Child.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button2)
        {
            Intent intent = new Intent(Zamzam_Hospital.this, Eye.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button3)
        {
            Intent intent = new Intent(Zamzam_Hospital.this, Gynecology.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button4)
        {
            Intent intent = new Intent(Zamzam_Hospital.this, Medicine.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button5)
        {
            Intent intent = new Intent(Zamzam_Hospital.this, Medicine_Rheumatology.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button6)
        {
            Intent intent = new Intent(Zamzam_Hospital.this, Neurology.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.button7)
        {
            Intent intent = new Intent(Zamzam_Hospital.this, Orthopedic.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.button8)
        {
            Intent intent = new Intent(Zamzam_Hospital.this, Piles_Fistula_Colorectal.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.button9)
        {
            Intent intent = new Intent(Zamzam_Hospital.this, Urology.class);
            startActivity(intent);
        }

    }

}