package com.example.mediaworksdemo;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class VideoDetailActivity extends AppCompatActivity {

    String mockUrl = "https://sf3-hscdn-tos.pstatp.com/obj/inspirecloud-file/baas/tt41nq/2c7ec1fac932d89d_1626778212628.mp4";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_detail);

        VideoView videoView = findViewById(R.id.vv_detail);
        videoView.setVideoURI(Uri.parse(mockUrl));
        videoView.setMediaController(new MediaController(this));
        videoView.start();
    }
}
