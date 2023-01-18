package com.example.docinfoservice.MainClass_Hos.Medipath_Hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.docinfoservice.MainClass_Hos.Royal_Hospital.Child;
import com.example.docinfoservice.MainClass_Hos.Royal_Hospital.Colorectal;
import com.example.docinfoservice.MainClass_Hos.Royal_Hospital.Eye;
import com.example.docinfoservice.MainClass_Hos.Royal_Hospital.General_Surgeon;
import com.example.docinfoservice.MainClass_Hos.Royal_Hospital.Neurosurgery;
import com.example.docinfoservice.MainClass_Hos.Royal_Hospital.Royal_Hospital;
import com.example.docinfoservice.MainClass_Hos.Royal_Hospital.Urology;
import com.example.docinfoservice.R;

public class Medipath_Hospital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medipath__hospital);
    }

    public void bt(View view) {

        if(view.getId() == R.id.button1)
        {
            Intent intent = new Intent(Medipath_Hospital.this, Cancer.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button2)
        {
            Intent intent = new Intent(Medipath_Hospital.this, Cardiology.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button3)
        {
            Intent intent = new Intent(Medipath_Hospital.this, ENT.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button4)
        {
            Intent intent = new Intent(Medipath_Hospital.this, General_Laparoscopic.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button5)
        {
            Intent intent = new Intent(Medipath_Hospital.this, Gynecology.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button6)
        {
            Intent intent = new Intent(Medipath_Hospital.this, Medicine.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.button7)
        {
            Intent intent = new Intent(Medipath_Hospital.this, Mental_Diseases.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button8)
        {
            Intent intent = new Intent(Medipath_Hospital.this, Neuromedicine.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button9)
        {
            Intent intent = new Intent(Medipath_Hospital.this, Orthopedic.class);
            startActivity(intent);
        }

    }

}