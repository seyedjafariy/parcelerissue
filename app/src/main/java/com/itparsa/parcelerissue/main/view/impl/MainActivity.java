package com.itparsa.parcelerissue.main.view.impl;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.itparsa.parcelerissue.R;
import com.itparsa.parcelerissue.main.injection.DaggerMainViewComponent;
import com.itparsa.parcelerissue.main.view.MainView;
import com.itparsa.parcelerissue.main.presenter.MainPresenter;
import com.itparsa.parcelerissue.main.injection.MainViewModule;
import com.itparsa.parcelerissue.mvp.injection.AppComponent;
import com.itparsa.parcelerissue.mvp.presenter.loader.PresenterFactory;
import com.itparsa.parcelerissue.mvp.view.impl.BaseActivity;

import javax.inject.Inject;

public final class MainActivity extends BaseActivity<MainPresenter, MainView> implements MainView {
    @Inject
    PresenterFactory<MainPresenter> mPresenterFactory;

    // Your presenter is available using the mPresenter variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Your code here
        // Do not call mPresenter from here, it will be null! Wait for onStart or onPostCreate.
    }

    @Override
    protected void setupComponent(@NonNull AppComponent parentComponent) {
        DaggerMainViewComponent.builder()
                .appComponent(parentComponent)
                .mainViewModule(new MainViewModule())
                .build()
                .inject(this);
    }

    @NonNull
    @Override
    protected PresenterFactory<MainPresenter> getPresenterFactory() {
        return mPresenterFactory;
    }
}
