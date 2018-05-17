package com.tgrl.exp.dp.bridge;

import com.tgrl.exp.dp.model.Circle;
import com.tgrl.exp.dp.model.GreenCircle;
import com.tgrl.exp.dp.model.RedCircle;
import com.tgrl.exp.dp.model.Shape;

public class BridgePatternDemo {

  public static void main(String args[]) {
    Shape redCircle = new Circle(100, 100, 10, new RedCircle());
    Shape greenCircle = new Circle(100, 100, 20, new GreenCircle());

    redCircle.draw();
    greenCircle.draw();
  }
}
