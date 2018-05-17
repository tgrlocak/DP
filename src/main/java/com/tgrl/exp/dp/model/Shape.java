package com.tgrl.exp.dp.model;

import com.tgrl.exp.dp.model.interfaces.DrawAPI;

public abstract class Shape implements Cloneable {

  private String id;
  protected String type;

  protected DrawAPI drawApi;

  protected Shape(DrawAPI drawAPI) {
    this.drawApi = drawAPI;
  }

  public abstract void draw();

  public String getType() {
    return type;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Object clone() {
    Object clone = null;

    try {
      clone = super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return clone;
  }

}
