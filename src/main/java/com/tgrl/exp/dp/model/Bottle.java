package com.tgrl.exp.dp.model;

import com.tgrl.exp.dp.model.interfaces.Packing;

public class Bottle implements Packing {

  @Override
  public String pack() {
    return "Bottle";
  }

}
