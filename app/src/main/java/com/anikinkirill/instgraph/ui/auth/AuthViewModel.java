package com.anikinkirill.instgraph.ui.auth;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.anikinkirill.instgraph.models.User;
import com.anikinkirill.instgraph.network.auth.AuthApi;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * ViewModel for {@link AuthActivity}
 */

public class AuthViewModel extends ViewModel {

    private static final String TAG = "AuthViewModel";

    // Vars
    private AuthApi authApi;

    @Inject
    public AuthViewModel(AuthApi authApi){
        this.authApi = authApi;
    }

    public void getAuthUserData(String access_token){
        Log.d(TAG, "getAuthUserData: " + authApi.getAuthUserData(access_token).request().url().toString());
        authApi.getAuthUserData(access_token).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                Log.d(TAG, "onResponse: called");
                Log.d(TAG, "onResponse: " + response.body().getData().getId());
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.d(TAG, "onFailure: called " + t.getMessage());
            }
        });
    }

}
