package com.anikinkirill.instgraph;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MediatorLiveData;
import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;

import com.anikinkirill.instgraph.models.User;

import javax.inject.Inject;

/**
 * This class keeps track of authenticated user
 * with the meta and current user data
 * The same like in the Firebase
 */

public class SessionManager {

    private MediatorLiveData<User> cachedUser = new MediatorLiveData<>();

    @Inject
    public SessionManager(){}

    /**
     * Authenticate user in ServiceDesk
     * @param source   AuthApi.authenticateUser(login, password)...
     */

    public void authenticateUser(final LiveData<User> source){
        cachedUser.addSource(source, new Observer<User>() {
            @Override
            public void onChanged(@Nullable User user) {
                cachedUser.setValue(user);
                cachedUser.removeSource(source);
            }
        });
    }

    /**
     * Get current authenticated user
     * @return      current user
     */

    public LiveData<User> getAuthUser(){
        return cachedUser;
    }

}
