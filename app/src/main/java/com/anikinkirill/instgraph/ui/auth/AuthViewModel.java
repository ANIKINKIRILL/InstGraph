package com.anikinkirill.instgraph.ui.auth;

import android.arch.lifecycle.ViewModel;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * ViewModel for {@link AuthActivity}
 */

public class AuthViewModel extends ViewModel {

    private static final String TAG = "AuthViewModel";

    // Vars
    private Retrofit retrofit;

    @Inject
    public AuthViewModel(Retrofit retrofit){
        this.retrofit = retrofit;
    }


}
