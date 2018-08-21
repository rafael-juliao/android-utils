package com.lfyt.mobile.android.utils.view;

import android.app.Application;
import android.util.DisplayMetrics;
import android.util.TypedValue;


public class ViewUtilAPI {

    private DisplayMetrics mDisplayMetrics;

    public ViewUtilAPI(Application application) {
        this.mDisplayMetrics = application.getResources().getDisplayMetrics();
    }


    ///////////////////////////////////////////////////////////////////////////
    // Density Pixels to Pixels
    ///////////////////////////////////////////////////////////////////////////
    public int DP_PX(int DP){
        return
                (int) TypedValue.applyDimension(
                        TypedValue.COMPLEX_UNIT_DIP,
                        DP,
                        mDisplayMetrics
                );
    }


    ///////////////////////////////////////////////////////////////////////////
    //
    ///////////////////////////////////////////////////////////////////////////

}
