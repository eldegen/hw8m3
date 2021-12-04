package com.example.hw8m3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw8m3.databinding.FragmentMainBinding;
import com.example.hw8m3.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;
    private SecondRecyclerAdapter secondRecyclerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(LayoutInflater.from(requireContext()));
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createItems();
    }

    private void createItems() {
        ArrayList<SecondItemModel> list = new ArrayList<>();
        list.add(new SecondItemModel("Planet", "Earth (C-137)"));
        list.add(new SecondItemModel("Cluster", "Abadango"));
        list.add(new SecondItemModel("Space station", "Citadel of Ricks"));
        list.add(new SecondItemModel("Planet", "Worldender's lair"));
        list.add(new SecondItemModel("Microverse", "Anatomy Park"));
        list.add(new SecondItemModel("TV", "Interdimensional Cable"));
        list.add(new SecondItemModel("Resort", "Immortality Field Resort"));
        list.add(new SecondItemModel("Planet", "Post-Apocalyptic Earth"));
        list.add(new SecondItemModel("Planet", "Purge Planet"));
        list.add(new SecondItemModel("Planet", "Venzenulon 7"));
        list.add(new SecondItemModel("Planet", "Bepis 9"));
        list.add(new SecondItemModel("Planet", "Cronenberg Earth"));
        list.add(new SecondItemModel("Planet", "Nuptia 4"));
        list.add(new SecondItemModel("Fantasy town", "Giant's Town"));
        list.add(new SecondItemModel("Planet", "Bird World"));
        list.add(new SecondItemModel("Space station", "St. Gloopy Noops Hospital"));
        list.add(new SecondItemModel("Planet", "Earth (5-126)"));
        list.add(new SecondItemModel("Dream", "Mr. Goldenfold's dream"));
        list.add(new SecondItemModel("Planet", "Gromflom Prime"));
        list.add(new SecondItemModel("Planet", "Earth (Rpl. Dimension)"));

        secondRecyclerAdapter = new SecondRecyclerAdapter(list);
        binding.secondRecycler.setAdapter(secondRecyclerAdapter);
        binding.secondRecycler.setHasFixedSize(true);
        binding.secondRecycler.setLayoutManager(new GridLayoutManager(getContext(),2));
    }
}