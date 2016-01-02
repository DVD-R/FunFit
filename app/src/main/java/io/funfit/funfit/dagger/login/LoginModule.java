package io.funfit.funfit.dagger.login;

import android.app.Activity;
import android.app.Application;
import android.graphics.Typeface;
import android.net.Uri;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.funfit.funfit.dagger.PerActivity;

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
    Typeface helveticaFace(){
        return Typeface.createFromAsset(activity.getAssets(), "HelveticaBold.otf");
    }

    @Provides
    @PerActivity
    Uri backgroundUri(){
        return Uri.parse("http://djunabel.com/images/pics/554_djuna-bel-nike-db8.jpg");
    }
}
