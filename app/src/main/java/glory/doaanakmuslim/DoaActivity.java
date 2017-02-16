package glory.doaanakmuslim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class DoaActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview1);
        RecycleAdapterDoa adapterDoa = new RecycleAdapterDoa(this);
        recyclerView.setAdapter(adapterDoa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
