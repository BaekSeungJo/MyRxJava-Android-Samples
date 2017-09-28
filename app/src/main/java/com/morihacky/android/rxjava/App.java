package com.morihacky.android.rxjava;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by 1 on 2017-09-22.
 */

public class App extends Application {

    private static App sInstance;

    public static App getApp() {
        return sInstance;
    }

    /**
     * Called when the application is starting, before any activity, service,
     * or receiver objects (excluding content providers) have been created.
     * Implementations should be as quick as possible (for example using
     * lazy initialization of state) since the time spent in this function
     * directly impacts the performance of starting the first activity,
     * service, or receiver in a process.
     * If you override this method, be sure to call super.onCreate().
     */
    @Override
    public void onCreate() {
        super.onCreate();

        sInstance = (App) getApplicationContext();
        Timber.plant(new Timber.DebugTree());
    }
}
