package com.tgrl.exp.dp.model;

import com.tgrl.exp.dp.model.interfaces.DrawAPI;
import com.tgrl.exp.dp.model.interfaces.Shape;

public class Circle extends com.tgrl.exp.dp.model.Shape implements Shape {

  private int x, y, radius;

  public Circle() {
    super(null);
    type = "Circle";
  }

  public Circle(int x, int y, int radius, DrawAPI drawApi) {
    super(drawApi);
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  @Override
  public void draw() {
    if (x == 0) {
      System.out.println("Inside Circle::draw() method.");
    } else {
      drawApi.drawCircle(radius, x, y);
    }
  }

}
