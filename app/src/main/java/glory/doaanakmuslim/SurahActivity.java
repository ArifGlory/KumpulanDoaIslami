package glory.doaanakmuslim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class SurahActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerSurah);
        RecycleAdapterSurah adapterSurah = new RecycleAdapterSurah(this);
        recyclerView.setAdapter(adapterSurah);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
