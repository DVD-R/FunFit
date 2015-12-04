package io.funfit.funfit.dagger.app;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import io.funfit.funfit.ui.App;

/**
 * Created by Dj on 12/4/2015.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(App Application);

    Application application();
}
