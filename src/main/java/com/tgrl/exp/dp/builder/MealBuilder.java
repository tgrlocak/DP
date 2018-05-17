package com.tgrl.exp.dp.builder;

import com.tgrl.exp.dp.model.ChickenBurger;
import com.tgrl.exp.dp.model.Coke;
import com.tgrl.exp.dp.model.Meal;
import com.tgrl.exp.dp.model.Pepsi;
import com.tgrl.exp.dp.model.VeggyBurger;

public class MealBuilder {

  public Meal prepareVeggyMeal() {
    Meal meal = new Meal();
    meal.addItem(new VeggyBurger());
    meal.addItem(new Coke());
    return meal;
  }
  
  public Meal prepareNonVeggyMeal() {
    Meal meal = new Meal();
    meal.addItem(new ChickenBurger());
    meal.addItem(new Pepsi());
    return meal;
  }
}
