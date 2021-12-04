package com.example.hw8m3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw8m3.databinding.ItemSecondRecyclerBinding;

import java.util.ArrayList;

public class SecondRecyclerAdapter extends RecyclerView.Adapter<SecondViewHolder> {
    private ArrayList<SecondItemModel> list = new ArrayList<>();

    public SecondRecyclerAdapter(ArrayList<SecondItemModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public SecondViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemSecondRecyclerBinding binding = ItemSecondRecyclerBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new SecondViewHolder(binding);
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
