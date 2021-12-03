package com.example.hw8m3;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw8m3.databinding.ItemRecyclerBinding;
import com.example.hw8m3.databinding.ItemSecondRecyclerBinding;

public class SecondViewHolder extends RecyclerView.ViewHolder {
    private ItemSecondRecyclerBinding binding;

    public SecondViewHolder(@NonNull ItemSecondRecyclerBinding itemView) {
        super(itemView.getRoot());
        binding = itemView;
    }

    public void onBind(SecondItemModel model) {
        binding.tvLocation.setText(model.getLocation());
        binding.tvName.setText(model.getName());
    }
}
