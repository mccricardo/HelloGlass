package mccricardo.helloglass;

/**
 * Created by mccricardo.
 */
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.google.android.glass.timeline.LiveCard;

public class HelloGlassService extends Service {

    private static final String LIVE_CAR_ID = "helloglass";

    private LiveCard mLiveCard;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mLiveCard = new LiveCard(this, LIVE_CAR_ID);

        Intent mIntent = new Intent(this, MainActivity.class);
        mIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(mIntent);

        mLiveCard.publish(LiveCard.PublishMode.REVEAL);

        return START_STICKY;
    }

}
