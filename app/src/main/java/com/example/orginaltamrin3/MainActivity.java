package com.example.orginaltamrin3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputdata = findViewById(R.id.edt_password);
        Button sendData = findViewById(R.id.button_login);

        sendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string Data = inputdata.getText().toString();
                Intent intent = new Intent(MainActivity.this,Profile.class);
                intent.putExtra("profile.Key_Data,Data);
                startActivities(intent);


            }
        });


        });
    }
}