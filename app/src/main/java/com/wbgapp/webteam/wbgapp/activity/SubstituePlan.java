package com.wbgapp.webteam.wbgapp.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wbgapp.webteam.wbgapp.R;

public class SubstituePlan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("@strings/substitute_title");

        setContentView(R.layout.activity_substitue_plan);
    }
}
