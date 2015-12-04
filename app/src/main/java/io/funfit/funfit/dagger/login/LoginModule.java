package io.funfit.funfit.dagger.login;

import android.app.Activity;
import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.funfit.funfit.dagger.PerActivity;
import io.funfit.funfit.dagger.app.AppModule;
import io.funfit.funfit.ui.login.LoginFragment;

/**
 * Created by Dj on 12/4/2015.
 */
@Module
public class LoginModule {
    Activity activity;

    public LoginModule(Activity activity){
        this.activity = activity;
    }

    @Provides
    @PerActivity
    Activity provideActivity(){
        return this.activity;
    }

    @Provides
    @PerActivity
    LoginFragment loginFragment(){
        return new LoginFragment();
    }
}
