package com.example.docinfoservice.MainClass_Hos.Royal_Hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.docinfoservice.MainClass_Hos.Al_Arafa_Hospital.Al_Arafa_Hospital;
import com.example.docinfoservice.MainClass_Hos.Al_Arafa_Hospital.Cancer;
import com.example.docinfoservice.MainClass_Hos.Al_Arafa_Hospital.Cardiology;
import com.example.docinfoservice.R;

public class Royal_Hospital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_royal__hospital);
    }

    public void bt(View view) {

        if(view.getId() == R.id.button1)
        {
            Intent intent = new Intent(Royal_Hospital.this, Child.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button2)
        {
            Intent intent = new Intent(Royal_Hospital.this, Colorectal.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button3)
        {
            Intent intent = new Intent(Royal_Hospital.this, ENT.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button4)
        {
            Intent intent = new Intent(Royal_Hospital.this, Eye.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button5)
        {
            Intent intent = new Intent(Royal_Hospital.this, General_Surgeon.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button6)
        {
            Intent intent = new Intent(Royal_Hospital.this, Gynecology.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.button7)
        {
            Intent intent = new Intent(Royal_Hospital.this, Medicine.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button8)
        {
            Intent intent = new Intent(Royal_Hospital.this, Neurosurgery.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button9)
        {
            Intent intent = new Intent(Royal_Hospital.this, Orthopedic.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.button10)
        {
            Intent intent = new Intent(Royal_Hospital.this, Urology.class);
            startActivity(intent);
        }

    }

}