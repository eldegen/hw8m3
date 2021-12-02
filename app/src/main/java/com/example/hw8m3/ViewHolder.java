package com.example.hw8m3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw8m3.databinding.ItemRecyclerBinding;

public class ViewHolder extends RecyclerView.ViewHolder {
    private ItemRecyclerBinding binding;

    public ViewHolder(@NonNull ItemRecyclerBinding itemView) {
        super(itemView.getRoot());
        binding = itemView;
    }

    public void onBind(ItemModel model) {
        binding.ivPerson.setImageResource(model.getPersonImage());
        binding.tvStatus.setText(model.getPersonStatus());
        binding.tvNameSurname.setText(model.getPersonNameSurname());
    }
}
