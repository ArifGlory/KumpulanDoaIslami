package glory.doaanakmuslim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BerandaActivity extends AppCompatActivity {

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
    }

    public void keDoa(View view) {

        i = new Intent(this,DoaActivity.class);
        startActivity(i);

    }

    public void keSurah(View view) {

        i = new Intent(this,SurahActivity.class);
        startActivity(i);
    }

    public void keEvaluasi(View view) {
        i = new Intent(this,EvaluasiActivity.class);
        startActivity(i);

    }

    public void keAlarm(View view) {

            i = new Intent(this,AlarmActivity.class);
        startActivity(i);

    }

    public void keAbout(View view) {

        i = new Intent(this,AboutActivity.class);
        startActivity(i);
    }
}
