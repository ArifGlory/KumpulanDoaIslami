package glory.doaanakmuslim;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {


    public AboutFragment() {
        // Required empty public constructor
    }


    TextView penjelasanAbout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        penjelasanAbout = (TextView) view.findViewById(R.id.txtPenjelasanAbout);
        String kata = "Aplikasi ini merupakan Aplikasi Pembelajaran Doa Sehari-hari dan Surah Alquran \n \n" +
                "Dengan adanya video doa doa serta Evaluasi soal, diharapkan dapat membantu anak-anak dalam belajar";

        penjelasanAbout.setText(kata);


        return view;
    }

}
