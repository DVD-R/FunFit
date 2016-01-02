package io.funfit.funfit.dagger.login;

import android.graphics.Typeface;

import dagger.Component;
import io.funfit.funfit.dagger.PerActivity;
import io.funfit.funfit.dagger.app.AppComponent;
import io.funfit.funfit.ui.login.LoginActivity;

/**
 * Created by Dj on 12/4/2015.
 */
@PerActivity
@Component(dependencies = AppComponent.class, modules = LoginModule.class)
public interface LoginComponent {
    void inject(LoginActivity loginActivity);
}
