package com.itparsa.parcelerissue.mvp;

import android.app.Application;
import android.support.annotation.NonNull;

import com.itparsa.parcelerissue.mvp.injection.AppComponent;
import com.itparsa.parcelerissue.mvp.injection.AppModule;
import com.itparsa.parcelerissue.mvp.injection.DaggerAppComponent;


public final class App extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    @NonNull
    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}