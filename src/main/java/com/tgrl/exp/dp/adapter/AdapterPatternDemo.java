package com.tgrl.exp.dp.adapter;

public class AdapterPatternDemo {

  public static void main(String args[]) {
    AudioPlayer player = new AudioPlayer();
    
    player.play("mp3", "beyond the horizon.mp3");
    player.play("vlc", "lonely.vlc");
    player.play("mp4", "far far away.mp4");
    player.play("avi", "AVSEQ01.avi");
  }
}
