package glory.doaanakmuslim;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.rtoshiro.view.video.FullscreenVideoLayout;

import java.io.IOException;

public class PenjelasanDoa extends AppCompatActivity {

    private FullscreenVideoLayout videoLayout;
    ImageView gmbrPlay;
    private String doaTerima;
    private int posDoa;
    private int vidDoa;
    private Uri lokasivideo;
    TextView txtArti;
    String kataArti;
    String[] namaDoa={"Doa Akan Bepergian","Doa Sebelum Makan","Doa Sesudah Makan","Doa Sebelum Tidur","Doa Bangun Tidur","Doa Masuk Rumah",
            "Doa Keluar Rumah","Doa Masuk WC","Doa Keluar WC","Doa Selamat","Doa Masuk Masjid",
            "Doa Keluar Masjid","Doa Niat Wudhu","Doa sesudah Wudhu","Doa Hendak Berpakaian","Doa Melepas Pakaian",
            "Doa Ketika Hujan","Doa Mendengar Petir","Doa Ketika Mimpi Buruk","Doa Untuk Orang Sakit",
            "Doa Musafir Pada Yang Ditinggal","Doa Kelapangan Hati","Doa Ketika Ada Orang Bersin","Doa Naik Kendaraan Laut"
            ,"Doa Naik Kendaraan","Doa Beranjak Dari Majelis","Doa Pulang Bepergian","Doa Sesudah Belajar",
            "Doa Hendak Mandi","Doa Singgah di Suatu Tempat","Doa Mendengar Angin Ribut","Doa Bercermin","Doa Ketika Lupa Doa Makan" +
            "(teringat ditengah-tengah)","Doa Melihat Hal Yang Dibenci","Doa Melihat Orang Mendapat Musibah","Doa Melihat Hal Yang Disukai"
            ,"Doa Sebelum Belajar","Doa Untuk Kedua Orang Tua"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjelasan_doa);

        txtArti = (TextView) findViewById(R.id.txtArtiDoa);
        gmbrPlay = (ImageView) findViewById(R.id.gmbrPlay);
        videoLayout = (FullscreenVideoLayout) findViewById(R.id.videoview);
        videoLayout.setActivity(this);

        Intent i = getIntent();
        doaTerima = i.getStringExtra("vkirim");
        posDoa = i.getIntExtra("nokirim",posDoa);
        txtArti.setText(doaTerima);

        vidDoa = R.raw.doa_sebelummakan;

        switch (doaTerima){

            case "Doa Akan Bepergian" :
                vidDoa = R.raw.doa_berpergian;
                kataArti = "Aku menitipkan kalian kepada Allah yang tidak akan hilang titipan-Nya";
                txtArti.setText(kataArti);
                break;

            case "Doa Sebelum Makan" :
                vidDoa = R.raw.doa_sebelummakan;
                kataArti="Ya Allah berkahilah apa yang engkau telah Engkau berikan kepada kami dan jagalah kami dari api neraka";
                txtArti.setText(kataArti);
                break;

            case "Doa Sesudah Makan" :
                vidDoa = R.raw.doa_sesudahmakan;
                kataArti="Segala puji bagi Allah yang telah mengkaruniakan makanan dan minuman pada kami serta menjadikan kami " +
                        "sebagai orang muslim";
                txtArti.setText(kataArti);
                break;

            case "Doa Sebelum Tidur" :
                vidDoa = R.raw.doa_sebelumtidur;
                kataArti="Dengan menyebut nama Allah aku hidup dan dengan menyebut namamu aku mati";
                txtArti.setText(kataArti);
                break;

            case "Doa Bangun Tidur" :
                vidDoa = R.raw.doa_banguntidur;
                kataArti="Segala puji bagi Allah yang telah menghidupkan kita setelah Dia mematikan kita, dan kepada-Nya kita" +
                        "dibangkitkan";
                txtArti.setText(kataArti);
                break;

            case "Doa Masuk Rumah" :
                vidDoa = R.raw.doa_masukrumah;
                kataArti=" Dengan nama Allah kami masuk rumah, dengan nama Allah aku keluar rumah, serta kepada-Nya aku berserah diri";
                txtArti.setText(kataArti);
                break;

            case "Doa Keluar Rumah" :
                vidDoa = R.raw.doa_keluarrumah;
                kataArti="Dengan menyebut nama Allah, aku menyerahkan diriku kepada Allah dan tidak ada daya dan upaya dan " +
                        "kekuatan melainkan dengan pertolongan Allah saja";
                txtArti.setText(kataArti);
                break;

            case "Doa Masuk WC" :
                vidDoa = R.raw.doa_memasukiwc;
                kataArti="Dengan menyebut nama Allah. Ya Allah sesungguhnya aku berlindung kepada-Mu" +
                        "dari setan laki-laki dan setan perempuan";
                txtArti.setText(kataArti);
                break;

            case "Doa Keluar WC" :
                vidDoa = R.raw.doa_keluarwc;
                kataArti="Aku meminta ampunan-Mu. Segala puji bagi Allah yang menghilangkan penyakit dan menganugrahkanku kesehatan";
                txtArti.setText(kataArti);
                break;

            case "Doa Selamat" :
                vidDoa = R.raw.doa_selamat;
                kataArti="Ya Allah, kami mohon ampunan kepada-Mu seta limpahkan kesejahteraan agama dunia serta akhirat";
                txtArti.setText(kataArti);
                break;

            case "Doa Masuk Masjid" :
                vidDoa = R.raw.doa_masukmasjid;
                kataArti=" Wahai Allah, ampunilah segala dosaku dan bukakanlah pintu-pintu rahmatMu untukku";
                txtArti.setText(kataArti);
                break;

            case "Doa Keluar Masjid" :
                vidDoa = R.raw.doa_keluarmasjid;
                kataArti= "Wahai Tuhanku, sesungguhnya aku memohon kepada-Mu akan segala keutamaan-Mu";
                txtArti.setText(kataArti);
                break;

            case "Doa Niat Wudhu" :
                vidDoa = R.raw.doa_niatwudhu;
                kataArti="Aku niat berwudhu untuk menghilangkan hadats kecil, fardhu karena Allah";
                txtArti.setText(kataArti);
                break;

            case "Doa sesudah Wudhu" :
                vidDoa = R.raw.doa_selesaiwudhu;
                kataArti="Aku bersaksi bahwa tidak ada Tuhan selain Allah yang Maha Esa,yang tidak ada sekutu bagi-Nya. " +
                        "Dan Aku bersaksi bahwa Muhammad adalah hamba dan utusan-Nya. Ya Allah, jadikanlah aku termasuk " +
                        "orang orang yang bertobat dan jadikan aku termasuk dalam orang orang yang suci";
                txtArti.setText(kataArti);
                txtArti.setTextSize(13);
                break;

            case "Doa Hendak Berpakaian" :
                vidDoa = R.raw.doa_berpakaian;
                kataArti="Ya Allah, sungguh aku memohon kepada-MU dari kebaikannya serta kebaikan yang ada padanya, dan aku berlindung " +
                        "pada-MU dari keburukannnya serta keburukan yang ada padanya ";
                txtArti.setText(kataArti);
                break;

            case "Doa Melepas Pakaian" :
                vidDoa = R.raw.doa_melepaspakaian;
                kataArti="Dengan nama Allah Yang tiada Tuhan selain Dia";
                txtArti.setText(kataArti);
                break;

            case "Doa Ketika Hujan" :
                vidDoa = R.raw.doa_hujan;
                kataArti="Ya Allah, turunkanlah hujan yang bermanfaat";
                txtArti.setText(kataArti);
                break;

            case "Doa Mendengar Petir" :
                vidDoa = R.raw.doa_mendengarpetir;
                kataArti="Mahasuci Allah yang petir bertasbih dengan memuji-Nya dan begitu juga para malaikat, karena takut kepada-Nya";
                txtArti.setText(kataArti);
                break;

            case "Doa Ketika Mimpi Buruk" :
                vidDoa = R.raw.doa_mimpiburuk;
                kataArti="Ya Allah sesungguhnya\n" +
                        "aku berlindung pada-Mu dari segala perbuatan setan dan dari keburukan mimpi ini";
                txtArti.setText(kataArti);
                break;

            case "Doa Untuk Orang Sakit" :
                vidDoa = R.raw.doa_untukorangsakit;
                kataArti="Aku mohon kepada Allah yang Mahaagung, Rabb 'Arsy yang Agung, agar menyembuhkanmu";
                txtArti.setText(kataArti);
                break;

            case "Doa Musafir Pada Yang Ditinggal" :
                vidDoa = R.raw.doa_musafirpadaorangditinggal;
                kataArti="Aku menitipkan agama, amanah, dan penutup amalmu";
                txtArti.setText(kataArti);
                break;

            case "Doa Kelapangan Hati" :
                vidDoa = R.raw.doa_kelapanganhati;
                kataArti="Ya Tuhan, lapangkanlah dadaku, mudahkanlah segala urusanku, dan lepaskanlah kekakuan lidahku, " +
                        "agar mereka mengerti perkataanku";
                txtArti.setText(kataArti);
                break;

            case "Doa Ketika Ada Orang Bersin" :
                vidDoa = R.raw.doa_adaorangbersin;
                kataArti="Semoga Allah memberkatimu";
                txtArti.setText(kataArti);
                break;

            case "Doa Naik Kendaraan Laut" :
                vidDoa = R.raw.doa_naikkendaraanlaut;
                kataArti="Dengan nama Allah yang menjalankan kendaraan ini berlayar dan berlabuh sesungguhnya Tuhanku Maha Pemaaf lagi Pengasih";
                txtArti.setText(kataArti);
                break;

            case "Doa Naik Kendaraan" :
                vidDoa = R.raw.doa_naikkendaraan;
                kataArti=" Dengan nama Allah. Mahasuci Tuhan yang menundukan kendaraan ini untuk kami, sedang sebelumnya kami " +
                        "tidak mampu. Dan sesungguhnya kami akan kembali kepada Tuhan kami(dihari Kiamat)";
                txtArti.setText(kataArti);
                break;

            case "Doa Beranjak Dari Majelis" :
                vidDoa = R.raw.doa_beranjakdarimajelis;
                kataArti="Mahasuci Engkau, ya Allah , aku memuji kepada-Mu. Aku bersaksi bahwa tiada Tuhan yang berhak" +
                        " disembah selain Engkau. Aku minta ampun dan bertobat kepada-MU ";
                txtArti.setText(kataArti);
                break;

            case "Doa Pulang Bepergian" :
                vidDoa = R.raw.doa_pulangberpergian;
                kataArti="Kami kembali dengan bertobat dan tetap beribadah kepada Tuhan kami ";
                txtArti.setText(kataArti);
                break;

            case "Doa Sesudah Belajar" :
                vidDoa = R.raw.doa_sesudahbelajar;
                kataArti="Ya Allah, tunjukkanlah kepada kami kebenaran, sehinggga\n" +
                        " kami dapat mengikutinya. Dan tunjukkanlah kepada kami kejelekan \n" +
                        "sehingga kami dapat menjauhinya";
                txtArti.setText(kataArti);
                break;

            case "Doa Hendak Mandi" :
                vidDoa = R.raw.doa_mandi;
                kataArti="Ya Allah ampunilah dosa kesalahanku dan berilah keluasaan di rumahku serta berkahilan pada rizqiku";
                txtArti.setText(kataArti);
                break;

            case "Doa Singgah di Suatu Tempat" :
                vidDoa = R.raw.doa_singgahditempat;
                kataArti="Aku berlindung dengan kalimat-kalimat Allah yang sempurna, dari kejahatan makhluk-Nya";
                txtArti.setText(kataArti);
                break;

            case "Doa Mendengar Angin Ribut" :
                vidDoa = R.raw.doa_anginribut;
                kataArti="Ya Allah, sesungguhnya aku memohon kepada-Mu kebaikannya, kebaikan apa yang terdapat padanya, dan kebaikan apa" +
                        " yang dibawanya dan aku berlindung kepada-Mu dari keburukannya";
                txtArti.setText(kataArti);
                break;

            case "Doa Bercermin" :
                vidDoa = R.raw.doa_bercermin;
                kataArti="Ya Allah sebagaimana Engkau telah ciptakan aku dengan baik, maka perbaikilah akhlakku";
                txtArti.setText(kataArti);
                break;

            case "Doa Ketika Lupa Doa Makan(teringat ditengah-tengah)" :
                vidDoa = R.raw.doa_lupadoamakan;
                kataArti="Dengan menyebut nama Allah diawal dan di akhirnya";
                txtArti.setText(kataArti);
                break;

            case "Doa Melihat Hal Yang Dibenci" :
                vidDoa = R.raw.doa_melihatdibenci;
                kataArti="Segala puji bagi Allah, atas segala keadaan";
                txtArti.setText(kataArti);
                break;

            case "Doa Melihat Orang Mendapat Musibah" :
                vidDoa = R.raw.doa_melihatorgmusibah;
                kataArti="Segala puji bagi Allah yang menyelamatkan aku dari sesuatu yang Allah memberi cobaan kepadamu" +
                        " dan Allah telah memberi kemuliaan kepadaku,melebihi orang banyak ";
                txtArti.setText(kataArti);
                break;

            case "Doa Melihat Hal Yang Disukai" :
                vidDoa = R.raw.doa_melihatdisukai;
                kataArti="Segala puji bagi Allah Yang dengan nikmat-Nya maka perkara-perkara yang baik menjadi sempurna";
                txtArti.setText(kataArti);
                break;

            case "Doa Sebelum Belajar" :
                vidDoa = R.raw.doa_sebelumbelajar;
                kataArti="Yaa Rabb, tambahkanlah ilmu bagiku, dan berilah aku kefahaman";
                txtArti.setText(kataArti);
                break;

            case "Doa Untuk Kedua Orang Tua" :
                vidDoa = R.raw.doa_orangtua;
                kataArti="Wahai Tuhanku, ampunilah aku dan kedua orang tuaku (Ibu dan Bapakku)," +
                        " sayangilah mereka seperti mereka menyayangiku diwaktu kecil";
                txtArti.setText(kataArti);
                break;
        }
        lokasivideo = Uri.parse("android.resource://"+getPackageName()+"/"+vidDoa);
        try{

            videoLayout.setVideoURI(lokasivideo);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    public void gmbrPlayKlik(View view) {
        gmbrPlay.setVisibility(view.GONE);
        videoLayout.start();
    }

    public void next_Doa(View view) {
        videoLayout.reset();
        nextdoa();

    }

    public void prev_Doa(View view) {
        videoLayout.reset();
        prevdoa();
    }

    private void nextdoa(){
        //Toast.makeText(this,"ini doa ke : "+posDoa,Toast.LENGTH_SHORT).show();

        if (posDoa>=0 && posDoa<37){
        posDoa++;
            pilihDoa();
            setDoa();

        }else {
            Toast.makeText(this,"Tidak ada doa sebelum ini",Toast.LENGTH_LONG).show();
            Intent a = new Intent(this,DoaActivity.class);
            startActivity(a);
        }
    }
    private void prevdoa(){
       // Toast.makeText(this,"ini doa ke : "+posDoa,Toast.LENGTH_SHORT).show();
        if (posDoa>0 && posDoa<=37){
            posDoa--;
            pilihDoa();
            setDoa();

        }else {
            Toast.makeText(this,"Tidak ada doa setelah ini",Toast.LENGTH_SHORT).show();
            Intent a = new Intent(this,DoaActivity.class);
            startActivity(a);
        }

    }


    private void pilihDoa(){

        switch (posDoa){

            case 0 :
                vidDoa = R.raw.doa_berpergian;
                kataArti = "Aku menitipkan kalian kepada Allah yang tidak akan hilang titipan-Nya";
                txtArti.setText(kataArti);
                break;

            case 1 :
                vidDoa = R.raw.doa_sebelummakan;
                kataArti="Ya Allah berkahilah apa yang engkau telah Engkau berikan kepada kami dan jagalah kami dari api neraka";
                txtArti.setText(kataArti);
                break;

            case 2 :
                vidDoa = R.raw.doa_sesudahmakan;
                kataArti="Segala puji bagi Allah yang telah mengkaruniakan makanan dan minuman pada kami serta menjadikan kami " +
                        "sebagai orang muslim";
                txtArti.setText(kataArti);
                break;

            case 3 :
                vidDoa = R.raw.doa_sebelumtidur;
                kataArti="Dengan menyebut nama Allah aku hidup dan dengan menyebut namamu aku mati";
                txtArti.setText(kataArti);
                break;

            case 4 :
                vidDoa = R.raw.doa_banguntidur;
                kataArti="Segala puji bagi Allah yang telah menghidupkan kita setelah Dia mematikan kita, dan kepada-Nya kita" +
                        "dibangkitkan";
                txtArti.setText(kataArti);
                break;

            case 5 :
                vidDoa = R.raw.doa_masukrumah;
                kataArti=" Dengan nama Allah kami masuk rumah, dengan nama Allah aku keluar rumah, serta kepada-Nya aku berserah diri";
                txtArti.setText(kataArti);
                break;

            case 6 :
                vidDoa = R.raw.doa_keluarrumah;
                kataArti="Dengan menyebut nama Allah, aku menyerahkan diriku kepada Allah dan tidak ada daya dan upaya dan " +
                        "kekuatan melainkan dengan pertolongan Allah saja";
                txtArti.setText(kataArti);
                break;

            case 7 :
                vidDoa = R.raw.doa_memasukiwc;
                kataArti="Dengan menyebut nama Allah. Ya Allah sesungguhnya aku berlindung kepada-Mu" +
                        "dari setan laki-laki dan setan perempuan";
                txtArti.setText(kataArti);
                break;

            case 8 :
                vidDoa = R.raw.doa_keluarwc;
                kataArti="Aku meminta ampunan-Mu. Segala puji bagi Allah yang menghilangkan penyakit dan menganugrahkanku kesehatan";
                txtArti.setText(kataArti);
                break;

            case 9 :
                vidDoa = R.raw.doa_selamat;
                kataArti="Ya Allah, kami mohon ampunan kepada-Mu seta limpahkan kesejahteraan agama dunia serta akhirat";
                txtArti.setText(kataArti);
                break;

            case 10 :
                vidDoa = R.raw.doa_masukmasjid;
                kataArti=" Wahai Allah, ampunilah segala dosaku dan bukakanlah pintu-pintu rahmatMu untukku";
                txtArti.setText(kataArti);
                break;

            case 11 :
                vidDoa = R.raw.doa_keluarmasjid;
                kataArti= "Wahai Tuhanku, sesungguhnya aku memohon kepada-Mu akan segala keutamaan-Mu";
                txtArti.setText(kataArti);
                break;

            case 12 :
                vidDoa = R.raw.doa_niatwudhu;
                kataArti="Aku niat berwudhu untuk menghilangkan hadats kecil, fardhu karena Allah";
                txtArti.setText(kataArti);
                break;

            case 13 :
                vidDoa = R.raw.doa_selesaiwudhu;
                kataArti="Aku bersaksi bahwa tidak ada Tuhan selain Allah yang Maha Esa,yang tidak ada sekutu bagi-Nya. " +
                        "Dan Aku bersaksi bahwa Muhammad adalah hamba dan utusan-Nya. Ya Allah, jadikanlah aku termasuk " +
                        "orang orang yang bertobat dan jadikan aku termasuk dalam orang orang yang suci";
                txtArti.setText(kataArti);
                txtArti.setTextSize(13);
                break;

            case 14 :
                vidDoa = R.raw.doa_berpakaian;
                kataArti="Ya Allah, sungguh aku memohon kepada-MU dari kebaikannya serta kebaikan yang ada padanya, dan aku berlindung " +
                        "pada-MU dari keburukannnya serta keburukan yang ada padanya ";
                txtArti.setText(kataArti);
                break;

            case 15 :
                vidDoa = R.raw.doa_melepaspakaian;
                kataArti="Dengan nama Allah Yang tiada Tuhan selain Dia";
                txtArti.setText(kataArti);
                break;

            case 16 :
                vidDoa = R.raw.doa_hujan;
                kataArti="Ya Allah, turunkanlah hujan yang bermanfaat";
                txtArti.setText(kataArti);
                break;

            case 17 :
                vidDoa = R.raw.doa_mendengarpetir;
                kataArti="Mahasuci Allah yang petir bertasbih dengan memuji-Nya dan begitu juga para malaikat, karena takut kepada-Nya";
                txtArti.setText(kataArti);
                break;

            case 18 :
                vidDoa = R.raw.doa_mimpiburuk;
                kataArti="Ya Allah sesungguhnya\n" +
                        "aku berlindung pada-Mu dari segala perbuatan setan dan dari keburukan mimpi ini";
                txtArti.setText(kataArti);
                break;

            case 19 :
                vidDoa = R.raw.doa_untukorangsakit;
                kataArti="Aku mohon kepada Allah yang Mahaagung, Rabb 'Arsy yang Agung, agar menyembuhkanmu";
                txtArti.setText(kataArti);
                break;

            case 20 :
                vidDoa = R.raw.doa_musafirpadaorangditinggal;
                kataArti="Aku menitipkan agama, amanah, dan penutup amalmu";
                txtArti.setText(kataArti);
                break;

            case 21 :
                vidDoa = R.raw.doa_kelapanganhati;
                kataArti="Ya Tuhan, lapangkanlah dadaku, mudahkanlah segala urusanku, dan lepaskanlah kekakuan lidahku, " +
                        "agar mereka mengerti perkataanku";
                txtArti.setText(kataArti);
                break;

            case 22 :
                vidDoa = R.raw.doa_adaorangbersin;
                kataArti="Semoga Allah memberkatimu";
                txtArti.setText(kataArti);
                break;

            case 23 :
                vidDoa = R.raw.doa_naikkendaraanlaut;
                kataArti="Dengan nama Allah yang menjalankan kendaraan ini berlayar dan berlabuh sesungguhnya Tuhanku Maha Pemaaf lagi Pengasih";
                txtArti.setText(kataArti);
                break;

            case 24 :
                vidDoa = R.raw.doa_naikkendaraan;
                kataArti=" Dengan nama Allah. Mahasuci Tuhan yang menundukan kendaraan ini untuk kami, sedang sebelumnya kami " +
                        "tidak mampu. Dan sesungguhnya kami akan kembali kepada Tuhan kami(dihari Kiamat)";
                txtArti.setText(kataArti);
                break;

            case 25 :
                vidDoa = R.raw.doa_beranjakdarimajelis;
                kataArti="Mahasuci Engkau, ya Allah , aku memuji kepada-Mu. Aku bersaksi bahwa tiada Tuhan yang berhak" +
                        " disembah selain Engkau. Aku minta ampun dan bertobat kepada-MU ";
                txtArti.setText(kataArti);
                break;

            case 26 :
                vidDoa = R.raw.doa_pulangberpergian;
                kataArti="Kami kembali dengan bertobat dan tetap beribadah kepada Tuhan kami ";
                txtArti.setText(kataArti);
                break;

            case 27 :
                vidDoa = R.raw.doa_sesudahbelajar;
                kataArti="Ya Allah, tunjukkanlah kepada kami kebenaran, sehinggga\n" +
                        " kami dapat mengikutinya. Dan tunjukkanlah kepada kami kejelekan \n" +
                        "sehingga kami dapat menjauhinya";
                txtArti.setText(kataArti);
                break;

            case 28 :
                vidDoa = R.raw.doa_mandi;
                kataArti="Ya Allah ampunilah dosa kesalahanku dan berilah keluasaan di rumahku serta berkahilan pada rizqiku";
                txtArti.setText(kataArti);
                break;

            case 29 :
                vidDoa = R.raw.doa_singgahditempat;
                kataArti="Aku berlindung dengan kalimat-kalimat Allah yang sempurna, dari kejahatan makhluk-Nya";
                txtArti.setText(kataArti);
                break;

            case 30 :
                vidDoa = R.raw.doa_anginribut;
                kataArti="Ya Allah, sesungguhnya aku memohon kepada-Mu kebaikannya, kebaikan apa yang terdapat padanya, dan kebaikan apa" +
                        " yang dibawanya dan aku berlindung kepada-Mu dari keburukannya";
                txtArti.setText(kataArti);
                break;

            case 31 :
                vidDoa = R.raw.doa_bercermin;
                kataArti="Ya Allah sebagaimana Engkau telah ciptakan aku dengan baik, maka perbaikilah akhlakku";
                txtArti.setText(kataArti);
                break;

            case 32 :
                vidDoa = R.raw.doa_lupadoamakan;
                kataArti="Dengan menyebut nama Allah diawal dan di akhirnya";
                txtArti.setText(kataArti);
                break;

            case 33 :
                vidDoa = R.raw.doa_melihatdibenci;
                kataArti="Segala puji bagi Allah, atas segala keadaan";
                txtArti.setText(kataArti);
                break;

            case 34 :
                vidDoa = R.raw.doa_melihatorgmusibah;
                kataArti="Segala puji bagi Allah yang menyelamatkan aku dari sesuatu yang Allah memberi cobaan kepadamu" +
                        " dan Allah telah memberi kemuliaan kepadaku,melebihi orang banyak ";
                txtArti.setText(kataArti);
                break;

            case 35 :
                vidDoa = R.raw.doa_melihatdisukai;
                kataArti="Segala puji bagi Allah Yang dengan nikmat-Nya maka perkara-perkara yang baik menjadi sempurna";
                txtArti.setText(kataArti);
                break;

            case 36 :
                vidDoa = R.raw.doa_sebelumbelajar;
                kataArti="Yaa Rabb, tambahkanlah ilmu bagiku, dan berilah aku kefahaman";
                txtArti.setText(kataArti);
                break;

            case 37 :
                vidDoa = R.raw.doa_orangtua;
                kataArti="Wahai Tuhanku, ampunilah aku dan kedua orang tuaku (Ibu dan Bapakku)," +
                        " sayangilah mereka seperti mereka menyayangiku diwaktu kecil";
                txtArti.setText(kataArti);
                break;
        }

    }


    private void setDoa(){

        lokasivideo = Uri.parse("android.resource://"+getPackageName()+"/"+vidDoa);
        try{

            videoLayout.setVideoURI(lokasivideo);

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
