package com.tgrl.exp.dp.abstractFactory;

import com.tgrl.exp.dp.model.interfaces.Color;
import com.tgrl.exp.dp.model.interfaces.Shape;

public class AbstractFactoryPatternDemo {

  public static void main(String args[]) {
    // Get Shape Factory
    AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

    // get an object of Shape Circle
    Shape circle = shapeFactory.getShape("CIRCLE");
    // call draw method of Shape Circle
    circle.draw();

    // get an object of Shape Rectangle
    Shape rectangle = shapeFactory.getShape("RECTANGLE");
    // call draw method of Shape Rectangle
    rectangle.draw();

    // get an object of Shape Square
    Shape square = shapeFactory.getShape("SQUARE");
    // call draw method of Shape Square
    square.draw();

    // Get Color Factory
    AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

    // get an object of Color Red
    Color red = colorFactory.getColor("RED");
    // call fill method of Red
    red.fill();

    // get an object of Color Blue
    Color blue = colorFactory.getColor("BLUE");
    // call fill method of Blue
    blue.fill();

    // get an object of Color Green
    Color green = colorFactory.getColor("GREEN");
    // call fill method of Green
    green.fill();
  }
}
