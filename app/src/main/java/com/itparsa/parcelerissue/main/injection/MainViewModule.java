package com.itparsa.parcelerissue.main.injection;

import android.support.annotation.NonNull;

import com.itparsa.parcelerissue.main.interactor.MainInteractor;
import com.itparsa.parcelerissue.main.interactor.impl.MainInteractorImpl;
import com.itparsa.parcelerissue.main.presenter.MainPresenter;
import com.itparsa.parcelerissue.main.presenter.impl.MainPresenterImpl;
import com.itparsa.parcelerissue.mvp.presenter.loader.PresenterFactory;

import dagger.Module;
import dagger.Provides;

@Module
public final class MainViewModule {
    @Provides
    public MainInteractor provideInteractor() {
        return new MainInteractorImpl();
    }

    @Provides
    public PresenterFactory<MainPresenter> providePresenterFactory(@NonNull final MainInteractor interactor) {
        return new PresenterFactory<MainPresenter>() {
            @NonNull
            @Override
            public MainPresenter create() {
                return new MainPresenterImpl(interactor);
            }
        };
    }
}
