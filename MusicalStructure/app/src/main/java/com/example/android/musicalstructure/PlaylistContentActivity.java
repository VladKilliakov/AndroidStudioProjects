package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PlaylistContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist_content);

        Button playingButton = (Button) findViewById(R.id.playing_now);
        playingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(PlaylistContentActivity.this, PlayingNowActivity.class);
                startActivity(playingIntent);
            }
        });

        Button recommendedButton = (Button) findViewById(R.id.recommended);
        recommendedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recommendedIntent = new Intent(PlaylistContentActivity.this, RecommendationsActivity.class);
                startActivity(recommendedIntent);
            }
        });

        Button playlistsButton = (Button) findViewById(R.id.playlists);
        playlistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(PlaylistContentActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });
    }
}
