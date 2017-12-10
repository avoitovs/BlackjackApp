package com.example.antons.blackjackapp.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.antons.blackjackapp.R;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class MainMenu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_menu);

        setOnclickListenerJustPlay();
        setOnClickListenerQuit();
        setOnclickListenerSettings();
        setOnclickListenerWantToLearn();
    }



    private void setOnclickListenerWantToLearn(){

        Button wantToLearn = findViewById(R.id.want_to_learn_button);
        wantToLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openWantToLearn = new Intent(MainMenu.this,WantToLearn.class);
                startActivity(openWantToLearn);
            }
        });


    }
    private void setOnclickListenerJustPlay(){


        Button justPlayButton = findViewById(R.id.just_play_button);
        justPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openJustPlay = new Intent(MainMenu.this,JustPlay.class);
                Log.i("MainMenu","Opening just play Activity");
                startActivity(openJustPlay);
            }
        });


    }

    private void setOnclickListenerSettings(){

        Button settingsButton = findViewById(R.id.settings_button);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openSettings = new Intent(MainMenu.this,Settings.class);
                startActivity(openSettings);
            }
        });


    }

    private void setOnClickListenerQuit(){

        Button quitButton = findViewById(R.id.quit_button);
        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }




}
