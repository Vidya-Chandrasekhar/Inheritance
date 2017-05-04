package com.zipcode.abstractbanklab;

/**
 * Created by vidyachandasekhar on 5/2/17.
 */
public class BusinessAccount extends Account {

    public BusinessAccount(String accountID, Double accountBalance ){
        super(accountID,accountBalance);
    }

    public String getAccountType() {

        return "Business";
    }
}

