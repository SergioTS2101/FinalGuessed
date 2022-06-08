package com.stomeo.finalguessed.adapter;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;


import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.stomeo.finalguessed.LetrasList;
import com.stomeo.finalguessed.R;


import java.util.ArrayList;

public class EstadisticasAdapter extends RecyclerView.Adapter<EstadisticasAdapter.LetrasViewHolder>  {

    ArrayList<LetrasList> listaLetras;
    Context context;

    public EstadisticasAdapter(Context context, ArrayList<LetrasList> listaLetras){
        this.context = context;
        this.listaLetras =  listaLetras;
    }

    public EstadisticasAdapter.LetrasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.letras,null,false);
        return new EstadisticasAdapter.LetrasViewHolder(view);
    }

    public void onBindViewHolder(EstadisticasAdapter.LetrasViewHolder holder , int position){
        holder.textView.setText(String.valueOf(listaLetras.get(position).getLetra()));
    }

    public int getItemCount(){
        return listaLetras.size();
    }

    public class LetrasViewHolder extends RecyclerView.ViewHolder{
        TextView textView;

        public LetrasViewHolder(View itemView){
            super(itemView);
            textView = itemView.findViewById(R.id.idLetra);
        }
    }
}
