package io.funfit.funfit.ui;

import android.app.Application;

import io.funfit.funfit.dagger.app.AppComponent;
import io.funfit.funfit.dagger.app.AppModule;
import io.funfit.funfit.dagger.app.DaggerAppComponent;

/**
 * Created by Dj on 12/4/2015.
 */
public class App extends Application{
    AppComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this)).build();
        mComponent.inject(this);
    }

    public AppComponent component(){
        return mComponent;
    }
}
