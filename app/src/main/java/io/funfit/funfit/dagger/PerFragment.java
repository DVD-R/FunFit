package io.funfit.funfit.dagger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Dj on 12/5/2015.
 */
@Scope
@Retention(RetentionPolicy.CLASS)
public @interface PerFragment {
}
