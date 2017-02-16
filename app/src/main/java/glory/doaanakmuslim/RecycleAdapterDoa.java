package glory.doaanakmuslim;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Glory on 03/10/2016.
 */
public class RecycleAdapterDoa extends RecyclerView.Adapter<RecycleViewHolderDoa> {


    LayoutInflater inflater;
    Context context;
    Intent i;
    public static String GpubjudulEdit;
    public static String GpubisiEdit;
    private int videoKirim;
    public static ArrayList listDoa;


    //dekalrasi buat List nya
    String[] nama ={"Doa 1 ","Doa 2","Doa 3"};

    String[] namaDoa={"Doa Akan Bepergian","Doa Sebelum Makan","Doa Sesudah Makan","Doa Sebelum Tidur","Doa Bangun Tidur","Doa Masuk Rumah",
            "Doa Keluar Rumah","Doa Masuk WC","Doa Keluar WC","Doa Selamat","Doa Masuk Masjid",
            "Doa Keluar Masjid","Doa Niat Wudhu","Doa sesudah Wudhu","Doa Hendak Berpakaian","Doa Melepas Pakaian",
            "Doa Ketika Hujan","Doa Mendengar Petir","Doa Ketika Mimpi Buruk","Doa Untuk Orang Sakit",
            "Doa Musafir Pada Yang Ditinggal","Doa Kelapangan Hati","Doa Ketika Ada Orang Bersin","Doa Naik Kendaraan Laut"
            ,"Doa Naik Kendaraan","Doa Beranjak Dari Majelis","Doa Pulang Bepergian","Doa Sesudah Belajar",
            "Doa Hendak Mandi","Doa Singgah di Suatu Tempat","Doa Mendengar Angin Ribut","Doa Bercermin","Doa Ketika Lupa Doa Makan" +
            "(teringat ditengah-tengah)","Doa Melihat Hal Yang Dibenci","Doa Melihat Orang Mendapat Musibah","Doa Melihat Hal Yang Disukai"
            ,"Doa Sebelum Belajar","Doa Untuk Kedua Orang Tua"};

    int [] resDoa = {R.drawable.doa_berpergian,R.drawable.doa_sebelummakan,R.drawable.doa_sesudahmakan,R.drawable.doa_sebelumtidur,
            R.drawable.doa_banguntidurdoa,R.drawable.doa_masukrumahdoa,R.drawable.doa_keluarrumah,R.drawable.doa_masukwc,R.drawable.doa_keluarwc,
            R.drawable.doa_selamat,R.drawable.doa_masukmasjid,R.drawable.doa_keluarmasjid,
            R.drawable.doa_niatwudhu,R.drawable.doa_selesaiwudhu,
            R.drawable.doa_memakaipakaian,R.drawable.doa_melepaspakaian,R.drawable.doa_ketikahujan,R.drawable.doa_mendengarpetir,
            R.drawable.doa_mimpiburuk,R.drawable.doa_padaorangsakit,R.drawable.doa_musafirpadayangditinggal,R.drawable.doa_kelapanganhati,
            R.drawable.doa_bersin,R.drawable.doa_naikkendaraanlaut,R.drawable.doa_naikkendaraan,R.drawable.doa_beranjakmajelis,
            R.drawable.doa_pulangberpergian,R.drawable.doa_sesudahbelajar,R.drawable.doa_mandi,R.drawable.doa_singgahsuatutempat,
            R.drawable.doa_anginribut,R.drawable.doa_bercemin,R.drawable.doa_lupadoamakan,R.drawable.doa_melihatyangdibenci,
            R.drawable.doa_orangmendapatmusibah,R.drawable.doa_melihatyangdisukai,R.drawable.doa_sebelumbelajar,
            R.drawable.doa_padaorangberbuatkebaikan};

    int [] colorDoa = {R.color.colorDoa2,R.color.colorDoa3,R.color.colorDoa4,R.color.colorDoa5,R.color.colorDoa6,R.color.colorDoa3
                    ,R.color.colorDoa6,R.color.colorDoa4,R.color.colorDoa3,R.color.colorDoa2,R.color.colorDoa3,R.color.colorDoa6
                    ,R.color.colorDoa4,R.color.colorDoa3,R.color.colorDoa5,R.color.colorDoa2,R.color.colorDoa6,R.color.colorDoa4
                    ,R.color.colorDoa4,R.color.colorDoa3,R.color.colorDoa5,R.color.colorDoa2,R.color.colorDoa6,R.color.colorDoa4
                    ,R.color.colorDoa4,R.color.colorDoa3,R.color.colorDoa5,R.color.colorDoa2,R.color.colorDoa6,R.color.colorDoa4
                    ,R.color.colorDoa4,R.color.colorDoa3,R.color.colorDoa5,R.color.colorDoa2,R.color.colorDoa6,R.color.colorDoa4
                    ,R.color.colorDoa4,R.color.colorDoa3,R.color.colorDoa5};


    //int ic_aja = R.drawable.greencircle;

    public RecycleAdapterDoa(final Context context) {

        inflater = LayoutInflater.from(context);
        this.context = context;
        listDoa = new ArrayList();


        //Glist_dari_berita.add("Berita di arraylist1");
    }


    @Override
    public RecycleViewHolderDoa onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_list,parent,false);
        RecycleViewHolderDoa viewHolderBerita= new RecycleViewHolderDoa(v);
       // list_dari_berita.add("Berita di arraylist1");

        return viewHolderBerita;
    }

    @Override
    public void onBindViewHolder(RecycleViewHolderDoa holder, int position) {

        Resources res = context.getResources();
        Typeface typeface = Typeface.createFromAsset(res.getAssets(),"font/homework_bold.TTF");
        //holder.checkBoxJudul.setText(nama[position]);
        int a = R.color.colorDoa1;
        holder.gmbrList.setImageResource(resDoa[position]);
        holder.txtNamaDoa.setTypeface(typeface);
        holder.txtNamaDoa.setText(namaDoa[position]);
        holder.relaDoa.setBackgroundColor(res.getColor(colorDoa[position]));

        holder.gmbrList.setOnClickListener(clicklistener);
        holder.txtNamaDoa.setOnClickListener(clicklistener);
        holder.relaDoa.setOnClickListener(clicklistener);



        holder.gmbrList.setTag(holder);
        holder.txtNamaDoa.setTag(holder);
        holder.relaDoa.setTag(holder);

    }

    View.OnClickListener clicklistener = new View.OnClickListener() {


        @Override
        public void onClick(View v) {


            RecycleViewHolderDoa vHolder = (RecycleViewHolderDoa) v.getTag();
            int position = vHolder.getPosition();
            int posdoa = 0;

           // Toast.makeText(v.getContext(),"Item diklik "+position,Toast.LENGTH_SHORT).show();
            i = new Intent(context,PenjelasanDoa.class);
            i.putExtra("vkirim",namaDoa[position].toString());
            i.putExtra("nokirim",position);
            context.startActivity(i);



        }
    };


    public int getItemCount() {
        return namaDoa.length;
        //return Glist_dari_judul == null ? 0 : Glist_dari_judul.size();
    }
}
