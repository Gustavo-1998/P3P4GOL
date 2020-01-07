package mx.edu.tesoem.isc.gol.p3p4gol;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class contenido extends BaseAdapter {

    ArrayList<String> arreglo;
    Context context;


    public contenido(Context context, ArrayList<String>arreglo) {
        this.context = context;
        this.arreglo = arreglo;
    }

    @Override
    public int getCount() {
        return arreglo.size();
    }

    @Override
    public Object getItem(int position) {
        return arreglo.get(position);
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View ConvertView, ViewGroup parent) {
        if(ConvertView == null){
            LayoutInflater LayoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            ConvertView = LayoutInflater.inflate(R.layout.elementos,null);
        }
        TextView txtTitulo = ConvertView.findViewById(R.id.txtnombre);
        txtTitulo.setText(arreglo.get(position));
        return ConvertView;
    }
}
