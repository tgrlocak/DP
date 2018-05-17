package com.tgrl.exp.dp.decorator;

import com.tgrl.exp.dp.model.Circle;
import com.tgrl.exp.dp.model.Rectangle;
import com.tgrl.exp.dp.model.interfaces.Shape;

public class DecoratorPatternDemo {

  public static void main(String args[]) {
    Shape circle = new Circle();
    Shape redCircle = new RedShapeDecorator(new Circle());
    Shape redRectangle = new RedShapeDecorator(new Rectangle());
    
    System.out.println("Circle with normal border");
    circle.draw();
    
    System.out.println("\nCircle with red border");
    redCircle.draw();
    
    System.out.println("\nRectangle with red border");
    redRectangle.draw();
  }
}
