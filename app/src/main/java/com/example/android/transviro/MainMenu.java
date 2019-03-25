package com.example.android.transviro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void rewardClick(View v){
        Intent startNewActivity = new Intent(this, RewardDashboard.class);
        startActivity(startNewActivity);
    }

    public void pointsClick(View v){
        Intent startNewActivity = new Intent(this, PointsScreen.class);
        startActivity(startNewActivity);
    }

    public void leaderboardClick(View v){
        Intent startNewActivity = new Intent(this, LeaderboardScreen.class);
        startActivity(startNewActivity);
    }




}
