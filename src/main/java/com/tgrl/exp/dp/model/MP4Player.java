package com.tgrl.exp.dp.model;

import com.tgrl.exp.dp.model.interfaces.AdvancedMediaPlayer;

public class MP4Player implements AdvancedMediaPlayer {

  @Override
  public void playVLC(String fileName) {
    // do nothing
  }

  @Override
  public void playMP4(String fileName) {
    System.out.println("Playing mp4 file. Name: " + fileName);
  }

}
