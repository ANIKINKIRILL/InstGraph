package com.anikinkirill.instgraph;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MediatorLiveData;
import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;

import com.anikinkirill.instgraph.models.User;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * This class keeps track of authenticated user
 * with the meta and current user data
 * The same like in the Firebase
 */

@Singleton
public class SessionManager {

    private static final String TAG = "SessionManager";

    MediatorLiveData<User> cachedUser = new MediatorLiveData<>();

    @Inject
    public SessionManager(){}

    public void authenticateUser(final LiveData<User> source){
        cachedUser.addSource(source, new Observer<User>() {
            @Override
            public void onChanged(@Nullable User user) {
                cachedUser.setValue(user);
                cachedUser.removeSource(source);
            }
        });
    }

    public LiveData<User> getAuthUser(){
        return cachedUser;
    }

}
