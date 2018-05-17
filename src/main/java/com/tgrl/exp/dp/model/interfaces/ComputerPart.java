package com.tgrl.exp.dp.model.interfaces;

import com.tgrl.exp.dp.visitor.ComputerPartVisitor;

public interface ComputerPart {
  public void accept(ComputerPartVisitor visitor);
}
