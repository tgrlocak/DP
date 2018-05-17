package com.tgrl.exp.dp.model;

import com.tgrl.exp.dp.model.interfaces.Color;

public class Blue implements Color {

  @Override
  public void fill() {
    System.out.println("Inside Blue::fill() method.");
  }

}
