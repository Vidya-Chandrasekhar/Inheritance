package com.zipcode.abstractbanklab;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vidyachandasekhar on 5/3/17.
 */
public class ATMClassTest {
    @Test
    public void deposit() throws Exception {
        //:given

        ATMClass atm1 = new ATMClass();
        Account checkingAccount1 = new CheckingAccount("ID_1", 101.00);

        //:when

        atm1.deposit(checkingAccount1, 50.00);


        //:then
        assertEquals(new Double(151.00), checkingAccount1.getAccountBalance());

    }

    @Test
    public void withdrawal() throws Exception {
        //:given

        ATMClass atm1 = new ATMClass();
        Account savingsAccount1 = new SavingsAccount("ID_2", 101.00);
        //:when

        atm1.withdrawal(savingsAccount1, 50.00);

        //:then
        assertEquals(new Double(51.00), savingsAccount1.getAccountBalance());
    }

    @Test
    public void balanceEnquiry() throws Exception {
        //:given
        ATMClass atm1 = new ATMClass();
        Account savingsAccount3 = new SavingsAccount("ID_3", 101.00);

        //:when
        String balanceEnquiryOutput = atm1.balanceEnquiry(savingsAccount3);

        //:then
        assertEquals("Account ID:ID_3 Account Type:Saving Account Balance:101.0", balanceEnquiryOutput);

    }

}