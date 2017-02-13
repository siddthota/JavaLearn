package com.siddartha;

/**
 * Created by siddu on 2/11/2017.
 */
public class BankAcct {

        private int acctNumber;
        private double acctBalance;
        private String customerName;
        private String customerEmail;
        private String phone;

        public BankAcct(int acctNumber, double acctBalance, String customerName, String customerEmail, String phone) {
            this.acctNumber = acctNumber;
            this.acctBalance = acctBalance;
            this.customerName = customerName;
            this.customerEmail = customerEmail;
            this.phone = phone;
        }

    public BankAcct(String customerName, String customerEmail, String phone) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phone = phone;
    }

    public void deposit(double depositAmnt) {
            this.acctBalance += depositAmnt;
            System.out.println("Amount deposited $" + depositAmnt + "." + this.customerName + " Balance in Account $" + this.acctBalance);
        }

        public void withdraw(double withdrawAmnt) {
            if(this.acctBalance > withdrawAmnt) {
                this.acctBalance -= withdrawAmnt;
                System.out.println("Amount withdrawn $" + withdrawAmnt + "." + this.customerName + " Balance in Account $" + this.acctBalance);

            }
            else {
                System.out.println(this.customerName + " don't have enough funds. Your balance is $" + this.acctBalance);
            }

        }



}
