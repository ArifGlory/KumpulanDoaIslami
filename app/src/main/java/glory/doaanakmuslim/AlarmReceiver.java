package glory.doaanakmuslim;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

/**
 * Created by Glory on 05/10/2016.
 */
public class AlarmReceiver extends BroadcastReceiver {

    MediaPlayer mp;
    private NotificationManager mManager;

    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Alarm aktif coy !", Toast.LENGTH_LONG).show();
        mp = MediaPlayer.create(context, R.raw.loudalarm);
        mp.start();

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setSmallIcon(R.drawable.ic_priority_high_black_48dp);
        builder.setContentTitle("Waktunya Hafalan  Doa !");//"Notifications Example")
        builder.setContentText("Hai ! , sekarang waktunya hafalan doa ");//"This is a test notification");
        builder.setTicker("Waktunya Hafalan Doa !");
        builder.setSmallIcon(R.drawable.ic_priority_high_black_48dp);

        Intent notificationIntent = new Intent(context, BerandaActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(context, 0, notificationIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);
        // Add as notification
        NotificationManager manager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        manager.notify(1, builder.build());
    }
}
