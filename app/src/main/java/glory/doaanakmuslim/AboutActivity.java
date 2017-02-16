package glory.doaanakmuslim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    TextView penjelasanAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        penjelasanAbout = (TextView) findViewById(R.id.txtPenjelasanAbout);
        String kata = "Aplikasi ini merupakan Aplikasi Pembelajaran Doa Sehari-hari dan Surah Alquran \n \n" +
                "Dengan adanya video doa doa serta Evaluasi soal, diharapkan dapat membantu anak-anak dalam belajar";

        penjelasanAbout.setText(kata);
    }
}
