package com.example.vivek.basketballscorekeeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by vivek on 11/12/15.
 */
public class DataActivity extends AppCompatActivity {

    int teamascore = 0;
    int teambscore = 0;

    int j=0;
    String[] keys = new String[12];

    playerStats[] playera = new playerStats[12];
    playerStats[] playerb = new playerStats[12];

    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_data);

        TextView teamaa = (TextView) findViewById(R.id.teama);
        TextView teambb = (TextView) findViewById(R.id.teamb);

        String extracta = getIntent().getStringExtra("TeamAName");
        teamaa.setText("" + extracta);
        String extractb = getIntent().getStringExtra("TeamBName");
        teambb.setText("" + extractb);
        displaya(0);
        displayb(0);

        for (j=0; j<12; j++){
            keys[j] = "Key" + j;
            playera[j]=new playerStats( getIntent().getStringExtra(keys[j] + "a"));
            playerb[j]=new playerStats( getIntent().getStringExtra(keys[j] + "b"));
        }

    }

    private void popMenuA(View view, final int pts, final int thr, final int twos,
                          final int fthrw, final int foul, final int tover) {
        PopupMenu menA = new PopupMenu(this, view);

        for (j=0; j<12; j++){
            menA.getMenu().add(getIntent().getStringExtra(keys[j]+"a"));
        }
        menA.getMenuInflater().inflate(R.menu.popup_menu, menA.getMenu());

        menA.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                for (j = 0; j < 12; j++) {
                    if (item.getTitle().toString() == getIntent().getStringExtra(keys[j] + "a")) {
                        playera[j].addStats(pts, thr, twos, fthrw, foul, tover);
                    }
                }
                return true;
            }
        });
        menA.show();
    }

    private void popMenuB(View view, final int pts, final int thr, final int twos,
                          final int fthrw, final int foul, final int tover) {
        PopupMenu menB = new PopupMenu(this, view);

        for (j=0; j<12; j++){
            menB.getMenu().add(getIntent().getStringExtra(keys[j]+"b"));
        }
        menB.getMenuInflater().inflate(R.menu.popup_menu, menB.getMenu());
        menB.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                for(j=0; j<12; j++) {
                    if (item.getTitle().toString() == getIntent().getStringExtra(keys[j]+"b")) {
                        playerb[j].addStats(pts, thr, twos, fthrw, foul, tover);
                    }
                }

                return true;
            }
        });
        menB.show();
    }

    public void threPtsA(View view) {
        popMenuA(view, 3, 1, 0, 0, 0, 0);
        displaya(3);
    }
    public void threPtsB(View view) {
        popMenuB(view, 3, 1, 0, 0, 0, 0);
        displayb(3);
    }
    public void twoPtsA(View view) {
        popMenuA(view, 2, 0, 1, 0, 0, 0);
        displaya(2);
    }
    public void twoPtsB(View view) {
        popMenuB(view, 2, 0, 1, 0, 0, 0);
        displayb(2);
    }
    public void freThrwA(View view) {
        popMenuA(view, 1, 0, 0, 1, 0, 0);
        displaya(1);
    }
    public void freThrwB(View view) {
        popMenuB(view, 1, 0, 0, 1, 0, 0);
        displayb(1);
    }
    public void foulA(View view) {
        popMenuA(view, 0, 0, 0, 0, 1, 0);
    }
    public void foulB(View view) {
        popMenuB(view, 0, 0, 0, 0, 1, 0);
    }
    public void turnOverA(View view) {
        popMenuA(view, 0, 0, 0, 0, 0, 1);
    }
    public void turnOverB(View view) {
        popMenuB(view, 0, 0, 0, 0, 0, 1);
    }

    public void doReset(View view) {
        teamascore = 0;
        teambscore = 0;
        displaya(teamascore);
        displayb(teambscore);

        Toast tst = Toast.makeText(getApplicationContext(), "Scores Reset", Toast.LENGTH_LONG);
        tst.show();

    }

    private void displaya(int number) {
        TextView teamavw = (TextView) findViewById(R.id.scorea);
        teamascore = teamascore + number;
        teamavw.setText("" + teamascore);
    }

    private void displayb(int number) {
        TextView teambvw = (TextView) findViewById(R.id.scoreb);
        teambscore = teambscore + number;
        teambvw.setText("" + teambscore);
    }

    public void showScores(View view) {

        Intent ascore = new Intent(this, ScoresActivity.class);
        for(j=0; j<12; j++) {
            ascore.putExtra(keys[j]+"a", playera[j]);
            ascore.putExtra(keys[j]+"b", playerb[j]);
        }
        ascore.putExtra("TeamAName", getIntent().getStringExtra("TeamAName"));
        ascore.putExtra("TeamBName", getIntent().getStringExtra("TeamBName"));

        TextView scorea = (TextView) findViewById(R.id.scorea);
        TextView scoreb = (TextView) findViewById(R.id.scoreb);

        ascore.putExtra("ScoreA", scorea.getText().toString());
        ascore.putExtra("ScoreB", scoreb.getText().toString());

        startActivity(ascore);
    }
}

