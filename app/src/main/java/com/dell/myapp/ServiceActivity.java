package com.dell.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.dell.myapp.service.MyService;

public class ServiceActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ServiceActivity","onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ServiceActivity","onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ServiceActivity","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ServiceActivity","onResume");
    }



    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ServiceActivity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ServiceActivity","onDestroy");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("ServiceActivity","onCreate");
        setContentView(R.layout.activity_service);
        Button button1_start_service = findViewById(R.id.button1_start_service);
        Button button2_stop_service = findViewById(R.id.button2_stop_service);
        button1_start_service.setOnClickListener(this);
        button2_stop_service.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1_start_service:
                Intent startIntent = new Intent(this, MyService.class);
                startService(startIntent);
                break;
            case R.id.button2_stop_service:
//                Intent stopIntent = new Intent(this, MyService.class);
//                stopService(stopIntent);
                MyService service = new MyService();
                service.stop();
                break;
            default:
                break;
        }
    }
}
