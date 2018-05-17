package com.tgrl.exp.dp.composite;

import com.tgrl.exp.dp.model.Employee;

public class CompositePatternDemo {

  public static void main(String args[]) {
    Employee CEO = new Employee("John", "CEO", 30000);

    Employee headSales = new Employee("Michael", "Head Sales", 15000);
    Employee headMarketing = new Employee("Elizabeth", "Head Marketing", 15000);

    Employee clerk1 = new Employee("Martha", "Marketing", 10000);
    Employee clerk2 = new Employee("Bob", "Marketing", 10000);

    Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
    Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

    CEO.add(headSales);
    CEO.add(headMarketing);

    headSales.add(salesExecutive1);
    headSales.add(salesExecutive2);

    headMarketing.add(clerk2);
    headMarketing.add(clerk1);

    // print all employees of the organization
    System.out.println(CEO);

    CEO.getSubordinates().forEach(headEmployee -> {
      System.out.println(headEmployee);
      headEmployee.getSubordinates().forEach(employee -> {
        System.out.println(employee);
      });
    });
  }
}
