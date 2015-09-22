package com.example.johan.myfragmentexample;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * A placeholder fragment containing a simple view.
 */
public class VideoFragment extends Fragment {

    public VideoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_video, container, false);
        final VideoView videoView =
                (VideoView) view.findViewById(R.id.videoView1);

        //play video from http
        videoView.setVideoPath(
                "http://www.ebookfrenzy.com/android_book/movie.mp4");

        //set the uri of the local video to be played
        String videoPath = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.kitkat;
        //String videoPath = "android.resource://com.example.johan.myfragmentexample/" + R.raw.kitkat;
        videoView.setVideoURI(Uri.parse(videoPath));

        MediaController mediaController = new
                MediaController(getActivity());
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.setOnPreparedListener(new
               MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        Log.i(this.getClass().toString(), "Duration = " +
                                videoView.getDuration());
                    }
                });
        videoView.start();

        return view;
    }
}
