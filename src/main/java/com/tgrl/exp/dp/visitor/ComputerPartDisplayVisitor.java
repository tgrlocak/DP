package com.tgrl.exp.dp.visitor;

import com.tgrl.exp.dp.model.Computer;
import com.tgrl.exp.dp.model.Keyboard;
import com.tgrl.exp.dp.model.Monitor;
import com.tgrl.exp.dp.model.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

  @Override
  public void visit(Computer computer) {
    System.out.println("Displaying Computer.");
  }

  @Override
  public void visit(Mouse mouse) {
    System.out.println("Displaying Mouse.");
  }

  @Override
  public void visit(Keyboard keyboard) {
    System.out.println("Displaying Keyboard.");
  }

  @Override
  public void visit(Monitor monitor) {
    System.out.println("Displaying Monitor.");
  }

  
}
