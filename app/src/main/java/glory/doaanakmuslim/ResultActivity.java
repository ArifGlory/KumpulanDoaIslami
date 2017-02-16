package glory.doaanakmuslim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView skor,username;
    private int nilai;
    private String usernama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent i = getIntent();
        nilai = i.getIntExtra("kirimSkor",nilai);
        usernama = i.getStringExtra("kirimUser");

        username = (TextView) findViewById(R.id.txtUserResult);
        skor = (TextView) findViewById(R.id.txtHasilResult);

        skor.setText(String.valueOf(nilai));
        username.setText(usernama);


    }
}
