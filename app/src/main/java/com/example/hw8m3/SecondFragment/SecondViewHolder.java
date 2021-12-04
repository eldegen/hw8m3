package com.example.hw8m3.SecondFragment;

import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw8m3.IOnClick;
import com.example.hw8m3.databinding.ItemSecondRecyclerBinding;

public class SecondViewHolder extends RecyclerView.ViewHolder {
    private ItemSecondRecyclerBinding binding;
    private IOnClick iOnClick;

    public SecondViewHolder(@NonNull ItemSecondRecyclerBinding itemView, IOnClick listener) {
        super(itemView.getRoot());
        binding = itemView;
        iOnClick = listener;

        binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iOnClick.onClick(getAdapterPosition());
                Log.d("pizza", "on second click");
            }
        });
    }

    public void onBind(SecondItemModel model) {
        binding.tvLocation.setText(model.getLocation());
        binding.tvName.setText(model.getName());
    }
}
