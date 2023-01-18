package com.example.docinfoservice.MainClass_Hos.IBMC_Hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.docinfoservice.R;

public class IBMC_Hospital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ibmc_hospital);
    }
    public void bt(View view) {

        if(view.getId() == R.id.button1)
        {
            Intent intent = new Intent(IBMC_Hospital.this, Cardiac_Surgery.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button2)
        {
            Intent intent = new Intent(IBMC_Hospital.this, Cardiology.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button3)
        {
            Intent intent = new Intent(IBMC_Hospital.this, Child.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button4)
        {
            Intent intent = new Intent(IBMC_Hospital.this, Dental.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button5)
        {
            Intent intent = new Intent(IBMC_Hospital.this, ENT.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button6)
        {
            Intent intent = new Intent(IBMC_Hospital.this, Eye.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button7)
        {
            Intent intent = new Intent(IBMC_Hospital.this, Gastroenterology.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button8)
        {
            Intent intent = new Intent(IBMC_Hospital.this, Laparoscopic_Surgery.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button9)
        {
            Intent intent = new Intent(IBMC_Hospital.this, Medicine.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button10)
        {
            Intent intent = new Intent(IBMC_Hospital.this, Neurology.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button11)
        {
            Intent intent = new Intent(IBMC_Hospital.this, Neuromedicine.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button12)
        {
            Intent intent = new Intent(IBMC_Hospital.this, Orthopedic.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.button13)
        {
            Intent intent = new Intent(IBMC_Hospital.this, Pediatric.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button14)
        {
            Intent intent = new Intent(IBMC_Hospital.this, Plastic_Surgery.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button15)
        {
            Intent intent = new Intent(IBMC_Hospital.this, Skin.class);
            startActivity(intent);
        }

    }
}