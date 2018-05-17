package com.tgrl.exp.dp.model;

import com.tgrl.exp.dp.model.interfaces.Shape;

public class Rectangle extends com.tgrl.exp.dp.model.Shape implements Shape {

  public Rectangle() {
    super(null);
    type = "Rectangle";
  }
  
  @Override
  public void draw() {
    System.out.println("Inside Rectangle::draw() method.");
  }

}
