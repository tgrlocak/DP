package com.tgrl.exp.dp.model;

import com.tgrl.exp.dp.model.interfaces.Packing;

public class Wrapper implements Packing {

  @Override
  public String pack() {
    return "Wrapper";
  }

}
