package com.tgrl.exp.dp.model;

import com.tgrl.exp.dp.model.interfaces.ComputerPart;
import com.tgrl.exp.dp.visitor.ComputerPartVisitor;

public class Mouse implements ComputerPart {

  @Override
  public void accept(ComputerPartVisitor visitor) {
    visitor.visit(this);
  }

}
