package com.tgrl.exp.dp.abstractFactory;

import org.apache.commons.lang3.StringUtils;

import com.tgrl.exp.dp.model.Circle;
import com.tgrl.exp.dp.model.Rectangle;
import com.tgrl.exp.dp.model.Square;
import com.tgrl.exp.dp.model.interfaces.Color;
import com.tgrl.exp.dp.model.interfaces.Shape;

public class ShapeFactory extends AbstractFactory {

  @Override
  Color getColor(String color) {
    return null;
  }

  @Override
  Shape getShape(String shape) {
    if (StringUtils.isEmpty(shape)) {
      return null;
    }

    switch (shape) {
      case "CIRCLE":
        return new Circle();
      case "SQUARE":
        return new Square();
      case "RECTANGLE":
        return new Rectangle();
      default:
        return null;
    }
  }

}
