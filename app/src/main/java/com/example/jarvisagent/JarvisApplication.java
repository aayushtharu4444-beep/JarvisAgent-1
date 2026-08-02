package com.example.jarvisagent;

import android.app.Application;
import android.util.Log;

public class JarvisApplication extends Application {

    private static final String TAG = "JarvisApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            Log.d(TAG, "Jarvis Agent starting in DEBUG mode - never ship this build.");
        }
    }
}
