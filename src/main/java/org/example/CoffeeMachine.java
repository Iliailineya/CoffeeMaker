package org.example;

import org.example.drinks.*;
import org.example.myInterface.CoffeeDrink;

import java.util.Scanner;

public class CoffeeMachine {
    private static final String MENU = "Choose a drink:\n1 - Espresso\n2 - Cappuccino\n3 - Latte";

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(MENU);

        CoffeeDrink coffeeDrink = null;

        while (coffeeDrink == null) {
            String choiceStr = getUserChoice(scanner);
            coffeeDrink = createCoffeeDrink(choiceStr);
        }

        coffeeDrink.makeCoffee();
    }

    private static String getUserChoice(Scanner scanner) {
        System.out.print("Enter your choice: ");
        return scanner.nextLine().trim().toLowerCase();
    }

    private static CoffeeDrink createCoffeeDrink(String choiceStr) {
        switch (choiceStr) {
            case "espresso" -> {
                return new Espresso();
            }
            case "cappuccino" -> {
                return new Cappuccino();
            }
            case "latte" -> {
                return new Latte();
            }
            default -> {
                System.out.println("Invalid choice. Please select a valid drink:");
                return null;
            }
        }
    }
}

