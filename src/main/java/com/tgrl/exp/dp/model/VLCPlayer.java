package com.tgrl.exp.dp.model;

import com.tgrl.exp.dp.model.interfaces.AdvancedMediaPlayer;

public class VLCPlayer implements AdvancedMediaPlayer{

  @Override
  public void playVLC(String fileName) {
    System.out.println("Playing vlc file. Name: " + fileName);
  }

  @Override
  public void playMP4(String fileName) {
    // do nothing
  }

}
