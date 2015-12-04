package io.funfit.funfit.ui.login;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import io.funfit.funfit.R;
import io.funfit.funfit.dagger.login.DaggerLoginComponent;
import io.funfit.funfit.dagger.login.LoginComponent;
import io.funfit.funfit.dagger.login.LoginModule;
import io.funfit.funfit.ui.App;

/**
 * Created by Dj on 12/4/2015.
 */
public class LoginActivity extends AppCompatActivity{
    @Inject LoginFragment mLoginFragment;
    LoginComponent mComponent;

    LoginComponent component(){
        if(mComponent == null){
            mComponent = DaggerLoginComponent.builder()
                    .appComponent(((App) getApplication()).component())
                    .loginModule(new LoginModule(this)).build();
        }

        return mComponent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        component().inject(this);

        if(Build.VERSION.SDK_INT == 21 ){
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frag_container, mLoginFragment).commit();
        }
    }
}
