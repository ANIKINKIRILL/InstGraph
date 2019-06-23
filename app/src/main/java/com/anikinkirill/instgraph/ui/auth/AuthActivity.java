package com.anikinkirill.instgraph.ui.auth;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.anikinkirill.instgraph.R;

import dagger.android.support.DaggerAppCompatActivity;

/**
 * Activity where user login to his Instagram account
 */

public class AuthActivity extends DaggerAppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
    }
}
