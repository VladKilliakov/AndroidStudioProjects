package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RecommendationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendations);

        Button playlistsButton = (Button) findViewById(R.id.playlists);
        playlistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(RecommendationsActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });

        Button playingButton = (Button) findViewById(R.id.playing_now);
        playingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent playingIntent = new Intent(RecommendationsActivity.this, PlayingNowActivity.class);
                startActivity(playingIntent);
            }
        });

        TextView friend1TextView = (TextView) findViewById(R.id.friend1);
        friend1TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent friendIntent = new Intent(RecommendationsActivity.this, PlaylistContentActivity.class);
                startActivity(friendIntent);
            }
        });

        TextView friend2TextView = (TextView) findViewById(R.id.friend2);
        friend2TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent friendIntent = new Intent(RecommendationsActivity.this, PlaylistContentActivity.class);
                startActivity(friendIntent);
            }
        });

        TextView friend3TextView = (TextView) findViewById(R.id.friend3);
        friend3TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent friendIntent = new Intent(RecommendationsActivity.this, PlaylistContentActivity.class);
                startActivity(friendIntent);
            }
        });

    }
}
