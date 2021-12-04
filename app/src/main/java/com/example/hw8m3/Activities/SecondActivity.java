package com.example.hw8m3.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;
import android.util.Log;

import com.example.hw8m3.FourthFragment;
import com.example.hw8m3.R;
import com.example.hw8m3.ThirdFragment;
import com.example.hw8m3.databinding.ActivityMainBinding;
import com.example.hw8m3.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportFragmentManager().beginTransaction().add(R.id.fl_container, new ThirdFragment()).commit();

        Bundle extras = getIntent().getExtras();
        String val = extras.getString("F_CHANGER");

        if (val.equals("sel1")) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, new ThirdFragment()).commit();
            Log.d("pizza", "selected ThirdFragment");
        } else {
            getSupportFragmentManager().beginTransaction().add(R.id.fl_container, new FourthFragment()).commit();
            Log.d("pizza", "selected FourthFragment");
        }
    }
}