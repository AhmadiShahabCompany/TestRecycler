package com.example.testrecycler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dial);

        final EditText edinumber = findViewById(R.id.edtnumber);
        Button btncall = findViewById(R.id.btncall);
      btncall.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String S = edinumber.getText().toString();

            Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+S));
            startActivity(i);
          }
      });
    }
}
