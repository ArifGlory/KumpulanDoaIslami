package glory.doaanakmuslim;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * Created by Glory on 03/10/2016.
 */
public class RecycleAdapterSurah extends RecyclerView.Adapter<RecycleViewHolderSurah> {


    LayoutInflater inflater;
    Context context;
    Intent i;
    public static String GpubjudulEdit;
    public static String GpubisiEdit;


    //dekalrasi buat List nya
    String[] namaSurah ={"Surat Al-Fatihah","Surat An-Nas","Surat Al-Falaq","Surat Al-Ikhlas","Surat Al-Lahab"
            ,"Surat An-Nashr","Surat Al-Kafirun","Surat Al-Kautsar","Surat Al-Maun","Surat Al-Quraisy","Surat Al-Fiil"};

    int[] colorSurah = {R.color.colorDoa2,R.color.colorAccent,R.color.colorDoa2,R.color.colorAccent,
                        R.color.colorDoa2,R.color.colorAccent,R.color.colorDoa2,R.color.colorAccent,
                        R.color.colorDoa2,R.color.colorAccent,R.color.colorDoa2};


    //int ic_aja = R.drawable.greencircle;

    public RecycleAdapterSurah(final Context context) {

        inflater = LayoutInflater.from(context);
        this.context = context;




        //Glist_dari_berita.add("Berita di arraylist1");
    }


    @Override
    public RecycleViewHolderSurah onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_list_surah,parent,false);
        RecycleViewHolderSurah viewHolderSurah= new RecycleViewHolderSurah(v);
       // list_dari_berita.add("Berita di arraylist1");


        return viewHolderSurah;
    }

    @Override
    public void onBindViewHolder(RecycleViewHolderSurah holder, int position) {

        Resources res = context.getResources();
        Typeface typeface = Typeface.createFromAsset(res.getAssets(),"font/homework_bold.TTF");
        holder.txtNamaSurah.setText(namaSurah[position]);
        holder.txtNamaSurah.setTypeface(typeface);
        holder.relaSurah.setBackgroundColor(res.getColor(colorSurah[position]));

        holder.gmbrListSurah.setOnClickListener(clicklistener);
        holder.txtNamaSurah.setOnClickListener(clicklistener);



        holder.gmbrListSurah.setTag(holder);
        holder.txtNamaSurah.setTag(holder);

    }

    View.OnClickListener clicklistener = new View.OnClickListener() {


        @Override
        public void onClick(View v) {

            RecycleViewHolderSurah vHolder = (RecycleViewHolderSurah) v.getTag();
            int position = vHolder.getPosition();

           // Toast.makeText(v.getContext(),"Item diklik",Toast.LENGTH_SHORT).show();

            String namaSurat = namaSurah[position].toString();
            //Bundle bundle = new Bundle();
            i = new Intent(context,PenjelasanSurahActivity.class);
            i.putExtra("sname",namaSurat);
            context.startActivity(i);





        }
    };


    public int getItemCount() {
        return namaSurah.length;
        //return Glist_dari_judul == null ? 0 : Glist_dari_judul.size();
    }
}
