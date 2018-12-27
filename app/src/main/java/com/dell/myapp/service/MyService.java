package com.dell.myapp.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("MyService","onCreate");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyService","onDestroy");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("MyService","onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    public  void stop(){
        Log.d("MyService","stop");
        stopSelf();
    }
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
