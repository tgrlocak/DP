package com.tgrl.exp.dp.model;

import com.tgrl.exp.dp.model.interfaces.Item;
import com.tgrl.exp.dp.model.interfaces.Packing;

public abstract class ColdDrink implements Item {

  @Override
  public Packing packing() {
    return new Bottle();
  }

  @Override
  public abstract double price();

}
