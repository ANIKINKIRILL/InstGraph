package com.anikinkirill.instgraph.dependencyinjection.app;

import android.arch.lifecycle.ViewModelProvider;

import com.anikinkirill.instgraph.viewmodel.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelProviderFactoryModule {

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory providerFactory);

}
