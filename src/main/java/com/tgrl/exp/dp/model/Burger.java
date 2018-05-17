package com.tgrl.exp.dp.model;

import com.tgrl.exp.dp.model.interfaces.Item;
import com.tgrl.exp.dp.model.interfaces.Packing;

public abstract class Burger implements Item {

  @Override
  public Packing packing() {
    return new Wrapper();
  }

  @Override
  public abstract double price();
}
