package com.example.vivek.basketballscorekeeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    int j;
    String[] keys = new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        LinearLayout transp = (LinearLayout) findViewById(R.id.transp);
        transp.setAlpha((float) 0.5);
        for (j=0; j<5; j++){
            keys[j] = "Key" + j;
        }
    }

    public void changeAct(View view) {

        EditText teamaname = (EditText) findViewById(R.id.teaa);
        EditText teambname = (EditText) findViewById(R.id.teab);
        EditText playera[] = new EditText[5];
        playera[0] = (EditText) findViewById(R.id.playera1);
        playera[1] = (EditText) findViewById(R.id.playera2);
        playera[2] = (EditText) findViewById(R.id.playera3);
        playera[3] = (EditText) findViewById(R.id.playera4);
        playera[4] = (EditText) findViewById(R.id.playera5);
        EditText playerb[] = new EditText[5];
        playerb[0] = (EditText) findViewById(R.id.playerb1);
        playerb[1] = (EditText) findViewById(R.id.playerb2);
        playerb[2] = (EditText) findViewById(R.id.playerb3);
        playerb[3] = (EditText) findViewById(R.id.playerb4);
        playerb[4] = (EditText) findViewById(R.id.playerb5);

        Intent mvdata = new Intent(this, SubsActivity.class);
        mvdata.putExtra("TeamAName", teamaname.getText().toString());
        mvdata.putExtra("TeamBName", teambname.getText().toString());
        for (j = 0; j < 5; j++) {
            mvdata.putExtra(keys[j] + "a", playera[j].getText().toString());
            mvdata.putExtra(keys[j] + "b", playerb[j].getText().toString());
        }
        startActivity(mvdata);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}