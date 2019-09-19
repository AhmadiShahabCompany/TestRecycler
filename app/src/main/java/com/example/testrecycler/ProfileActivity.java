package com.example.testrecycler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        final EditText edtfamily = findViewById(R.id.edtfamily);
        final EditText edtage = findViewById(R.id.edtage);
        final EditText edtmail = findViewById(R.id.edtmail);
        final EditText edtname = findViewById(R.id.edtname);
        Button btnpreview = findViewById(R.id.btnpreview);
        btnpreview .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           Intent i = new Intent(ProfileActivity.this,PreviewActivity.class);
                String name = edtname.getText().toString();
                i.putExtra("name",name);
                String family = edtfamily.getText().toString();
                i.putExtra("family",family);
                String mail = edtmail.getText().toString();
                i.putExtra("mail",mail);
                String age = edtage.getText().toString();
                i.putExtra("age",age);
                startActivityForResult(i,1234);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1234){
            if (resultCode == Activity.RESULT_OK){
                String name = data.getStringExtra("name");
                String family = data.getStringExtra("family");
                String age = data.getStringExtra("age");
                String mail = data.getStringExtra("mail");


            }
        }
    }
}
