package com.servingseniors.paypal_oh;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.servingseniors.paypal_oh.R;

/**
 * Created by Ankur Kumar on 10/3/2015.
 */
public class splashScreen extends  Activity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            // TODO Auto-generated method stub
            super.onCreate(savedInstanceState);
            setContentView(R.layout.splash);

            Thread timerThread = new Thread(){
                public void run(){
                    try{
                        sleep(3000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }finally{
                        Intent intent = new Intent(splashScreen.this,splashScreen.class);
                        startActivity(intent);
                    }
                }
            };
            timerThread.start();
        }

        @Override
        protected void onPause() {
            // TODO Auto-generated method stub
            super.onPause();
           finish();
    }

}