package com.tgrl.exp.dp.visitor;

import com.tgrl.exp.dp.model.Computer;
import com.tgrl.exp.dp.model.Keyboard;
import com.tgrl.exp.dp.model.Mouse;
import com.tgrl.exp.dp.model.Monitor;

public interface ComputerPartVisitor {

  public void visit(Computer computer);
  public void visit(Mouse mouse);
  public void visit(Keyboard keyboard);
  public void visit(Monitor monitor);
}
