package com.tgrl.exp.dp.abstractFactory;

import org.apache.commons.lang3.StringUtils;

import com.tgrl.exp.dp.model.Blue;
import com.tgrl.exp.dp.model.Green;
import com.tgrl.exp.dp.model.Red;
import com.tgrl.exp.dp.model.interfaces.Color;
import com.tgrl.exp.dp.model.interfaces.Shape;

public class ColorFactory extends AbstractFactory {

  @Override
  Color getColor(String color) {
    if (StringUtils.isEmpty(color)) {
      return null;
    }

    switch (color) {
      case "BLUE":
        return new Blue();
      case "GREEN":
        return new Green();
      case "RED":
        return new Red();
      default:
        return null;
    }
  }

  @Override
  Shape getShape(String shape) {
    return null;
  }

}
