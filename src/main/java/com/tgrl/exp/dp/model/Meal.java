package com.tgrl.exp.dp.model;

import java.util.ArrayList;
import java.util.List;

import com.tgrl.exp.dp.model.interfaces.Item;

public class Meal {

  private List<Item> items = new ArrayList<Item>();

  public void addItem(Item item) {
    items.add(item);
  }

  public double getCost() {
    return items.stream().mapToDouble(Item::price).sum();
  }

  public void showItems() {
    items.forEach(item -> {
      System.out.print("Item: " + item.name());
      System.out.print(", Packing: " + item.packing().pack());
      System.out.println(", Price: " + item.price());
    });
  }
}
