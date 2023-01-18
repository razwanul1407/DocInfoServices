package com.example.docinfoservice;


import android.Manifest;
import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.common.base.MoreObjects;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.util.HashMap;
import java.util.Map;

public class Up_testreport extends AppCompatActivity {

    Button selectfile, upload;
    TextView notification;
    Uri pdfUri;

    FirebaseStorage storage;
    FirebaseDatabase database;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_up_testreport);

        storage=FirebaseStorage.getInstance();
        database=FirebaseDatabase.getInstance();

        selectfile=findViewById(R.id.selectfile);
        upload=findViewById(R.id.upload);
        notification=findViewById(R.id.notification);

        selectfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(Up_testreport.this, Manifest.permission.READ_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED)
                {
                    selectpdf();
                }
                else
                    ActivityCompat.requestPermissions(Up_testreport.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},5);
            }
        });

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pdfUri!=null)
                uploadFile(pdfUri);
                else
                    Toast.makeText(Up_testreport.this,"Please select file",Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void uploadFile(Uri pdfUri) {

        progressDialog =new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploding file... ");
        progressDialog.setProgress(0);
        progressDialog.show();


        final String filename = System.currentTimeMillis()+".pdf";
        final String filename1 = System.currentTimeMillis()+"";
        StorageReference storageReference = storage.getReference();
        StorageReference ref= storageReference.child("Uploads").child(filename);
                ref.putFile(pdfUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                            @Override
                            public void onSuccess(Uri uri) {

                                String url = uri.toString();

                                DatabaseReference reference= database.getReference();
                                reference.child(filename1).setValue(url).addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        if(task.isSuccessful()) {
                                            Toast.makeText(Up_testreport.this, "File successfully uploaded", Toast.LENGTH_SHORT).show();

                                        }
                                        else
                                            Toast.makeText(Up_testreport.this,"File not successfully uploaded",Toast.LENGTH_SHORT).show();
                                    }
                                });
                            }
                        });

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                        Toast.makeText(Up_testreport.this,"File not successfully uploaded",Toast.LENGTH_SHORT).show();
                    }
                }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onProgress(@NonNull UploadTask.TaskSnapshot snapshot) {

                        int currentprogress = (int) (100*snapshot.getBytesTransferred()/snapshot.getTotalByteCount());
                        progressDialog.setProgress(currentprogress);
                    }
                });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 5 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectpdf();
        } else
            Toast.makeText(Up_testreport.this, "Please provide Permission...", Toast.LENGTH_SHORT).show();
    }

    private void selectpdf() {

        Intent intent = new Intent();
        intent.setType("application/pdf");
        //intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent,20);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==20 && resultCode==RESULT_OK && data!=null)
        {
            pdfUri=data.getData();
            notification.setText("A File Is Selected: "+data.getData().getLastPathSegment());
        }
        else
            Toast.makeText(Up_testreport.this, "Please select a file", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
    }

}