package com.kshrd.fcmlesson;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;

/**
 * Created by pirang on 6/26/17.
 */

public class FCMApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseMessaging.getInstance().unsubscribeFromTopic("dara_fb");
    }
}
