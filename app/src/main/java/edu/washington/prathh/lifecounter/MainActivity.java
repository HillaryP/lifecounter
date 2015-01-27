package edu.washington.prathh.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
    private static int playerOneCount;
    private static int playerTwoCount;
    private static int playerThreeCount;
    private static int playerFourCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button(View v) {
        switch (v.getId()) {
            case R.id.playOneMinusFive:
                playerOneCount -= 5;
                changeScore(findViewById(R.id.oneString), "Player 1", playerOneCount);
                break;
            case R.id.playOneMinusOne:
                playerOneCount--;
                changeScore(findViewById(R.id.oneString), "Player 1", playerOneCount);
                break;
            case R.id.playOnePlusFive:
                playerOneCount += 5;
                changeScore(findViewById(R.id.oneString), "Player 1", playerOneCount);
                break;
            case R.id.playOnePlusOne:
                playerOneCount++;
                changeScore(findViewById(R.id.oneString), "Player 1", playerOneCount);
                break;
            case R.id.playTwoMinusFive:
                playerTwoCount -= 5;
                changeScore(findViewById(R.id.twoString), "Player 2", playerTwoCount);
                break;
            case R.id.playTwoMinusOne:
                playerTwoCount--;
                changeScore(findViewById(R.id.twoString), "Player 2", playerTwoCount);
                break;
            case R.id.playTwoPlusFive:
                playerTwoCount += 5;
                changeScore(findViewById(R.id.twoString), "Player 2", playerTwoCount);
                break;
            case R.id.playTwoPlusOne:
                playerTwoCount++;
                changeScore(findViewById(R.id.twoString), "Player 2", playerTwoCount);
                break;
            case R.id.playThreeMinusFive:
                playerThreeCount -= 5;
                changeScore(findViewById(R.id.threeString), "Player 3", playerThreeCount);
                break;
            case R.id.playThreeMinusOne:
                playerThreeCount--;
                changeScore(findViewById(R.id.threeString), "Player 3", playerThreeCount);
                break;
            case R.id.playThreePlusFive:
                playerThreeCount += 5;
                changeScore(findViewById(R.id.threeString), "Player 3", playerThreeCount);
                break;
            case R.id.playThreePlusOne:
                playerThreeCount++;
                changeScore(findViewById(R.id.threeString), "Player 3", playerThreeCount);
                break;
            case R.id.playFourMinusFive:
                playerFourCount -= 5;
                changeScore(findViewById(R.id.fourString), "Player 4", playerFourCount);
                break;
            case R.id.playFourMinusOne:
                playerFourCount--;
                changeScore(findViewById(R.id.fourString), "Player 4", playerFourCount);
                break;
            case R.id.playFourPlusFive:
                playerFourCount += 5;
                changeScore(findViewById(R.id.fourString), "Player 4", playerFourCount);
                break;
            case R.id.playFourPlusOne:
                playerFourCount++;
                changeScore(findViewById(R.id.fourString), "Player 4", playerFourCount);
                break;
        }
    }

    public void changeScore(View view, String player, int score) {
        TextView text = (TextView) view;
        text.setText(player + ": " + score + " Lives");
        if (score <= 0) {
            ((TextView) findViewById(R.id.loser)).setText(player + " Loses!");
        }
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
