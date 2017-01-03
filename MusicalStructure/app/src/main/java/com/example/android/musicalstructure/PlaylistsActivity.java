package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        Button playingButton = (Button) findViewById(R.id.playing_now);
        playingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(PlaylistsActivity.this, PlayingNowActivity.class);
                startActivity(playingIntent);
            }
        });

        Button recommendedButton = (Button) findViewById(R.id.recommended);
        recommendedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recommendedIntent = new Intent(PlaylistsActivity.this, RecommendationsActivity.class);
                startActivity(recommendedIntent);
            }
        });

        ImageView cover1ImageView = (ImageView) findViewById(R.id.cover1);
        cover1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cover1Intent = new Intent(PlaylistsActivity.this, PlaylistContentActivity.class);
                startActivity(cover1Intent);
            }
        });

        ImageView cover2ImageView = (ImageView) findViewById(R.id.cover2);
        cover2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cover2Intent = new Intent(PlaylistsActivity.this, PlaylistContentActivity.class);
                startActivity(cover2Intent);
            }
        });

        ImageView cover3ImageView = (ImageView) findViewById(R.id.cover3);
        cover3ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cover3Intent = new Intent(PlaylistsActivity.this, PlaylistContentActivity.class);
                startActivity(cover3Intent);
            }
        });

        ImageView cover4ImageView = (ImageView) findViewById(R.id.cover4);
        cover4ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cover4Intent = new Intent(PlaylistsActivity.this, PlaylistContentActivity.class);
                startActivity(cover4Intent);
            }
        });
    }

}
