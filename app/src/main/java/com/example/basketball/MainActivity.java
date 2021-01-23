package com.example.basketball;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    final String TEAM_A_COUNTER_KEY = "teamA";
    final String TEAM_B_COUNTER_KEY = "teamB";

    Button btnTeamAcounter;


    Button btnTeamBcounter;


    TextView tvTeamAcounter;


    TextView tvTeamBcounter;

    int counterA = 0;
    int counterB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        tvTeamAcounter.setText("0");
        tvTeamBcounter.setText("0");


        if (savedInstanceState != null) {
            counterA = savedInstanceState.getInt(TEAM_A_COUNTER_KEY);
            counterB = savedInstanceState.getInt(TEAM_B_COUNTER_KEY);
        }



        btnTeamAcounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterA += 1;
                tvTeamAcounter.setText(counterA + "");
            }
        });

        btnTeamBcounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterB += 1;
                tvTeamBcounter.setText(counterB + "");
            }
        });

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(TEAM_A_COUNTER_KEY, counterA);
        outState.putInt(TEAM_B_COUNTER_KEY, counterB);
    }

    private void initView() {
        btnTeamAcounter = findViewById(R.id.btnTeamACounter);
        btnTeamBcounter = findViewById(R.id.btnTeamBCounter);
        tvTeamAcounter = findViewById(R.id.tvTeamACounter);
        tvTeamBcounter = findViewById(R.id.tvTeamBCounter);
    }
}




