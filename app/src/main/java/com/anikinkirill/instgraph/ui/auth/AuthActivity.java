package com.anikinkirill.instgraph.ui.auth;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.anikinkirill.instgraph.R;

import dagger.android.support.DaggerAppCompatActivity;

/**
 * Activity where user login to his Instagram account
 */

public class AuthActivity extends DaggerAppCompatActivity implements View.OnClickListener {

    // Ui components
    private Button loginButton;
    private TextView aboutApp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        init();
    }

    /**
     * Init ui components
     */

    private void init(){
        loginButton = findViewById(R.id.loginButton);
        aboutApp = findViewById(R.id.app_info_and_security);

        loginButton.setOnClickListener(this);
        aboutApp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.loginButton:{
                // Log in user
                break;
            }
            case R.id.app_info_and_security:{
                // Show detail app information
                break;
            }
        }
    }
}
