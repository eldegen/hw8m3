package com.example.hw8m3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavGraph;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw8m3.databinding.FragmentMainBinding;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private FragmentMainBinding binding;
    private RecyclerAdapter recyclerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(LayoutInflater.from(requireContext()));
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createItems();
    }

    private void createItems() {
        ArrayList<ItemModel> list = new ArrayList<>();
        list.add(new ItemModel(R.drawable.img_rick, "Alive", "Rick Sanchez"));
        list.add(new ItemModel(R.drawable.img_morty, "Alive", "Morty Smith"));
        list.add(new ItemModel(R.drawable.img_albert, "Dead", "Albert Einstein"));
        list.add(new ItemModel(R.drawable.img_jerry, "Alive", "Jerry Smith"));
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(list);
        binding.recycler.setAdapter(recyclerAdapter);
    }
}