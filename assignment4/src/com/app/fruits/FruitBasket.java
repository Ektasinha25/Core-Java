package com.app.fruits;
import java.util.Scanner;

public class FruitBasket {

    public static int menuList(Scanner sc) {
        System.out.println("\n===== Fruit Basket Menu =====");
        System.out.println("0. Exit");
        System.out.println("1. Add Mango");
        System.out.println("2. Add Orange");
        System.out.println("3. Add Apple");
        System.out.println("4. Display names of all fruits in the Basket");
        System.out.println("5. Display details of all fresh fruits");
        System.out.println("6. Display tastes of all stale fruits");
        System.out.println("7. Mark a fruit as stale");
        System.out.println("8. Make all sour fruits stale");
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basket size: ");
        int size = sc.nextInt();
        Fruit[] basket = new Fruit[size];
        int counter = 0;

        int choice;
        while ((choice = menuList(sc)) != 0) {
            switch (choice) {
                case 1:
                    if (counter < basket.length) {
                        System.out.println("Enter name, weight, color:");
                        String name = sc.next();
                        double weight = sc.nextDouble();
                        String color = sc.next();
                        basket[counter++] = new Mango(name, weight, color, true);
                    } else
                        System.out.println("Basket is full");
                    break;

                case 2: // add orange
                    if (counter < basket.length) {
                        System.out.println("Enter name, weight, color:");
                        String name = sc.next();
                        double weight = sc.nextDouble();
                        String color = sc.next();
                        basket[counter++] = new Orange(name, weight, color, true);
                    } else
                        System.out.println("Basket is full");
                    break;

                case 3: // add apple
                    if (counter < basket.length) {
                        System.out.println("Enter name, weight, color:");
                        String name = sc.next();
                        double weight = sc.nextDouble();
                        String color = sc.next();
                        basket[counter++] = new Apple(name, weight, color, true);
                    } else
                        System.out.println("Basket is full");
                    break;

                case 4:
                    System.out.println("Names of Fruits:");
                    for (Fruit f : basket)
                        if (f != null)
                            System.out.println(f.getName());
                    break;

                case 5:
                    System.out.println("Fresh Fruits:");
                    for (Fruit f : basket)
                        if (f != null && f.isFresh())
                            System.out.println(f + " | Taste: " + f.taste());
                    break;

                case 6:
                    System.out.println("Stale Fruits:");
                    for (Fruit f : basket)
                        if (f != null && !f.isFresh())
                            System.out.println(f.getName() + " | Taste: " + f.taste());
                    break;

                case 7:
                    System.out.print("Enter index to mark stale: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < counter && basket[index] != null) {
                        basket[index].setFresh(false);
                        System.out.println("Fruit marked as stale.");
                    } else
                        System.out.println("Invalid index!");
                    break;

                case 8:
                    for (Fruit f : basket)
                        if (f != null && f.taste().equals("sour"))
                            f.setFresh(false);
                    System.out.println("All sour fruits marked as stale.");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
        System.out.println("Exiting...");
        sc.close();
    }
}
