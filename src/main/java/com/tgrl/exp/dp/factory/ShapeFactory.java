package com.tgrl.exp.dp.factory;

import org.apache.commons.lang3.StringUtils;

import com.tgrl.exp.dp.model.Circle;
import com.tgrl.exp.dp.model.Rectangle;
import com.tgrl.exp.dp.model.Square;
import com.tgrl.exp.dp.model.interfaces.Shape;

public class ShapeFactory {

  // use getShape method to get object of type shape
  public Shape getShape(String shapeType) {
    if (StringUtils.isEmpty(shapeType)) {
      return null;
    }

    switch (shapeType) {
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
