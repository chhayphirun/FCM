package com.kshrd.fcmlesson.fcm;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.kshrd.fcmlesson.R;

/**
 * Created by pirang on 6/23/17.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private static final String TAG = "ooooo";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        // Check if message contains a data payload.
        if (remoteMessage.getData().size() > 0) {
            Log.d(TAG, "Message data payload: " + remoteMessage.getData());
        }

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder
                .setContentTitle("ContextTitle")
                .setContentText("ContextText")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setLargeIcon(BitmapFactory.decodeResource(this.getResources(), R.mipmap.ic_launcher));

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        int i = (int) (System.currentTimeMillis() / 1000);
        notificationManager.notify(i, builder.build());
    }



}
