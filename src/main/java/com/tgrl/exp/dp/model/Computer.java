package com.tgrl.exp.dp.model;

import java.util.stream.Stream;

import com.tgrl.exp.dp.model.interfaces.ComputerPart;
import com.tgrl.exp.dp.visitor.ComputerPartVisitor;

public class Computer implements ComputerPart {

  ComputerPart[] parts;

  public Computer() {
    parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
  }

  @Override
  public void accept(ComputerPartVisitor visitor) {
    Stream.of(parts).forEach(p -> p.accept(visitor));
    visitor.visit(this);
  }

}
