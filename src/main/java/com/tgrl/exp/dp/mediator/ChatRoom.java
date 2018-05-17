package com.tgrl.exp.dp.mediator;

import java.util.Date;

import com.tgrl.exp.dp.model.User;

public class ChatRoom {

  public static void showMessage(User user, String message) {
    System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
  }
}
