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

