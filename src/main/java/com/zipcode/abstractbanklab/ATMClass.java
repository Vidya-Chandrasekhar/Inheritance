package com.zipcode.abstractbanklab;

/**
 * Created by vidyachandasekhar on 5/2/17.
 */
public class ATMClass {

    public static void main(String[] args) {
        ATMClass atm1 =new ATMClass();
    }

    public Double deposit(Account account, Double depositAmount) {
        Double currentAccountBalance = account.getAccountBalance() + depositAmount;
        account.setAccountBalance(currentAccountBalance);
        return currentAccountBalance;
    }

    public Double withdrawal(Account account, Double withdrawalAmount) {
        Double currentAccountBalance = account.getAccountBalance() - withdrawalAmount;
        account.setAccountBalance(currentAccountBalance);
        return currentAccountBalance;
    }


    public String balanceEnquiry(Account account) {

        return new StringBuilder().append("Account ID:").append(account.getAccountID()).append(" Account Type:").append(account.getAccountType()).append(" Account Balance:").append(account.getAccountBalance()).toString();

    }
}

    /*public void deposit(Account account, Double amount){
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
}*/
