package com.example.hw8m3.MainFragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw8m3.IOnClick;
import com.example.hw8m3.R;
import com.example.hw8m3.Activities.SecondActivity;
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
        recyclerAdapter = new RecyclerAdapter(list, new IOnClick() {
            @Override
            public void onClick(int pos) {
                Log.d("eldeg", "click");
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                intent.putExtra("F_CHANGER", "sel2");
                startActivity(intent);
            }
        });
        binding.recycler.setAdapter(recyclerAdapter);
    }
}