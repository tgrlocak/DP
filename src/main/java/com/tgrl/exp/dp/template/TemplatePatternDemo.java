package com.tgrl.exp.dp.template;

import com.tgrl.exp.dp.model.Cricket;
import com.tgrl.exp.dp.model.Football;
import com.tgrl.exp.dp.model.Game;

public class TemplatePatternDemo {

  public static void main(String args[]) {
    Game game = new Cricket();
    game.play();
    
    System.out.println();
    
    game = new Football();
    game.play();
  }
}
