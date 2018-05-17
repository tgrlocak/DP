package com.tgrl.exp.dp.model;

import com.tgrl.exp.dp.model.interfaces.Shape;

public class Square extends com.tgrl.exp.dp.model.Shape implements Shape {

  public Square() {
    super(null);
    type = "Square";
  }
  
  @Override
  public void draw() {
    System.out.println("Inside Square::draw() method.");
  }

}
