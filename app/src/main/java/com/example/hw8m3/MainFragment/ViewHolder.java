package com.example.hw8m3.MainFragment;

import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw8m3.IOnClick;
import com.example.hw8m3.databinding.ItemRecyclerBinding;

public class ViewHolder extends RecyclerView.ViewHolder {
    private ItemRecyclerBinding binding;
    private IOnClick iOnClick;

    public ViewHolder(@NonNull ItemRecyclerBinding itemView, IOnClick listener) {
        super(itemView.getRoot());
        binding = itemView;
        iOnClick = listener;

        binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iOnClick.onClick(getAdapterPosition());
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
