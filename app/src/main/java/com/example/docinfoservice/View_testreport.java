package com.example.docinfoservice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.docinfoservice.FireBaseAuth.Login;
import com.google.firebase.auth.FirebaseAuth;

public class View_testreport extends AppCompatActivity {

    Button fetch;
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_testreport);

        fetch=findViewById(R.id.fetchFile);
        fetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(FirebaseAuth.getInstance().getCurrentUser()!=null) {

                    Intent inte = new Intent(View_testreport.this, MyRecyclerViewActivity.class);
                    startActivity(inte);


                }

                else{

                    Intent inten = new Intent(View_testreport.this, Login.class);
                    startActivity(inten);


                }

                }
                //startActivity(new Intent(View_testreport.this,MyRecyclerViewActivity.class));

        });


        logout = (Button) findViewById(R.id.signout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(View_testreport.this,MainActivity.class));
            }
        });


    }

}