package org.example.drinks;

import org.example.myInterface.CoffeeDrink;

public class Cappuccino implements CoffeeDrink {
    @Override
    public void makeCoffee() {
        System.out.println("Your Cappuccino. Enjoy :)");
    }
}
