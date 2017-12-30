package com.itparsa.parcelerissue.mvp.presenter.loader;

import android.support.annotation.NonNull;

import com.itparsa.parcelerissue.mvp.presenter.BasePresenter;

/**
 * Factory to implement to create a presenter
 */
public interface PresenterFactory<T extends BasePresenter> {
    @NonNull
    T create();
}
