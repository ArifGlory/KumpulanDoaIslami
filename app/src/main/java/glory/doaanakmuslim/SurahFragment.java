package glory.doaanakmuslim;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SurahFragment extends Fragment {


    public SurahFragment() {
        // Required empty public constructor
    }


    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_surah, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);


        RecycleAdapterSurah adapterSurah = new RecycleAdapterSurah(view.getContext());
        recyclerView.setAdapter(adapterSurah);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        return view;
    }

}
