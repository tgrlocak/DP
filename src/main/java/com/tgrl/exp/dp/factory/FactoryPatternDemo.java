package com.tgrl.exp.dp.factory;

import com.tgrl.exp.dp.model.interfaces.Shape;

public class FactoryPatternDemo {

  public static void main(String args[]) {
    ShapeFactory factory = new ShapeFactory();

    // get an object of Circle and call its draw method.
    Shape shape1 = factory.getShape("CIRCLE");

    // call draw method of Circle
    shape1.draw();

    // get an object of Rectangle and call its draw method.
    Shape shape2 = factory.getShape("RECTANGLE");

    // call draw method of Rectangle
    shape2.draw();

    // get an object of Square and call its draw method.
    Shape shape3 = factory.getShape("SQUARE");

    // call draw method of circle
    shape3.draw();
  }
}
