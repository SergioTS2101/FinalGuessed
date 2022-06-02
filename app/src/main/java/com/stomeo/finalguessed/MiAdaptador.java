package com.stomeo.finalguessed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolder> {
    private final List<ArrayListElementos> mData;
    private final LayoutInflater mInflater;
    final OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(ArrayListElementos item);
    }

    public MiAdaptador(Context context, List<ArrayListElementos> itemList, OnItemClickListener listener) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = itemList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.activity_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.bindData(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logo;
        TextView opcion;

        ViewHolder(View itemView) {
            super(itemView);
            logo = itemView.findViewById(R.id.IconoImagen);
            opcion = itemView.findViewById(R.id.nameTextView);
        }

        void bindData(final ArrayListElementos item) {
            opcion.setText(item.getOpcion());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }
}
