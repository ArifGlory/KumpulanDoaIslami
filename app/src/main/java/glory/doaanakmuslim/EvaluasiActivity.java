package glory.doaanakmuslim;

import android.app.AlertDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

public class EvaluasiActivity extends AppCompatActivity {

    private int currentSoal = 0;
    private int skor = 0;
    private int totalSkor = 0;
    private String getAnswer;
    private String kuncijwbString;


    Button btn_A,btn_B,btn_C,btn_D;
    TextView textSoal,textjawab,textUser,textNoSoal;
    ImageView gambarSoal;
    private int audio;
    DBAdapter mDB;

    private Quiz mquiz;
    private List<Quiz> mlistQuiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluasi);

        textUser = (TextView) findViewById(R.id.txtUser);
        textNoSoal = (TextView) findViewById(R.id.txtNoSoal);
        btn_A = (Button) findViewById(R.id.btnA);
        btn_B = (Button) findViewById(R.id.btnB);
        btn_C = (Button) findViewById(R.id.btnC);
        btn_D = (Button) findViewById(R.id.btnD);
        textSoal = (TextView) findViewById(R.id.txtSoaleva1);
        gambarSoal = (ImageView) findViewById(R.id.gmbrSoal);


        mDB = DBAdapter.getInstance(getApplicationContext());
        mlistQuiz = mDB.getAllSoal();
        Collections.shuffle(mlistQuiz);

        showInputUser();
    }


    private void showInputUser(){

        LayoutInflater minlfater = LayoutInflater.from(this);
        View v = minlfater.inflate(R.layout.input_user, null);

        final AlertDialog dialog = new AlertDialog.Builder(this).create();
        dialog.setView(v);
        dialog.setTitle("Masukkan Nama Anda");

        final Button btnOK = (Button) v.findViewById(R.id.BtnOKinputuser);
        final EditText inputUser = (EditText) v.findViewById(R.id.inputuser);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textUser.setText(inputUser.getText().toString());
                mulaiQuiz();
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void mulaiQuiz(){

        setupSoal();
    }

    public  void setupSoal(){

        mquiz  = mlistQuiz.get(currentSoal);

        textSoal.setText(mquiz.getSoal());
        btn_A.setText("A. "+mquiz.getJawaban_a());
        btn_B.setText("B. "+mquiz.getJawaban_b());
        btn_C.setText("C. " + mquiz.getJawaban_c());
        btn_D.setText("D. " + mquiz.getJawaban_d());

        setupGambarAudio();


        textNoSoal.setText(""+(currentSoal+1));
        currentSoal++;
    }

    private void setupGambarAudio(){

        int c = mquiz.getId() - 1 ;
        switch (c){

            case 0 :
                gambarSoal.setImageResource(R.drawable.tanya);
                //audio = R.raw.magic02;
                break;

            case 1 :
                gambarSoal.setImageResource(R.drawable.tanya);
                //audio = R.raw.magic02;
                break;

            case 2 :
                gambarSoal.setImageResource(R.drawable.banguntidur);
                ///audio = R.raw.magic02;
                break;

            case 3 :
                gambarSoal.setImageResource(R.drawable.doa_hujan);
                //audio = R.raw.magic02;
                break;

            case 4 :
                gambarSoal.setImageResource(R.drawable.doa_masukrumah);
                //audio = R.raw.bilagunah;
                break;

            case 5 :
                gambarSoal.setImageResource(R.drawable.tanya);
                // audio = R.raw.bigunah;
                break;

            case 6 :
                gambarSoal.setImageResource(R.drawable.tanya);
                //audio = R.raw.magic02;
                break;

            case 7 :
                gambarSoal.setImageResource(R.drawable.tanya);
                //audio = R.raw.magic02;
                break;

            case 8 :
                gambarSoal.setImageResource(R.drawable.tanya);
                //audio = R.raw.magic02;
                break;

            case 9 :
                gambarSoal.setImageResource(R.drawable.tanya);
                //audio = R.raw.audioizhar;
                break;

            case 10 :
                gambarSoal.setImageResource(R.drawable.tanya);
                //audio = R.raw.audioizhar;
                break;

            case 11 :
                gambarSoal.setImageResource(R.drawable.tanya);
                //audio = R.raw.audioizhar;
                break;

            case 12 :
                gambarSoal.setImageResource(R.drawable.tanya);
                //audio = R.raw.audioizhar;
                break;

            case 13 :
                gambarSoal.setImageResource(R.drawable.tanya);
                //audio = R.raw.audioizhar;
                break;
            case 14 :
                gambarSoal.setImageResource(R.drawable.tanya);
                //audio = R.raw.audioizhar;
                break;
            case 15 :
                gambarSoal.setImageResource(R.drawable.tanya);
                //audio = R.raw.audioizhar;
                break;
            case 16 :
                gambarSoal.setImageResource(R.drawable.tanya);
                //audio = R.raw.audioizhar;
                break;
            case 17 :
                gambarSoal.setImageResource(R.drawable.tanya);
                //audio = R.raw.audioizhar;
                break;
            case 18 :
                gambarSoal.setImageResource(R.drawable.tanya);
                //audio = R.raw.audioizhar;
                break;
            case 19 :
                gambarSoal.setImageResource(R.drawable.tanya);
                //audio = R.raw.audioizhar;
                break;

        }

    }

    public void nextSoal(){

        if (getAnswer.equals(mquiz.getJawaban_benar().toUpperCase())){

            skor = skor+10;

        }
        if (currentSoal<mlistQuiz.size()){

            setupSoal();

        }else {

            totalSkor = skor/2;
            Intent i = new Intent(this,ResultActivity.class);
            i.putExtra("kirimSkor",totalSkor);
            i.putExtra("kirimUser",textUser.getText().toString());

            startActivity(i);

        }

    }

    public void btnklikA(View view) {
        getAnswer = "A";
        nextSoal();
    }

    public void btnklikB(View view) {
        getAnswer = "B";
        nextSoal();
    }

    public void btnklikC(View view) {
        getAnswer = "C";
        nextSoal();
    }

    public void btnklikD(View view) {
        getAnswer = "D";
        nextSoal();
    }
}
