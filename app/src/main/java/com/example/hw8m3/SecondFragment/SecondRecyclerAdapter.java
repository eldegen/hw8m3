package com.example.hw8m3.SecondFragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw8m3.IOnClick;
import com.example.hw8m3.databinding.ItemSecondRecyclerBinding;

import java.util.ArrayList;

public class SecondRecyclerAdapter extends RecyclerView.Adapter<SecondViewHolder> {
    private ArrayList<SecondItemModel> list = new ArrayList<>();
    private IOnClick listener;

    public SecondRecyclerAdapter(ArrayList<SecondItemModel> list, IOnClick listener) {
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public SecondViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemSecondRecyclerBinding binding = ItemSecondRecyclerBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new SecondViewHolder(binding, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull SecondViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
