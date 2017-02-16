package glory.doaanakmuslim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreenActivity extends AppCompatActivity {

    Intent i;
    int delay = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);

        Timer waktu = new Timer();
        TimerTask show = new TimerTask() {
            @Override
            public void run() {
                finish();
                i = new Intent(SplashScreenActivity.this,BerandaActivity.class);
                startActivity(i);
            }
        };

        waktu.schedule(show,delay);

    }
}
