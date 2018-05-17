package com.tgrl.exp.dp.builder;

import com.tgrl.exp.dp.model.Meal;

public class BuilderPatternDemo {

  public static void main(String args[]) {

    MealBuilder builder = new MealBuilder();

    // prepare a vegetarian food
    Meal vegetarian = builder.prepareVeggyMeal();
    System.out.println("Vegetarian Meal");
    vegetarian.showItems();
    System.out.println("Total cost : " + vegetarian.getCost());

    // prepare a non-vegetarian food
    Meal nonVegetarian = builder.prepareNonVeggyMeal();
    System.out.println("\n\n Non Vegetarian Meal");
    nonVegetarian.showItems();
    System.out.println("Total cost : " + nonVegetarian.getCost());
  }
}
