package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /*
    Increase the score for Team A by 3 points.
     */
    public void plus3(View view) {
        scoreTeamA = scoreTeamA + 3;
        Adisplay(scoreTeamA);
    }

    /*
  Increase the score for Team A by 2 points.
   */
    public void plus2(View view) {
        scoreTeamA = scoreTeamA + 2;
        Adisplay(scoreTeamA);
    }
    /*
      Increase the score for Team A by 1 points.
       */
    public void FreeThrow(View view) {
        scoreTeamA = scoreTeamA + 1;
        Adisplay(scoreTeamA);
    }
/*
-----------------------------------------------------------------------------
 */

    /*
      Increase the score for Team B by 3 points.
       */
    public void Bplus3(View view) {
        scoreTeamB = scoreTeamB + 3;
        Bdisplay(scoreTeamB);
    }

    /*
     Increase the score for Team B by 3 points.
      */
    public void Bplus2(View view) {
        scoreTeamB = scoreTeamB + 2;
        Bdisplay(scoreTeamB);
    }

    /*
         Increase the score for Team B by 3 points.
          */
    public void BFreeThrow(View view) {
        scoreTeamB = scoreTeamB + 1;
        Bdisplay(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //reset score of the Team A & B
    public void resetScore(View view) {
         scoreTeamA=0;
         scoreTeamB=0;
         Adisplay(scoreTeamA);
         Bdisplay(scoreTeamB);
    }

    public void Adisplay(int score) {
        TextView priceTextView = (TextView) findViewById(R.id.team_a_score);
        priceTextView.setText(score + "");
    }


    public void Bdisplay(int score) {
        TextView priceTextView = (TextView) findViewById(R.id.team_b_score);
        priceTextView.setText(score + "");
    }


}
