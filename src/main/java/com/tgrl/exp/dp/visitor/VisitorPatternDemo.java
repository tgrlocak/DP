package com.tgrl.exp.dp.visitor;

import com.tgrl.exp.dp.model.Computer;
import com.tgrl.exp.dp.model.interfaces.ComputerPart;

public class VisitorPatternDemo {

  public static void main(String args[]) {
    ComputerPart computer = new Computer();
    computer.accept(new ComputerPartDisplayVisitor());
  }
}
