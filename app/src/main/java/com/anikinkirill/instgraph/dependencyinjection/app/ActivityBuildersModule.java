package com.anikinkirill.instgraph.dependencyinjection.app;

import com.anikinkirill.instgraph.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();

}
