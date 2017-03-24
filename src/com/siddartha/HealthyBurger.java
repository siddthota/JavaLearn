package com.siddartha;

public class HealthyBurger extends Hamburger{

    private String healthy1Name;
    private double healthy1Price;

    private String healthy2Name;
    private double healthy2Price;

    public HealthyBurger (double price, String meat ) {
        super("Healthy Burger", price, meat, "Brown Rye");
    }

    public void addHealthAddition1(String name, double price) {
        this.healthy1Name = name;
        this.healthy1Price = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.healthy2Name = name;
        this.healthy2Price = price;
    }

    @Override
    public double totalPriceofHamburger() {
        double hamburgerPrice = super.totalPriceofHamburger();

        if(this.healthy1Name !=null) {
            hamburgerPrice += this.healthy1Price;
            System.out.println("Added " + this.healthy1Name + " for an extra " + this.healthy1Price);
        }
        if(this.healthy2Name !=null) {
            hamburgerPrice += this.healthy2Price;
            System.out.println("Added " + this.healthy2Name + " for an extra " + this.healthy2Price);
        }
        return hamburgerPrice;
    }
}
