package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PlayingNowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_now);

        Button recommendedButton = (Button) findViewById(R.id.recommended);
        recommendedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recommendedIntent = new Intent(PlayingNowActivity.this, RecommendationsActivity.class);
                startActivity(recommendedIntent);
            }
        });

        Button playlistsButton = (Button) findViewById(R.id.playlists);
        playlistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(PlayingNowActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });
    }
}
