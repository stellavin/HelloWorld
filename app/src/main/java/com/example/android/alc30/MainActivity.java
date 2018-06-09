package com.example.android.alc30;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doit(View v){
        Toast.makeText(this, "Hello this is my first toast", Toast.LENGTH_SHORT).show();
    }
}
