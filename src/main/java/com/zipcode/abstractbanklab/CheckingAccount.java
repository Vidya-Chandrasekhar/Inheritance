package com.zipcode.abstractbanklab;

/**
 * Created by vidyachandasekhar on 5/2/17.
 */

public class CheckingAccount extends Account {

    public CheckingAccount(String accountID, Double accountBalance ){
        super(accountID,accountBalance);
    }

    public String getAccountType() {

        return "checkingAccount";
    }
}
