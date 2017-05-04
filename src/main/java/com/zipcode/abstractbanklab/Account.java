package com.zipcode.abstractbanklab;
/*

Create a class called “Account” which will be an abstract class for three other classes called
“CheckingAccount”,SavingsAccount” and “BusinessAccount”. Manage credits and debits from these accounts through an
 ATM style program.

In your main class initialize your ATM
Demonstrate calling methods on your ATM with creating, deleting and managing account data
 Print all output to screen

 */

/**
 * Created by vidyachandasekhar on 5/2/17.
 */


public abstract class Account {

    private String accountID;
    private Double accountBalance;

    public Account(String accountID, Double accountBalance ){
        this.accountID=accountID;
        this.accountBalance=accountBalance;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public Double getAccountBalance() {return accountBalance;}

    public void setAccountBalance(Double accountBalance) {this.accountBalance = accountBalance;}

    public abstract String getAccountType();

}
