package com.zipcode.abstractbanklab;

/**
 * Created by vidyachandasekhar on 5/2/17.
 */
public class ATMClass {

    public static void main(String [] args) {
        ATMClass atm1 =new ATMClass();
        Account checkingAccount1 = new CheckingAccount("ID_1", 101.00);

        atm1.deposit(checkingAccount1, 50.00);
        System.out.println(atm1.balanceEnquiry(checkingAccount1));
    }

    public  double deposit(Account account, double depositAmount) {
        double currentAccountBalance = account.getAccountBalance() + depositAmount;
        account.setAccountBalance(currentAccountBalance);
        return currentAccountBalance;
    }

    public double withdrawal(Account account, double  withdrawalAmount) {
        double currentAccountBalance = account.getAccountBalance() - withdrawalAmount;
        account.setAccountBalance(currentAccountBalance);
        return currentAccountBalance;
    }


    public String balanceEnquiry(Account account) {

        return new StringBuilder().append("Account ID:").append(account.getAccountID()).append(" Account Type:").append(account.getAccountType()).append(" Account Balance:").append(account.getAccountBalance()).toString();

    }
}

