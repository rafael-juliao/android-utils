package com.lfyt.mobile.android.utils;

import android.app.Application;
import android.content.Context;


import com.lfyt.mobile.android.utils.core.PhoneAPI;
import com.lfyt.mobile.android.utils.core.StringAPI;
import com.lfyt.mobile.android.utils.core.VersionAPI;
import com.lfyt.mobile.android.utils.view.AnimationAPI;
import com.lfyt.mobile.android.utils.view.ToastAPI;
import com.lfyt.mobile.android.utils.view.ViewUtilAPI;

import dagger.Module;
import dagger.Provides;

@Module
public class UtilsModule {


    ///////////////////////////////////////////////////////////////////////////
    // Utils
    ///////////////////////////////////////////////////////////////////////////

    @Provides
    PhoneAPI phoneAPI(){
        return new PhoneAPI();
    }

    @Provides
    ToastAPI toastAPI(Application application, ViewUtilAPI viewAPI, StringAPI stringAPI, VersionAPI versionAPI){
        return new ToastAPI(application, viewAPI, stringAPI, versionAPI);
    }


    @Provides
    ViewUtilAPI viewUtilAPI(Application application){
        return new ViewUtilAPI(application);
    }

    @Provides
    AnimationAPI animationAPI(){
        return new AnimationAPI();
    }

    @Provides
    StringAPI stringAPI(Context context){
        return new StringAPI(context);
    }

    @Provides
    VersionAPI versionAPI(){
        return new VersionAPI();
    }
}
