package com.example.orginaltamrin3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity{
    public static final string Key_Data = "inputdata"
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        TextView textView = findViewById(R.id.your_password);
        Bundle bundle = getIntent().getExtras()
        Intent intent = getIntent();
        intent.getExtras().getString();


        if (bundle !=null){
            textView.setText(bundle.getstring(Key_Data));
        }




    }
}
