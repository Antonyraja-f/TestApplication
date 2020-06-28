package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testapplication.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      /*  binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();*/
        setContentView(R.layout.activity_main);
        next=findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });






    }
}
