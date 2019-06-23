package com.anikinkirill.instgraph.ui.auth;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.anikinkirill.instgraph.R;

import dagger.android.support.DaggerAppCompatActivity;

/**
 * Activity where user login to his Instagram account
 */

public class AuthActivity extends DaggerAppCompatActivity implements View.OnClickListener, AuthenticationListener{

    private static final String TAG = "AuthActivity";

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
                AuthenticationDialog dialog = new AuthenticationDialog(this, this);
                dialog.setCancelable(true);
                dialog.show();
                break;
            }
            case R.id.app_info_and_security:{
                // Show detail app information
                break;
            }
        }
    }

    @Override
    public void onTokenReceived(String auth_token) {
        Log.d(TAG, "onTokenReceived: " + auth_token);
    }
}
