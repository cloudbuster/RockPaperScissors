package com.cloudbusterdesigns.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Player player = new Player();
    Computer myComputer = new Computer();
    String assetArray [] = {"Rock", "Paper", "Scissors"};

    public void makeToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    public void compareResults(int player, int computer){
        // Situations where player wins
        // rock vs scissors
        if (player == 0 && computer == 2){
            makeToast("You win!");
        }
        // paper vs rock
        else if (player == 1 && computer == 0){
            makeToast("You win!");
        }
        // scissors vs paper
        else if (player == 2 && computer == 1){
            makeToast("You win!");
        }

        // Situations where computer wins
        // rock vs scissors
        else if (computer == 0 && player == 2){
            makeToast("Computer wins!");
        }
        // paper vs rock
        else if (computer == 1 && player == 0){
            makeToast("Computer wins!");
        }
        // scissors vs paper
        else if (computer == 2 && player == 1){
            makeToast("Computer wins!");
        }

        else {
            makeToast("It's a tie.");
        }

    }

    public void rockButton(View view){
        player.setChoice(0);
        int tempInt = myComputer.getChoice();
        makeToast("You chose to go with " + assetArray[0] + ". Computer chose " + assetArray[tempInt] + "!");
        compareResults(0, tempInt);
    }

    public void paperButton(View view){
        player.setChoice(1);
        int tempInt = myComputer.getChoice();
        makeToast("You chose to go with " + assetArray[1] + ". Computer chose " + assetArray[tempInt] + "!");
        compareResults(1, tempInt);
    }

    public void scissorsButton(View view){
        player.setChoice(2);
        int tempInt = myComputer.getChoice();
        makeToast("You chose to go with " + assetArray[2] + ". Computer chose " + assetArray[tempInt] + "!");
        compareResults(2, tempInt);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
