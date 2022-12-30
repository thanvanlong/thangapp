package com.longtv.thangapp.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;

public class CompatibilityUtils {

    public static final float MARGIN_PERCENT = 0.03f;
    public static final float SPACING_PERCENT = 0.04f;
    public static final float NUMBER_BOX_CONTENT_MOBILE = 2.5f;

    public static int getScreenMargin(Context context) {
        return (int) (DeviceUtils.getDeviceSizePortrait((Activity) context).x * MARGIN_PERCENT);
    }


    public static int getItemSpacing(Context context) {
        return (int) (DeviceUtils.getDeviceSizePortrait((Activity) context).x * SPACING_PERCENT);
    }


    public static int getWidthContentItem(Context context) {
        int screenWidth = DeviceUtils.getDeviceSizePortrait((Activity) context).x;
        float margin = getScreenMargin(context);
        float spacing = getItemSpacing(context) * 0;
        int width = (int) ((screenWidth - spacing - margin) / NUMBER_BOX_CONTENT_MOBILE);
        return width;
    }


}
