package com.example.gmaillogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    Button b1;
    CheckBox c1;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=findViewById(R.id.button);
        c1=findViewById(R.id.checkBox);
        e1=findViewById(R.id.pass);
        e2=findViewById(R.id.confirmpass);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });

        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    e1.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    e2.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                else
                {
                    e1.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    e2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
    }
}