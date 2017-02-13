package com.siddartha;


public class VipCustomer {

    private String vipName;
    private double creditLimit;
    private String vipEmail;

    public VipCustomer() {
        this("Default Name", 00.00, "Default email");
        System.out.println("The empty parameter constructor is called");
    }

    public VipCustomer(String vipName, double creditLimit) {
        this(vipName, creditLimit, "default email");
        System.out.println("This constructor is with 2 parameters");
    }

    public VipCustomer(String vipName, double creditLimit, String vipEmail) {
        System.out.println("This constructor has all parameters set");
        this.vipName = vipName;
        this.creditLimit = creditLimit;
        this.vipEmail = vipEmail;

    }

    public String getVipName() {
        return vipName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getVipEmail() {
        return vipEmail;
    }
}
