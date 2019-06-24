package com.anikinkirill.instgraph.ui.auth;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.LiveDataReactiveStreams;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.anikinkirill.instgraph.SessionManager;
import com.anikinkirill.instgraph.models.Meta;
import com.anikinkirill.instgraph.models.User;
import com.anikinkirill.instgraph.network.auth.AuthApi;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
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
        LiveData<User> source = LiveDataReactiveStreams.fromPublisher(authApi.getAuthUserData(access_token)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .onErrorReturn(new Function<Throwable, User>() {
                    @Override
                    public User apply(Throwable throwable) throws Exception {
                        User errorUser = new User();
                        errorUser.setMeta(new Meta(400));
                        return errorUser;
                    }
                })
                .map(new Function<User, User>() {
                    @Override
                    public User apply(User user) {
                        return user;
                    }
                })
        );
    }

}
