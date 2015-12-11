package com.example.vivek.basketballscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by vivek on 11/12/15.
 */
public class ScoresActivity extends AppCompatActivity {

    int j;
    String[] keys = new String[12];


    playerStats[] playera = new playerStats[12];
    playerStats[] playerb = new playerStats[12];

    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_scores);

        for(j=0; j<12; j++) {
            keys[j] = "Key" + j;
            playera[j] = new playerStats("");
            playerb[j] = new playerStats("");
            playera[j] =  (playerStats) getIntent().getParcelableExtra(keys[j] + "a");
            playerb[j] =  (playerStats) getIntent().getParcelableExtra(keys[j] + "b");
        }

        TextView teamA = (TextView) findViewById(R.id.scorenamea);
        teamA.setText(getIntent().getStringExtra("TeamAName") + "  -  " + getIntent().getStringExtra("ScoreA"));
        TextView teamB = (TextView) findViewById(R.id.scorenameb);
        teamB.setText(getIntent().getStringExtra("TeamBName") + "  -  " + getIntent().getStringExtra("ScoreB"));
        loadScores();

    }

    public void loadScores(){

        TextView[] box = new TextView[84];

        box[0] = (TextView) findViewById(R.id.box21);
        box[1] = (TextView) findViewById(R.id.box22);
        box[2] = (TextView) findViewById(R.id.box23);
        box[3] = (TextView) findViewById(R.id.box24);
        box[4] = (TextView) findViewById(R.id.box25);
        box[5] = (TextView) findViewById(R.id.box26);
        box[6] = (TextView) findViewById(R.id.box27);

        box[7] = (TextView) findViewById(R.id.box31);
        box[8] = (TextView) findViewById(R.id.box32);
        box[9] = (TextView) findViewById(R.id.box33);
        box[10] = (TextView) findViewById(R.id.box34);
        box[11] = (TextView) findViewById(R.id.box35);
        box[12] = (TextView) findViewById(R.id.box36);
        box[13] = (TextView) findViewById(R.id.box37);

        box[14] = (TextView) findViewById(R.id.box41);
        box[15] = (TextView) findViewById(R.id.box42);
        box[16] = (TextView) findViewById(R.id.box43);
        box[17] = (TextView) findViewById(R.id.box44);
        box[18] = (TextView) findViewById(R.id.box45);
        box[19] = (TextView) findViewById(R.id.box46);
        box[20] = (TextView) findViewById(R.id.box47);

        box[21] = (TextView) findViewById(R.id.box51);
        box[22] = (TextView) findViewById(R.id.box52);
        box[23] = (TextView) findViewById(R.id.box53);
        box[24] = (TextView) findViewById(R.id.box54);
        box[25] = (TextView) findViewById(R.id.box55);
        box[26] = (TextView) findViewById(R.id.box56);
        box[27] = (TextView) findViewById(R.id.box57);

        box[28] = (TextView) findViewById(R.id.box61);
        box[29] = (TextView) findViewById(R.id.box62);
        box[30] = (TextView) findViewById(R.id.box63);
        box[31] = (TextView) findViewById(R.id.box64);
        box[32] = (TextView) findViewById(R.id.box65);
        box[33] = (TextView) findViewById(R.id.box66);
        box[34] = (TextView) findViewById(R.id.box67);

        box[35] = (TextView) findViewById(R.id.box71);
        box[36] = (TextView) findViewById(R.id.box72);
        box[37] = (TextView) findViewById(R.id.box73);
        box[38] = (TextView) findViewById(R.id.box74);
        box[39] = (TextView) findViewById(R.id.box75);
        box[40] = (TextView) findViewById(R.id.box76);
        box[41] = (TextView) findViewById(R.id.box77);

        box[42] = (TextView) findViewById(R.id.box81);
        box[43] = (TextView) findViewById(R.id.box82);
        box[44] = (TextView) findViewById(R.id.box83);
        box[45] = (TextView) findViewById(R.id.box84);
        box[46] = (TextView) findViewById(R.id.box85);
        box[47] = (TextView) findViewById(R.id.box86);
        box[48] = (TextView) findViewById(R.id.box87);

        box[49] = (TextView) findViewById(R.id.box91);
        box[50] = (TextView) findViewById(R.id.box92);
        box[51] = (TextView) findViewById(R.id.box93);
        box[52] = (TextView) findViewById(R.id.box94);
        box[53] = (TextView) findViewById(R.id.box95);
        box[54] = (TextView) findViewById(R.id.box96);
        box[55] = (TextView) findViewById(R.id.box97);

        box[56] = (TextView) findViewById(R.id.box101);
        box[57] = (TextView) findViewById(R.id.box102);
        box[58] = (TextView) findViewById(R.id.box103);
        box[59] = (TextView) findViewById(R.id.box104);
        box[60] = (TextView) findViewById(R.id.box105);
        box[61] = (TextView) findViewById(R.id.box106);
        box[62] = (TextView) findViewById(R.id.box107);

        box[63] = (TextView) findViewById(R.id.box111);
        box[64] = (TextView) findViewById(R.id.box112);
        box[65] = (TextView) findViewById(R.id.box113);
        box[66] = (TextView) findViewById(R.id.box114);
        box[67] = (TextView) findViewById(R.id.box115);
        box[68] = (TextView) findViewById(R.id.box116);
        box[69] = (TextView) findViewById(R.id.box117);

        box[70] = (TextView) findViewById(R.id.box121);
        box[71] = (TextView) findViewById(R.id.box122);
        box[72] = (TextView) findViewById(R.id.box123);
        box[73] = (TextView) findViewById(R.id.box124);
        box[74] = (TextView) findViewById(R.id.box125);
        box[75] = (TextView) findViewById(R.id.box126);
        box[76] = (TextView) findViewById(R.id.box127);

        box[77] = (TextView) findViewById(R.id.box131);
        box[78] = (TextView) findViewById(R.id.box132);
        box[79] = (TextView) findViewById(R.id.box133);
        box[80] = (TextView) findViewById(R.id.box134);
        box[81] = (TextView) findViewById(R.id.box135);
        box[82] = (TextView) findViewById(R.id.box136);
        box[83] = (TextView) findViewById(R.id.box137);

        int k =0;
        for(j=0; j<12; j++) {
            box[k].setText(playera[j].name);
            box[k + 1].setText("" + playera[j].points);
            box[k + 2].setText("" + playera[j].threes);
            box[k + 3].setText("" + playera[j].twoos);
            box[k + 4].setText("" + playera[j].freethrows);
            box[k + 5].setText("" + playera[j].fouls);
            box[k + 6].setText("" + playera[j].turnovers);
            k = k+7;
        }


        TextView[] boxb = new TextView[84];

        boxb[0] = (TextView) findViewById(R.id.box21b);
        boxb[1] = (TextView) findViewById(R.id.box22b);
        boxb[2] = (TextView) findViewById(R.id.box23b);
        boxb[3] = (TextView) findViewById(R.id.box24b);
        boxb[4] = (TextView) findViewById(R.id.box25b);
        boxb[5] = (TextView) findViewById(R.id.box26b);
        boxb[6] = (TextView) findViewById(R.id.box27b);

        boxb[7] = (TextView) findViewById(R.id.box31b);
        boxb[8] = (TextView) findViewById(R.id.box32b);
        boxb[9] = (TextView) findViewById(R.id.box33b);
        boxb[10] = (TextView) findViewById(R.id.box34b);
        boxb[11] = (TextView) findViewById(R.id.box35b);
        boxb[12] = (TextView) findViewById(R.id.box36b);
        boxb[13] = (TextView) findViewById(R.id.box37b);

        boxb[14] = (TextView) findViewById(R.id.box41b);
        boxb[15] = (TextView) findViewById(R.id.box42b);
        boxb[16] = (TextView) findViewById(R.id.box43b);
        boxb[17] = (TextView) findViewById(R.id.box44b);
        boxb[18] = (TextView) findViewById(R.id.box45b);
        boxb[19] = (TextView) findViewById(R.id.box46b);
        boxb[20] = (TextView) findViewById(R.id.box47b);

        boxb[21] = (TextView) findViewById(R.id.box51b);
        boxb[22] = (TextView) findViewById(R.id.box52b);
        boxb[23] = (TextView) findViewById(R.id.box53b);
        boxb[24] = (TextView) findViewById(R.id.box54b);
        boxb[25] = (TextView) findViewById(R.id.box55b);
        boxb[26] = (TextView) findViewById(R.id.box56b);
        boxb[27] = (TextView) findViewById(R.id.box57b);

        boxb[28] = (TextView) findViewById(R.id.box61b);
        boxb[29] = (TextView) findViewById(R.id.box62b);
        boxb[30] = (TextView) findViewById(R.id.box63b);
        boxb[31] = (TextView) findViewById(R.id.box64b);
        boxb[32] = (TextView) findViewById(R.id.box65b);
        boxb[33] = (TextView) findViewById(R.id.box66b);
        boxb[34] = (TextView) findViewById(R.id.box67b);

        boxb[35] = (TextView) findViewById(R.id.box71b);
        boxb[36] = (TextView) findViewById(R.id.box72b);
        boxb[37] = (TextView) findViewById(R.id.box73b);
        boxb[38] = (TextView) findViewById(R.id.box74b);
        boxb[39] = (TextView) findViewById(R.id.box75b);
        boxb[40] = (TextView) findViewById(R.id.box76b);
        boxb[41] = (TextView) findViewById(R.id.box77b);

        boxb[42] = (TextView) findViewById(R.id.box81b);
        boxb[43] = (TextView) findViewById(R.id.box82b);
        boxb[44] = (TextView) findViewById(R.id.box83b);
        boxb[45] = (TextView) findViewById(R.id.box84b);
        boxb[46] = (TextView) findViewById(R.id.box85b);
        boxb[47] = (TextView) findViewById(R.id.box86b);
        boxb[48] = (TextView) findViewById(R.id.box87b);

        boxb[49] = (TextView) findViewById(R.id.box91b);
        boxb[50] = (TextView) findViewById(R.id.box92b);
        boxb[51] = (TextView) findViewById(R.id.box93b);
        boxb[52] = (TextView) findViewById(R.id.box94b);
        boxb[53] = (TextView) findViewById(R.id.box95b);
        boxb[54] = (TextView) findViewById(R.id.box96b);
        boxb[55] = (TextView) findViewById(R.id.box97b);

        boxb[56] = (TextView) findViewById(R.id.box101b);
        boxb[57] = (TextView) findViewById(R.id.box102b);
        boxb[58] = (TextView) findViewById(R.id.box103b);
        boxb[59] = (TextView) findViewById(R.id.box104b);
        boxb[60] = (TextView) findViewById(R.id.box105b);
        boxb[61] = (TextView) findViewById(R.id.box106b);
        boxb[62] = (TextView) findViewById(R.id.box107b);

        boxb[63] = (TextView) findViewById(R.id.box111b);
        boxb[64] = (TextView) findViewById(R.id.box112b);
        boxb[65] = (TextView) findViewById(R.id.box113b);
        boxb[66] = (TextView) findViewById(R.id.box114b);
        boxb[67] = (TextView) findViewById(R.id.box115b);
        boxb[68] = (TextView) findViewById(R.id.box116b);
        boxb[69] = (TextView) findViewById(R.id.box117b);

        boxb[70] = (TextView) findViewById(R.id.box121b);
        boxb[71] = (TextView) findViewById(R.id.box122b);
        boxb[72] = (TextView) findViewById(R.id.box123b);
        boxb[73] = (TextView) findViewById(R.id.box124b);
        boxb[74] = (TextView) findViewById(R.id.box125b);
        boxb[75] = (TextView) findViewById(R.id.box126b);
        boxb[76] = (TextView) findViewById(R.id.box127b);

        boxb[77] = (TextView) findViewById(R.id.box131b);
        boxb[78] = (TextView) findViewById(R.id.box132b);
        boxb[79] = (TextView) findViewById(R.id.box133b);
        boxb[80] = (TextView) findViewById(R.id.box134b);
        boxb[81] = (TextView) findViewById(R.id.box135b);
        boxb[82] = (TextView) findViewById(R.id.box136b);
        boxb[83] = (TextView) findViewById(R.id.box137b);

        k =0;
        for(j=0; j<12; j++) {
            boxb[k].setText(playerb[j].name);
            boxb[k + 1].setText("" + playerb[j].points);
            boxb[k + 2].setText("" + playerb[j].threes);
            boxb[k + 3].setText("" + playerb[j].twoos);
            boxb[k + 4].setText("" + playerb[j].freethrows);
            boxb[k + 5].setText("" + playerb[j].fouls);
            boxb[k + 6].setText("" + playerb[j].turnovers);
            k = k+7;
        }
    }
}

