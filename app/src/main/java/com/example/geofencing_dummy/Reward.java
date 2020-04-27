package com.example.geofencing_dummy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Reward extends AppCompatActivity {
    private TextView reward;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward);
        reward = findViewById(R.id.reward);
        reward.setText("" + Reward_Container.reward);
    }
}
