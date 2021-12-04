package com.example.hw8m3;

import android.util.Log;
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

        binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("pizza", "on click");
            }
        });
    }

    public void onBind(ItemModel model) {
        binding.ivPerson.setImageResource(model.getPersonImage());
        binding.tvStatus.setText(model.getPersonStatus());
        binding.tvNameSurname.setText(model.getPersonNameSurname());
    }
}
