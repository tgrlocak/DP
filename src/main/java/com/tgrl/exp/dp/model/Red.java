package com.tgrl.exp.dp.model;

import com.tgrl.exp.dp.model.interfaces.Color;

public class Red implements Color {

  @Override
  public void fill() {
    System.out.println("Inside Red::fill() method.");
  }

}
