package com.wbgapp.webteam.wbgapp.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.wbgapp.webteam.wbgapp.R;
import com.wbgapp.webteam.wbgapp.structure.Account;
import com.wbgapp.webteam.wbgapp.structure.SettingManager;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void login(View view)
    {
        String name = ((TextView)findViewById(R.id.settings_registration_user)).getText().toString();
        String pw = ((TextView)findViewById(R.id.settings_registration_password)).getText().toString();
        Account acc = new Account(name);
        if (acc.login(pw)) {
            SettingManager.instance.setCurrentAccount(acc);
        }
    }
}
