package com.tgrl.exp.dp.model;

public abstract class Observer {
  protected Subject subject;
  public abstract void update();
}
