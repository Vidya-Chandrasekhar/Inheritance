package com.zipcode.abstractbanklab;

/**
 * Created by vidyachandasekhar on 5/2/17.
 */
public class ATMClass {

    public void deposit(Account account, Double amount){
        account.deposit(amount);
    }

    public void withdraw(Account account, Double amount){
        account.withdraw(amount);
    }

    public void balance(Account account){
        account.balance();
    }

    public static void main(String[] arg){
        CheckingAccount c1 = new CheckingAccount(500.00, 10L);
        CheckingAccount s1 = new CheckingAccount(1455.50, 20L);

        ATMClass atmClass = new ATMClass();
        atmClass.balance(c1);

        atmClass.withdraw(c1,100.00);
        atmClass.balance(c1);

        atmClass.balance(s1);
        atmClass.deposit(s1, 200.00);
        atmClass.balance(s1);


    }
}
