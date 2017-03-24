package com.siddartha;

public class ComboBurger extends Hamburger{

    public ComboBurger() {
        super("Combo Burger", 14.22, "Chicken and Turkey", "White");
        super.addHamburgerAddition1("Chips", 1.21);
        super.addHamburgerAddition2("Drinks", 0.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("You cannot add additional items for Combo Burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("You cannot add additional items for Combo Burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("You cannot add additional items for Combo Burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("You cannot add additional items for Combo Burger");
    }
}
