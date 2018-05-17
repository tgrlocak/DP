package com.tgrl.exp.dp.abstractFactory;

import com.tgrl.exp.dp.model.interfaces.Color;
import com.tgrl.exp.dp.model.interfaces.Shape;

public abstract class AbstractFactory {

  abstract Color getColor(String color);
  abstract Shape getShape(String shape);
}
