package com.example.docinfoservice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.docinfoservice.FireBaseAuth.Login;
import com.example.docinfoservice.MainClass_Doc.Doc_Categories;
import com.example.docinfoservice.MainClass_Hos.Hospital_list;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void bt(View view) {

        if(view.getId() == R.id.buttondoc)
        {
            Intent intent = new Intent(MainActivity.this, Doc_Categories.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.buttonhos)
        {
            Intent intent = new Intent(MainActivity.this, Hospital_list.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.buttonup)
        {
            if(FirebaseAuth.getInstance().getCurrentUser()!=null){

                Intent inte = new Intent(MainActivity.this, Up_testreport.class);
                startActivity(inte);

            }
            else{

                Intent inten = new Intent(MainActivity.this, Login.class);
                startActivity(inten);
            }

        }

       else if(view.getId() == R.id.buttonview)
        {
            Intent intent = new Intent(MainActivity.this,View_testreport.class);
            startActivity(intent);
        }

        else if(view.getId() == R.id.buttoncon)
        {
            Intent intent = new Intent(MainActivity.this,Contact.class);
            startActivity(intent);
        }

//        else if(view.getId() == R.id.buttoncomment)
//        {
//            Intent intent = new Intent(MainActivity.this,Comment.class);
//            startActivity(intent);
//        }
    }
}