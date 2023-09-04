package org.example.drinks;

import org.example.myInterface.CoffeeDrink;

public class Latte implements CoffeeDrink {
    @Override
    public void makeCoffee() {
        System.out.println("Your Latte. Enjoy :)");
    }
}
