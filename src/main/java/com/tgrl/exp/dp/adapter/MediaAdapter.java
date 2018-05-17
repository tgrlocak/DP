package com.tgrl.exp.dp.adapter;

import com.tgrl.exp.dp.model.MP4Player;
import com.tgrl.exp.dp.model.VLCPlayer;
import com.tgrl.exp.dp.model.interfaces.AdvancedMediaPlayer;
import com.tgrl.exp.dp.model.interfaces.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

  AdvancedMediaPlayer advancedMediaPlayer;

  public MediaAdapter(String audioType) {
    switch (audioType) {
      case "vlc":
        advancedMediaPlayer = new VLCPlayer();
      case "mp4":
        advancedMediaPlayer = new MP4Player();
      default:
        break;
    }
  }
  
  @Override
  public void play(String audioType, String fileName) {
    switch (audioType) {
      case "vlc":
        advancedMediaPlayer.playVLC(fileName);
      case "mp4":
        advancedMediaPlayer.playMP4(fileName);
      default:
        break;
    }
  }

}
