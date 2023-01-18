package com.example.docinfoservice.MainClass_Hos.Central_Hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.docinfoservice.MainClass_Hos.Al_Arafa_Hospital.Al_Arafa_Hospital;
import com.example.docinfoservice.MainClass_Hos.Al_Arafa_Hospital.Cancer;
import com.example.docinfoservice.MainClass_Hos.Al_Arafa_Hospital.Orthopedic;
import com.example.docinfoservice.R;

public class Central_Hospital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central__hospital);
    }

    public void bt(View view) {

        if (view.getId() == R.id.button1) {
            Intent intent = new Intent(Central_Hospital.this, Cardiology.class);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button2) {
            Intent intent = new Intent(Central_Hospital.this, Child.class);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button3) {
            Intent intent = new Intent(Central_Hospital.this, ENT.class);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button4) {
            Intent intent = new Intent(Central_Hospital.this, Gynecology.class);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button5) {
            Intent intent = new Intent(Central_Hospital.this, Medicine.class);
            startActivity(intent);
        }

    }

}