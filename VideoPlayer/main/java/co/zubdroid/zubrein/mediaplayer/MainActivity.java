package co.zubdroid.zubrein.mediaplayer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    MediaController mediaController;
    ImageView play,stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView videoView = findViewById(R.id.video_view);
        play = findViewById(R.id.play);
        stop = findViewById(R.id.stop);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.vedio;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.requestFocus();

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoView.start();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoView.stopPlayback();
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.vedio;
                Uri uri = Uri.parse(videoPath);
                videoView.setVideoURI(uri);
                videoView.requestFocus();
            }
        });



        mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }
}


