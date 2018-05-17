package com.tgrl.exp.dp.model;

import com.tgrl.exp.dp.model.interfaces.Color;

public class Green implements Color {

  @Override
  public void fill() {
    System.out.println("Inside Green::fill() method.");
  }

}
