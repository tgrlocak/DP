package com.tgrl.exp.dp.decorator;

import com.tgrl.exp.dp.model.interfaces.Shape;

public abstract class ShapeDecorator implements Shape {

  protected Shape decoratedShape;

  public ShapeDecorator(Shape decoratedShape) {
    this.decoratedShape = decoratedShape;
  }

  public void draw() {
    decoratedShape.draw();
  }
}
