package com.example.gmaillogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Create Account Page is Loading", Toast.LENGTH_SHORT).show();
                //Intent obj1=new Intent(MainActivity.this,MainActivity2.class);
                //startActivity(obj1);
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
                // will go to second activity
            }
        });
    }
}
