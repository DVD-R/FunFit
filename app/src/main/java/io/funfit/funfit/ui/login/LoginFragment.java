package io.funfit.funfit.ui.login;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.funfit.funfit.R;

/**
 * Created by Dj on 12/5/2015.
 */
public class LoginFragment extends Fragment {
    @Bind(R.id.text_funfit)
    TextView mTextFunfit;
    @Bind(R.id.img_login_bg)
    ImageView mImageBg;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ((LoginActivity) getActivity()).component().inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind(this, rootView);

        mTextFunfit.setTypeface(((LoginActivity) getActivity()).component().helveticaFace());
        Glide.with(this)
                .load(Uri.parse("http://djunabel.com/images/pics/554_djuna-bel-nike-db8.jpg"))
                .centerCrop()
                .into(mImageBg);

        return rootView;
    }
}
