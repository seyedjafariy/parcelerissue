package com.itparsa.parcelerissue.main.injection;

import com.itparsa.parcelerissue.main.view.impl.MainActivity;
import com.itparsa.parcelerissue.mvp.injection.ActivityScope;
import com.itparsa.parcelerissue.mvp.injection.AppComponent;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = MainViewModule.class)
public interface MainViewComponent {
    void inject(MainActivity activity);
}