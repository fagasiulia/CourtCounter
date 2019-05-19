package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */

    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Adds three points for Team A
     */
    public void addThreePointsTeamA(View v){
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    /**
     * Adds three points for Team B
     */
    public void addThreePointsTeamB(View v){
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }

    /**
     * Adds two points for Team A
     */
    public void addTwoPointsTeamA(View v){
        teamAScore +=2;
        displayForTeamA(teamAScore);
    }

    /**
     * Adds two points for Team B
     */
    public void addTwoPointsTeamB(View v){
        teamBScore +=2;
        displayForTeamB(teamBScore);
    }

    /**
     * Free throw adds one point for Team A
     */
    public void freeThrowTeamA(View v){
        teamAScore +=1;
        displayForTeamA(teamAScore);
    }

    /**
     * Free throw adds one point for Team A
     */
    public void freeThrowTeamB(View v){
        teamBScore +=1;
        displayForTeamB(teamBScore);
    }

    /**
     * Reset the score
     */
    public void resetScore(View w){
        teamAScore = 0;
        teamBScore = 0;

        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}
