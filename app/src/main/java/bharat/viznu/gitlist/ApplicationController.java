package bharat.viznu.gitlist;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import bharat.viznu.gitlist.util.Helper;

public class ApplicationController extends Application implements Application.ActivityLifecycleCallbacks {
    private static ApplicationController mApplicationInstance;
    private static boolean mIsNetworkConnected;
    private Activity activity;

    public static ApplicationController getApplicationInstance() {
        if (mApplicationInstance == null) {
            mApplicationInstance = new ApplicationController();
        }
        return mApplicationInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(this);
        mApplicationInstance = this;
        mIsNetworkConnected = Helper.getNetworkState(this);
    }

    public boolean isNetworkConnected() {
        return mIsNetworkConnected;
    }

    public void setIsNetworkConnected(boolean mIsNetworkConnected) {
        this.mIsNetworkConnected = mIsNetworkConnected;
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override
    public void onActivityStarted(Activity activity) {
    }

    @Override
    public void onActivityResumed(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void onActivityPaused(Activity activity) {
    }

    @Override
    public void onActivityStopped(Activity activity) {
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
    }
}