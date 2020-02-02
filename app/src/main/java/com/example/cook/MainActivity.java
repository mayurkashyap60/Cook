package com.example.cook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void forwardNext(View view) {

        Button btn = (Button) findViewById(R.id.home_btn);
        Intent intent = new Intent(this, GoodEvening.class);
        startActivity(intent);

    }
}
