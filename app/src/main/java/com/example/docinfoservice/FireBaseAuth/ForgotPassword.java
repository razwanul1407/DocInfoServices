package com.example.docinfoservice.FireBaseAuth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.docinfoservice.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotPassword extends AppCompatActivity {

    private EditText resetemail;
    private Button resetpass;
    private ProgressBar resetprogressbar;

    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        resetemail = (EditText) findViewById(R.id.resetemail);
        resetpass = (Button)findViewById(R.id.resetpass);
        resetprogressbar = (ProgressBar) findViewById(R.id.resetprogressbar);

        auth = FirebaseAuth.getInstance();
        resetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resetpassword();
            }
        });

    }

    private  void resetpassword(){

        String email = resetemail.getText().toString().trim();

        if(email.isEmpty())
        {
            resetemail.setError("Email is required!");
            resetemail.requestFocus();
            return;
        }

        resetprogressbar.setVisibility(View.VISIBLE);
        auth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {

                if(task.isSuccessful()){

                    Toast.makeText(ForgotPassword.this,"Check your email to reset your password", Toast.LENGTH_LONG).show();
                }
                else{

                    Toast.makeText(ForgotPassword.this,"Check your email to reset your password",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}