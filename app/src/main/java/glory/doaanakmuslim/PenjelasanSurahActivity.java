package glory.doaanakmuslim;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class PenjelasanSurahActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    TextView txtJudulSurah;
    String judulTerima;
    public static String judulSurah;
    private MediaPlayer mp;
    private int audioSurah;
    ImageButton btnAudioSurah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjelasan_surah);
        txtJudulSurah = (TextView) findViewById(R.id.titleSurah);
        Intent i = getIntent();
        judulTerima = i.getStringExtra("sname");
        judulSurah = judulTerima;
        txtJudulSurah.setText(judulTerima);
        btnAudioSurah = (ImageButton) findViewById(R.id.btnAudioSurah);

        mp = new MediaPlayer();
        String namSur = judulTerima;
        switch (namSur){

            case "Surat Al-Fatihah" :
                audioSurah = R.raw.surat_alfatihah;
                break;

            case "Surat An-Nas" :
                audioSurah = R.raw.surat_annas;
                break;

            case "Surat Al-Falaq" :
                audioSurah = R.raw.surat_alfalaq;
                break;

            case "Surat Al-Ikhlas" :
                audioSurah = R.raw.surat_alikhlas;
                break;

            case "Surat Al-Lahab" :
                audioSurah = R.raw.surat_allahab;
                break;

            case "Surat An-Nashr" :
                audioSurah = R.raw.surat_annashr;
                break;

            case "Surat Al-Kafirun" :
                audioSurah = R.raw.surat_alkafirun;
                break;

            case "Surat Al-Kautsar" :
                audioSurah = R.raw.surat_alkautsar;
                break;

            case "Surat Al-Maun" :
                audioSurah = R.raw.surat_almaun;
                break;

            case "Surat Al-Quraisy" :
                audioSurah = R.raw.surat_alquraisy;
                break;

            case "Surat Al-Fiil" :
                audioSurah = R.raw.surat_alfiil;
                break;

            default:
                Toast.makeText(this,"audio tidak ditemukan",Toast.LENGTH_SHORT).show();
                break;

        }





        recyclerView = (RecyclerView) findViewById(R.id.recyclePenjelSurah);
        RecycleAdapterPenSurah adapterPenSurah = new RecycleAdapterPenSurah(this);
        recyclerView.setAdapter(adapterPenSurah);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void klikSuaraSurah(View view) {
        mp = MediaPlayer.create(this,audioSurah);
        try {
            mp.prepare();

        }catch (IllegalStateException e){
            e.printStackTrace();

        }catch (IOException ex){
            ex.printStackTrace();

        }

        mp.start();
        btnAudioSurah.setEnabled(false);

        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                btnAudioSurah.setEnabled(true);

            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK)
        {
           mp.stop();

        }
        return super.onKeyDown(keyCode, event);
    }


    public void klikpauseSurah(View view) {
        mp.pause();
    }

    public void klikplaySurah(View view) {
        mp.start();
    }
}
