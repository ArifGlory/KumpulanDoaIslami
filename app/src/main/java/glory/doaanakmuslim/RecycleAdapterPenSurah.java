package glory.doaanakmuslim;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * Created by Glory on 03/10/2016.
 */
public class RecycleAdapterPenSurah extends RecyclerView.Adapter<RecycleViewHolderPenSurah> {


    LayoutInflater inflater;
    Context context;
    Intent i;
    public static String GpubjudulEdit;
    public static String GpubisiEdit;
    private String namsur;
    private int panjang;


    //dekalrasi buat List nya
    String[] Alfatihah ={" بِسْمِ اللَّهِ الرَّ حْمَنِ الرَّحِيمِِ"," الْحَمْدُ لِلَّهِ  رَبِّ  الْعَالَمِينَ ","  الرَّ حْمَنِ الرَّ حِيمِ ", " مَالِكِ يَوْمِ الدِّينِ"," إِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ  "
            ," اهْدِنَا الصِّرَاطَ  الْمُسْتَقِيمَ "," صِرَاط يْنَ الَّذِ اَنْعَمْتَ عَلَيْهِمْ عَلَيْهِمْ ٱلْمَغْضُوْبِ عَلَيْهِمْ وَلاَ ٱلضَّآلِّيْنَ  َ"};
    String[] artiAlfatihah = {"Dengan menyebut nama Allah Yang Maha Pemurah lagi Maha Penyayangٌ" ,"" +
            "Segala puji bagi Allah, Tuhan semesta alamُ","Yang Maha Pemurah lagi Maha Penyayang "
            ,"Yang menguasai di Hari Pembalasan","Hanya Engkaulah yang kami sembah, dan hanya kepada Engkaulah kami meminta pertolongan"
            ,"Tunjukilah kami jalan yang lurus"
            ,"(yaitu) Jalan orang-orang yang telah Engkau beri ni’mat kepada mereka; bukan (jalan) mereka yang dimurkai dan bukan (pula jalan) mereka yang sesat"};

    String[] AlFalaq = {" قُلْ اَعُوْذُ بِرَبِّ الْفَلَقِ "  ,"  مِنْ شَرِّمَا خَلَقَ"," وَمِنْ  شَرِّغَاسِقٍ وَقَبَ اِذَا "," وَمِنْ شَرِّ النَّفّٰثٰتِ فِى الْعُقَدِ ","وَمِنْ شَرِّ حَاسِدٍ اِذَا حَسَدَ",
            };
    String[] artiAlfalaq = {"Katakanlah Aku berlindung kepada Tuhan yang menguasai subuh (fajar)ٌ"
                        ,"dari kejahatan makhluk-Nyaُ","dan dari kejahatan malam apabila telah gelap gulitaْ"
                        ,"dan dari kejahatan wanita-wanita tukang sihir yang menghembus pada buhul-buhul (talinya)"
                        ,"dan dari kejahatan pendengki bila ia dengki"};

    String[] AnNas = {"قُلْ أَعُوذُ بِرَبِّ النَّاسِ"  ," مَلِكِ النَّاسِ ","إِلٰهِ النَّاسِ "," مِنْ شَرِّ الْوَ سْوَاسِ الْخَنَّاسِ "," الَّذِيْ يُوَسْوِسُ فِيْ صُدُوْرِ النَّاسِ  "," مِنَ الْجِنَّةِ وَالنَّاسِ  "
    };
    String[] artiAnnas = {"Katakanlah: \"Aku berlindung kepada Tuhan (yang Memelihara dan Menguasai) manusia"
            ,"Raja Manusiaُ","Sesembahan manusia","Dari kejahatan (bisikan) setan yang biasa bersembunyi",
            "Yang membisikan kejahatan ke dalam dada manusia","Dari (golongan) jin dan manusia"};

    String[] AlIklas = {" قُلْ هُوَ اللّٰهُ اَحَدٌ"  ," اَللّٰهُ الصَّمَدُ"," لَمْ يَلِدْ وَلَمْ يُلَدْ "," وَلَمْيَكُنْ لَه كُفُوًا اَحَدٌ"};
    String[] artiAliklas = {"Katakanlah: \"Dialah Allah Yang Maha Esa\"ٌ" ,"Allah tempat kita (sekalian makhluk) bermohonُ",
                    "Ia tidak beranak dan tidak pula diperanakkan","Dan tidak ada yang menyerupai-Nya"};

    String[] AnNashr = {" إِذَا جَاءَ نَصْرُ اللهِ وَالْفَتْح"," وَرَأَيْتَ النَّاسَ يَدْخُلُونَ فِيْ دِيْنِ اللهِ أَفْوَاجًا","ْفَسَبِّحْ بِحَمْدِ رَبِّكَ وَاسْتَغْفِرْهُ إِنَّهُ كَانَ تَوَّابًا"};
    String[] artiAnnashr = {"Apabila telah datang pertolongan Allah dan kemenanganٌ" ,"dan engkau melihat manusia berbondong-bondong masuk agama Allahُ"
            ,"maka bertasbihlah dengan memuji Tuhanmu dan mohonlah ampunan kepada-Nya. Sungguh, Dia Maha penerima taubat"};

    String[] template = {"ٌ"  ,"ُ","ْ "," ٌ"};
    String[] AlLahab = {" تَبَّتْ يَدَا اَبِيْ لَهَبٍ وَّتَبَّ ٌ" ,"مَا اَغْنٰى عَنْهُ مَا لُه وَمَا كَسَبَ  ُ","ْ سَيَصْلٰى نَارً اذَاتَ لَهَبٍ ","  وَّامْرَاَتُه حَمَّا لَةَ الْحَطَبِ  ٌ"
                    ," فِيْ جِيْدِهَا حَبْلٌ مِّنْ مَّسَدٍ"};
    String[] artiAllahab = {"Binasalah kedua tangan Abu Lahab dan benar binasa","Tidak memberi faidah baginya, harta bendanya dan apa yang diusahakanُ"
            ,"Kelak dia akan masuk ke dalam api neraka yang menjilat (menyala-nyala)"
            ,"Dan begitu pula istrinya, pembawa kayu bakar","Yang di lehernya ada tali dari sabut"};

    String[] AlKafirun = {" قُلٌْ يٰآ أَيُّهَا الْكٰفِرُوْنَ"," لا أَعْبُدُ مَا تَعْبُدُوْنَ ُ","ْوَلا أَنْتُمْ عَابِدُونَ مَا أَعْبُدُ"," وَلا أَنَا عَابِدٌ مَا عَبَدْتُمْ ٌ" ,
                        "وَلا أَنْتُمْ عَابِدُونَ مَا أَعْبُدُ" ,"لَكُمْ دِينُكُمْ وَلِيَ دِينِ"};
    String[] artiAlkafirun = {"Katakanlah (Muhammad), \"Wahai orang-orang kafir!ٌ"
                ,"aku tidak akan menyembah apa yang kamu sembahُ","dan kamu tidak akan menyembah apa yang aku sembah",
                "dan aku tidak akan pernah menyembah apa yang kamu sembah","dan kamu tidak pernah pula menyembah apa yang aku sembah"
                ,"Bagimu agamamu, dan bagiku agamaku"};

    String[] AlKautsar = {" إِنَّاأَعْطَيْنَاكَ الْكَوْثَرٌَ"  ," فَصَلِّ لِرَبِّكَ وَانْحَرُْ","ْإِنّ شَانِئَكَ هُوَ الْأَبْتَرُ َ" };
    String[] artiAlkautsar = {"Sesungguhnya kami telah memberikan kepadamu nikmat yang banyak"
                ,"Maka dirikanlah shalat karena Rabbmu, dan Berkorbanlah"
                ,"Sesungguhnya orang-orang yang membenci kamu, dialah yang terputus "};

    String[] AlMaun = {"ٌأَرَأَيْتَ الَّذِيْ بِالدِّينِيُكَذِّبُ"," فَذَٰلِكَ الَّذِي يَدُعُّ الْيَتِيمَ ُ","ْوَلَا عَلَىٰيَحُضُّ طَعَامِ الْمِسْكِينِ"," فَوَيْلٌٌ لِّلْمُصَلِّينَ"
                    , " الَّذِينَ هُمْ  عَن صَلَاتِهِمْ سَاهُونَ" ,"الَّذِينَ  هُمْ يُرَاءُونَ" ,"وَيَمْنَعُونَ الْمَاعُونَ"};
    String[] artiAlmaun = {"Tahukah kita (orang) yang mendustakan agama?","Itulah orang yang menghardik anak yatim"
                ,"dan tak menganjurkan memberi makan orang miskin","Maka kecelakaanlah untuk orang-orang yang shalat"
                ,"(Yaitu) orang-orang yang lalai dari shalatnya","orang-orang yang berbuat riya’",
                "dan enggan (menolong dengan) barang bermanfaat"};

    String[] AlQuraisy = {" لِإِيْلٰفِ قُرَيْشٌٍ"  ,"ُ إِيلٰفِهِمْ رِحْلَةَ الشِّتَآءِ وَالصَّيْفِ","ْفَلْيَعْبُدُوْا رَبَّ هٰذَا الْبَيْتِ "," الَّذِيْ أَطْعَمَهُمْ مِّنْ جُوْعٍ وَّاٰمَنَهُمْ مِّنْ خَوْفٌٍ"};
    String[] artiAlquraisy = {"Karena kebiasaan orang-orang Quraisyٌ","(yaitu) kebiasaan mereka bepergian pada musim dingin dan musim panas"
            ,"Maka hendaklah mereka menyembah Rabb, Pemilik rumah ini (Ka'bah)"
            ,"Yang telah memberi makanan kepada mereka, untuk menghilangkan lapar, dan mengamankan mereka dari ketakutan"};

    String[] AlFil = {"ٌ أَلَمْ تَرَ كَيْفَ فَعَلَ رَبُّكَ بِأَصْحَابِ الْفِيلِ" ," أَلَمْ يَجْعَلْ كَيْدَهُمْ فِي تَضْلِيلٍُ","ْوَأَرْسَلَ عَلَيْهِمْ طَيْرًا أَبَابِيلَ "," تَرْمِيهِمْ بِحِجَارَةٍ مِنْ سِجِّيلٌٍ"
                    ," فَجَعَلَهُمْ كَعَصْفٍ مَأْكُولٍ"};
    String[] artiAlfil = {"Apakah kamu tidak memperhatikan, bagaimana Rabb-mu telah bertindak terhadap tentara gajah"
            ,"Bukankah Dia telah menjadikan tipu-daya mereka (untuk menghancurkan Ka'bah) itu sia-sia"
            ,"dan Dia mengirimkan kepada mereka burung, yang berbondong-bondong"
            ,"yang melempari mereka dengan batu (berasal), dari tanah yang terbakar"
            ,"lalu Dia menjadikan mereka, seperti daun-daun yang dimakan (ulat)"};








    String[] namaDoa={"Bismilah","Doa Sebelum Makan","Doa Sesudah Makan","Doa Sebelum Tidur","Doa Sesudah Tidur","Doa Masuk Rumah",
            "Doa Keluar Rumah","Doa Masuk WC","Doa Keluar WC","Doa Bercermin","Doa Selamat","Doa Masuk Masjid",
            "Doa Keluar Masjid","Doa Niat Wudhu","Doa sesudah Wudhu","Doa Hendak Berpakaian","Doa Melepas Pakaian",
            "Doa Ketika Hujan","Doa mendengar Petir","Doa Ketika Mimpi Baik","Doa Ketika Mimpi Buruk","Doa Kedua Orang Tua",
            "Doa Memohon Ilmu Bermanfaat","Doa Sebelum Belajar","Doa Sesudah Belajar"};

    //int ic_aja = R.drawable.greencircle;

    public RecycleAdapterPenSurah(final Context context) {

        inflater = LayoutInflater.from(context);
        this.context = context;

        //Glist_dari_berita.add("Berita di arraylist1");
    }


    @Override
    public RecycleViewHolderPenSurah onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_list_penjelasansurah,parent,false);
        RecycleViewHolderPenSurah viewHolderPenSurah= new RecycleViewHolderPenSurah(v);
       // list_dari_berita.add("Berita di arraylist1");


        return viewHolderPenSurah;
    }

    @Override
    public void onBindViewHolder(RecycleViewHolderPenSurah holder, int position) {


        int pos = position+1;

        namsur = PenjelasanSurahActivity.judulSurah;

        switch (namsur){

            case "Surat Al-Fatihah" :
                holder.txtArabnya.setText(Alfatihah[position]);
                holder.txtArtinya.setText(artiAlfatihah[position]);
                holder.txtNomornya.setText(" "+pos+ " ");
                break;

            case "Surat An-Nas" :
                holder.txtArabnya.setText(AnNas[position]);
                holder.txtArtinya.setText(artiAnnas[position]);
                holder.txtNomornya.setText(" "+pos+ " ");
                break;

            case "Surat Al-Falaq" :
                holder.txtArabnya.setText(AlFalaq[position]);
                holder.txtArtinya.setText(artiAlfalaq[position]);
                holder.txtNomornya.setText(" "+pos+ " ");
                break;

            case "Surat Al-Ikhlas" :
                holder.txtArabnya.setText(AlIklas[position]);
                holder.txtArtinya.setText(artiAliklas[position]);
                holder.txtNomornya.setText(" "+pos+ " ");
                break;

            case "Surat Al-Lahab" :
                holder.txtArabnya.setText(AlLahab[position]);
                holder.txtArtinya.setText(artiAllahab[position]);
                holder.txtNomornya.setText(" "+pos+ " ");
                break;

            case "Surat An-Nashr" :
                holder.txtArabnya.setText(AnNashr[position]);
                holder.txtArtinya.setText(artiAnnashr[position]);
                holder.txtNomornya.setText(" "+pos+ " ");
                break;

            case "Surat Al-Kafirun" :
                holder.txtArabnya.setText(AlKafirun[position]);
                holder.txtArtinya.setText(artiAlkafirun[position]);
                holder.txtNomornya.setText(" "+pos+ " ");
                break;

            case "Surat Al-Kautsar" :
                holder.txtArabnya.setText(AlKautsar[position]);
                holder.txtArtinya.setText(artiAlkautsar[position]);
                holder.txtNomornya.setText(" "+pos+ " ");
                break;

            case "Surat Al-Maun" :
                holder.txtArabnya.setText(AlMaun[position]);
                holder.txtArtinya.setText(artiAlmaun[position]);
                holder.txtNomornya.setText(" "+pos+ " ");
                break;

            case "Surat Al-Quraisy" :
                holder.txtArabnya.setText(AlQuraisy[position]);
                holder.txtArtinya.setText(artiAlquraisy[position]);
                holder.txtNomornya.setText(" "+pos+ " ");
                break;

            case "Surat Al-Fiil" :
                holder.txtArabnya.setText(AlFil[position]);
                holder.txtArtinya.setText(artiAlfil[position]);
                holder.txtNomornya.setText(" "+pos+ " ");
                break;

            default:
                Toast.makeText(context,"Surah tidak ditemukan",Toast.LENGTH_SHORT).show();
                break;


        }


       /* holder.txtArabnya.setText(AlIklas[position]);
        holder.txtArtinya.setText("Nomornya "+position);
        holder.txtNomornya.setText(" "+pos+ " ");*/

        holder.txtArabnya.setOnClickListener(clicklistener);
        holder.txtArtinya.setOnClickListener(clicklistener);
        holder.txtNomornya.setOnClickListener(clicklistener);



        holder.txtArtinya.setTag(holder);
        holder.txtArabnya.setTag(holder);
        holder.txtNomornya.setTag(holder);

    }

    View.OnClickListener clicklistener = new View.OnClickListener() {


        @Override
        public void onClick(View v) {


            Toast.makeText(v.getContext(),"Item diklik",Toast.LENGTH_SHORT).show();

        }
    };


    public int getItemCount() {
        namsur = PenjelasanSurahActivity.judulSurah;
        panjang = 10;



        switch (namsur){
            case "Surat Al-Fatihah" :
                panjang = Alfatihah.length;
                break;

            case "Surat An-Nas" :
                panjang = AnNas.length;
                break;

            case "Surat Al-Falaq" :
               panjang =  AlFalaq.length;
                break;

            case "Surat Al-Ikhlas" :
                panjang =  AlIklas.length;
                break;

            case "Surat Al-Lahab" :
                panjang =  AlLahab.length;
                break;

            case "Surat An-Nashr" :
                panjang =  AnNashr.length;
                break;

            case "Surat Al-Kafirun" :
                panjang =  AlKafirun.length;
                break;

            case "Surat Al-Kautsar" :
                panjang =  AlKautsar.length;
                break;

            case "Surat Al-Maun" :
                panjang =  AlMaun.length;
                break;

            case "Surat Al-Quraisy" :
                panjang =  AlQuraisy.length;
                break;

            case "Surat Al-Fiil" :
                panjang =  AlFil.length;
                break;

            default:
                Toast.makeText(context,"length tidak ditemukan",Toast.LENGTH_SHORT).show();
                break;

        }
        return panjang;
        //return Glist_dari_judul == null ? 0 : Glist_dari_judul.size();

    }
}
