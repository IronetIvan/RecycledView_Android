package com.example.recycledview_android.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycledview_android.R;
import com.example.recycledview_android.versiones.Version;

import java.util.ArrayList;

public class AdaptadorRecycler extends RecyclerView.Adapter<AdaptadorRecycler.miHolerAdapter> {
    Context ctx;
    ArrayList<Version> listaVersiones;
    OnMiRecyclerListener listener;

    public AdaptadorRecycler(Context ctx, ArrayList<Version> listaVersiones, OnMiRecyclerListener listener) {
        this.ctx = ctx;
        this.listaVersiones = listaVersiones;
        listener = (OnMiRecyclerListener)ctx;
    }

    

    @NonNull
    @Override
    public miHolderAdaptador onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.activity_main, parent, false);
        miHolderAdaptador miAdaptador = new AdaptadorRecycler(view);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRecycler holder, int position) {

    }

    @Override
    public int getItemCount() {
        return listaVersiones.size();
    }

    public interface OnMiRecyclerListener{
        public void onMiRecyclerListener(Version version);
    }
}
