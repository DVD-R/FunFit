package io.funfit.funfit.ui.login;

import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.funfit.funfit.R;
import io.funfit.funfit.dagger.login.DaggerLoginComponent;
import io.funfit.funfit.dagger.login.LoginComponent;
import io.funfit.funfit.dagger.login.LoginModule;
import io.funfit.funfit.ui.App;

/**
 * Created by Dj on 12/4/2015.
 */
public class LoginActivity extends AppCompatActivity {
    @Bind(R.id.text_funfit)
    TextView mTextFunfit;
    @Bind(R.id.img_login_bg)
    ImageView mImageBg;
    @Inject
    Typeface mHelvetica;
    @Inject
    Uri mBackgroundUri;
    LoginComponent mComponent;

    LoginComponent component() {
        if (mComponent == null) {
            mComponent = DaggerLoginComponent.builder()
                    .appComponent(((App) getApplication()).component())
                    .loginModule(new LoginModule(this)).build();
        }

        return mComponent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        component().inject(this);

        if (Build.VERSION.SDK_INT == 21) {
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        mTextFunfit.setTypeface(mHelvetica);
        Glide.with(this)
                .load(mBackgroundUri)
                .centerCrop()
                .into(mImageBg);
    }
}
