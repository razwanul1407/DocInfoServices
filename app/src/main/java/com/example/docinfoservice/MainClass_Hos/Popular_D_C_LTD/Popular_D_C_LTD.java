package com.example.docinfoservice.MainClass_Hos.Popular_D_C_LTD;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.docinfoservice.R;

public class Popular_D_C_LTD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_d_c_ltd);
    }
    public void bt(View view) {

        if(view.getId() == R.id.button1)
        {
            Intent intent = new Intent(Popular_D_C_LTD.this, Popular_Cardiology.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button2)
        {
            Intent intent = new Intent(Popular_D_C_LTD.this, Popular_Chest_Asthma.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button3)
        {
            Intent intent = new Intent(Popular_D_C_LTD.this, Popular_Child.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button4)
        {
            Intent intent = new Intent(Popular_D_C_LTD.this, Popular_ENT.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button5)
        {
            Intent intent = new Intent(Popular_D_C_LTD.this, Popular_Gastroenterology.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button6)
        {
            Intent intent = new Intent(Popular_D_C_LTD.this, Popular_General_Surgery.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button7)
        {
            Intent intent = new Intent(Popular_D_C_LTD.this, Popular_Gynecology_Obstetrics.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button8)
        {
            Intent intent = new Intent(Popular_D_C_LTD.this, Popular_Hematology_Blood.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button9)
        {
            Intent intent = new Intent(Popular_D_C_LTD.this, Popular_Kidney.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button10)
        {
            Intent intent = new Intent(Popular_D_C_LTD.this, Popular_Liver_Hepatologist.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button11)
        {
            Intent intent = new Intent(Popular_D_C_LTD.this, Popular_Medicine.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button12)
        {
            Intent intent = new Intent(Popular_D_C_LTD.this, Popular_Neurology.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.button13)
        {
            Intent intent = new Intent(Popular_D_C_LTD.this, Popular_Neurosurgery.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button14)
        {
            Intent intent = new Intent(Popular_D_C_LTD.this, Popular_Orthopedic.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button15)
        {
            Intent intent = new Intent(Popular_D_C_LTD.this, Popular_Physical_Medicine.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button16)
        {
            Intent intent = new Intent(Popular_D_C_LTD.this, Popular_Skin.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.button17)
        {
            Intent intent = new Intent(Popular_D_C_LTD.this, Popular_Urology.class);
            startActivity(intent);
        }


    }
}