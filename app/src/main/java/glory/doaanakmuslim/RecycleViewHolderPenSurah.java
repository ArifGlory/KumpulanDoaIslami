package glory.doaanakmuslim;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Glory on 03/10/2016.
 */
public class RecycleViewHolderPenSurah extends RecyclerView.ViewHolder {

    public TextView txtArabnya,txtArtinya,txtNomornya;



    public RecycleViewHolderPenSurah(View itemView) {
        super(itemView);

        txtArabnya = (TextView) itemView.findViewById(R.id.txtArab);
        txtArtinya = (TextView) itemView.findViewById(R.id.txtArtisurah);
        txtNomornya = (TextView) itemView.findViewById(R.id.txtNomorAyat);



    }
}
