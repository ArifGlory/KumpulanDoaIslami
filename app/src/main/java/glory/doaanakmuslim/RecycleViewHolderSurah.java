package glory.doaanakmuslim;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Glory on 03/10/2016.
 */
public class RecycleViewHolderSurah extends RecyclerView.ViewHolder {

    public TextView txtNamaSurah,txtIsiBerita;
    public ImageView gmbrListSurah;
    public RelativeLayout relaSurah;

    public RecycleViewHolderSurah(View itemView) {
        super(itemView);

        txtNamaSurah = (TextView) itemView.findViewById(R.id.txtJudulSurah);
       // txtIsiBerita = (TextView) itemView.findViewById(R.id.txtIsi);
        gmbrListSurah = (ImageView) itemView.findViewById(R.id.gmbrlistSurah);
        relaSurah = (RelativeLayout) itemView.findViewById(R.id.relaSurah);


    }
}
