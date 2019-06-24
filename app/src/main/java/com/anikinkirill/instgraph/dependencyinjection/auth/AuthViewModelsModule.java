package com.anikinkirill.instgraph.dependencyinjection.auth;


import android.arch.lifecycle.ViewModel;

import com.anikinkirill.instgraph.ui.auth.AuthViewModel;
import com.anikinkirill.instgraph.viewmodel.ViewModelKey;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    abstract ViewModel bindAuthViewModel(AuthViewModel authViewModel);

}
