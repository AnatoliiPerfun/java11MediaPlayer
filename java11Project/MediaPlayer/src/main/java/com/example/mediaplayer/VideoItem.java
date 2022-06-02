package com.example.mediaplayer;

import javafx.scene.control.Label;
import javafx.scene.media.Media;

public class VideoItem  extends Label {
    private final Media video;

    public VideoItem(String videoPath, Media video) {
        this.video = video;
        super.setText("Video name: " + getVideoName(videoPath));
    }

    private String getVideoName(String videoPath) {
        String[] pathParts = videoPath.split("/");
        return pathParts[pathParts.length -1];
    }

    public Media getVideo() {
        return video;
    }
}
