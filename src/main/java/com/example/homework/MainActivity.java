package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MessageFragment fragment = (MessageFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_detail);
        Bundle extras = getIntent().getExtras();
        String value = extras.getString("value");
        if(value !=null && fragment != null && fragment.isInLayout()){
            fragment.setMessage(value);
        }

    }
}
