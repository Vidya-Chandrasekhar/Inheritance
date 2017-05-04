package com.zipcode.abstractbanklab;

/**
 * Created by vidyachandasekhar on 5/2/17.
 */
public class SavingsAccount extends Account {

    public SavingsAccount(String accountID, Double accountBalance ){
        super(accountID,accountBalance);
    }


    public String getAccountType() {

        return "Saving";
    }
}

