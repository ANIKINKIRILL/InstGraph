package com.anikinkirill.instgraph.dependencyinjection.app;

import com.anikinkirill.instgraph.dependencyinjection.auth.AuthModule;
import com.anikinkirill.instgraph.dependencyinjection.auth.AuthViewModelsModule;
import com.anikinkirill.instgraph.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {
                    AuthViewModelsModule.class,
                    AuthModule.class
            }
    )
    abstract AuthActivity contributeAuthActivity();
}
