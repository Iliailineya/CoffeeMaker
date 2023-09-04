package org.example.drinks;

import org.example.myInterface.CoffeeDrink;

public class Espresso implements CoffeeDrink {
    @Override
    public void makeCoffee() {
        System.out.println("Your Espresso. Enjoy :)");
    }
}
