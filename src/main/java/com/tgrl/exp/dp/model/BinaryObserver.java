package com.tgrl.exp.dp.model;

public class BinaryObserver extends Observer {

  public BinaryObserver(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("Binary string : " + Integer.toBinaryString(subject.getState()));
  };
}
