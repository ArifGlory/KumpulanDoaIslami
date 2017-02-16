package glory.doaanakmuslim;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Glory on 03/10/2016.
 */
public class RecycleViewHolderDoa extends RecyclerView.ViewHolder {

    public TextView txtNamaDoa,txtIsiBerita;
    public ImageView gmbrList;
    public RelativeLayout relaDoa;


    public RecycleViewHolderDoa(View itemView) {
        super(itemView);

        txtNamaDoa = (TextView) itemView.findViewById(R.id.txtJudul);
       // txtIsiBerita = (TextView) itemView.findViewById(R.id.txtIsi);
        gmbrList = (ImageView) itemView.findViewById(R.id.gmbrlist);
        relaDoa = (RelativeLayout) itemView.findViewById(R.id.relaDoa);


    }
}
