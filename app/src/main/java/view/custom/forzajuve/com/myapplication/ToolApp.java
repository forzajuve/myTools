package view.custom.forzajuve.com.myapplication;

import android.app.Application;


public class ToolApp extends Application {

    private AppExecutors mAppExecutors;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppExecutors = new AppExecutors();
    }

}
