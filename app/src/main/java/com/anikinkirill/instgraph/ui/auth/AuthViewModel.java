package com.anikinkirill.instgraph.ui.auth;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.anikinkirill.instgraph.SessionManager;
import com.anikinkirill.instgraph.models.User;
import com.anikinkirill.instgraph.network.auth.AuthApi;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * ViewModel for {@link AuthActivity}
 */

public class AuthViewModel extends ViewModel {

    private static final String TAG = "AuthViewModel";

    // Injections
    private AuthApi authApi;
    private SessionManager sessionManager;

    @Inject
    public AuthViewModel(AuthApi authApi, SessionManager sessionManager){
        this.authApi = authApi;
        this.sessionManager = sessionManager;
    }

    public void getAuthUserData(String access_token){
        Log.d(TAG, "getAuthUserData: " + authApi.getAuthUserData(access_token).request().url().toString());
        authApi.getAuthUserData(access_token).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                Log.d(TAG, "onResponse: called");
                MutableLiveData<User> source = new MutableLiveData<>();
                source.setValue(response.body());
                sessionManager.authenticateUser(source);
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.d(TAG, "onFailure: called " + t.getMessage());
            }
        });
    }

}
