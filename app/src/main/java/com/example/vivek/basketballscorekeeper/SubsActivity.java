package com.example.vivek.basketballscorekeeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by vivek on 11/12/15.
 */
public class SubsActivity extends AppCompatActivity {
    int j;
    String[] keys = new String[12];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_substitues);

        TextView teamsa = (TextView) findViewById(R.id.teasa);
        TextView teamsb = (TextView) findViewById(R.id.teasb);

        String extractsa = getIntent().getStringExtra("TeamAName");
        teamsa.setText("" + extractsa);
        String extractsb = getIntent().getStringExtra("TeamBName");
        teamsb.setText("" + extractsb);

        for (j=0; j<12; j++){
            keys[j] = "Key" + j;
        }
    }

    public void dataAct(View view){
        EditText[] playersa = new EditText[7];
        EditText[] playersb = new EditText[7];

        playersa[0] = (EditText) findViewById(R.id.playeras1);
        playersa[1] = (EditText) findViewById(R.id.playeras2);
        playersa[2] = (EditText) findViewById(R.id.playeras3);
        playersa[3] = (EditText) findViewById(R.id.playeras4);
        playersa[4] = (EditText) findViewById(R.id.playeras5);
        playersa[5] = (EditText) findViewById(R.id.playeras6);
        playersa[6] = (EditText) findViewById(R.id.playeras7);


        playersb[0] = (EditText) findViewById(R.id.playerbs1);
        playersb[1] = (EditText) findViewById(R.id.playerbs2);
        playersb[2] = (EditText) findViewById(R.id.playerbs3);
        playersb[3] = (EditText) findViewById(R.id.playerbs4);
        playersb[4] = (EditText) findViewById(R.id.playerbs5);
        playersb[5] = (EditText) findViewById(R.id.playerbs6);
        playersb[6] = (EditText) findViewById(R.id.playerbs7);

        Intent dataact = new Intent (this, DataActivity.class);
        dataact.putExtra("TeamAName", getIntent().getStringExtra("TeamAName"));
        dataact.putExtra("TeamBName", getIntent().getStringExtra("TeamBName"));
        for (j = 0; j < 5; j++) {
            dataact.putExtra(keys[j] + "a", getIntent().getStringExtra(keys[j] + "a"));
            dataact.putExtra(keys[j] + "b", getIntent().getStringExtra(keys[j] + "b"));
        }
        for (j=0; j<7; j++){
            dataact.putExtra(keys[j+5]+"a", playersa[j].getText().toString());
            dataact.putExtra(keys[j+5]+"b", playersb[j].getText().toString());
        }

        startActivity(dataact);

    }
}
