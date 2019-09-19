package com.example.testrecycler;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PreviewActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String family = intent.getStringExtra("family");
        String age = intent.getStringExtra("age");
        String mail = intent.getStringExtra("mail");


        final TextView txtname = findViewById(R.id.txtname);
        final TextView txtfamily = findViewById(R.id.txtfamily);
        final TextView txtage = findViewById(R.id.txtage);
        final TextView txtmail = findViewById(R.id.txtmail);
        Button btnsave = findViewById(R.id.btnsave);
        Button btnedit = findViewById(R.id.btnedit);
        txtname.setText(name);
        txtfamily.setText(family);
        txtage.setText(age);
        txtmail.setText(mail);


        btnedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = txtname.getText().toString();
                Intent intent1 = new Intent();
                intent1.putExtra("name",name);

                String family = txtfamily.getText().toString();
                intent1.putExtra("family",family);

                String age = txtage.getText().toString();
                intent1.putExtra("age",age);

                String mail = txtmail.getText().toString();
                intent1.putExtra("mail",mail);

                setResult(Activity.RESULT_OK,intent1);
                finish();


            }
        });
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String name = txtname.getText().toString();
            String family = txtfamily.getText().toString();
            String age = txtage.getText().toString();
            String mail = txtmail.getText().toString();
            PreferenceManager.getDefaultSharedPreferences(PreviewActivity.this).edit().putString("name",name).apply();
                PreferenceManager.getDefaultSharedPreferences(PreviewActivity.this).edit().putString("family",name).apply();
                PreferenceManager.getDefaultSharedPreferences(PreviewActivity.this).edit().putString("age",name).apply();
                PreferenceManager.getDefaultSharedPreferences(PreviewActivity.this).edit().putString("mail",name).apply();

                Toast.makeText(PreviewActivity.this,null,Toast.LENGTH_LONG).show();
            }
        });

    }


}

