package com.example.docinfoservice.MainClass_Hos.Metropolitan_Hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.docinfoservice.R;

public class Metropolitan_Hospital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metropolitan_hospital);
    }
    public void bt(View view) {

        if(view.getId() == R.id.button1)
        {
            Intent intent = new Intent(Metropolitan_Hospital.this, Metropolitan_Cancer.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button2)
        {
            Intent intent = new Intent(Metropolitan_Hospital.this, Metropolitan_Cardiology.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button3)
        {
            Intent intent = new Intent(Metropolitan_Hospital.this, Metropolitan_Child.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button4)
        {
            Intent intent = new Intent(Metropolitan_Hospital.this, Metropolitan_General_Surgery.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button5)
        {
            Intent intent = new Intent(Metropolitan_Hospital.this, Metropolitan_Dental.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button6)
        {
            Intent intent = new Intent(Metropolitan_Hospital.this, Metropolitan_Eye.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button7)
        {
            Intent intent = new Intent(Metropolitan_Hospital.this, Metropolitan_General_Surgery.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button8)
        {
            Intent intent = new Intent(Metropolitan_Hospital.this, Metropolitan_Gynecology_Obstetrics.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button9)
        {
            Intent intent = new Intent(Metropolitan_Hospital.this, Metropolitan_Laparoscopic_Surgery.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button10)
        {
            Intent intent = new Intent(Metropolitan_Hospital.this, Metropolitan_Medicine.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button11)
        {
            Intent intent = new Intent(Metropolitan_Hospital.this, Metropolitan_Orthopedic.class);
            startActivity(intent);
        }

    }
}