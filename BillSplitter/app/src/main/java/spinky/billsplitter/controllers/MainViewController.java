package spinky.billsplitter.controllers;

import java.math.BigInteger;
import java.util.ArrayList;

import spinky.billsplitter.bill.Bill;
import spinky.billsplitter.userAccount.LocalAccount;

/**
 * Created by John on 21/02/2016.
 */
public class MainViewController {

    /**
     * Create a new bill
     */
    public void createNewBill(String billName, String billDescription, String billAmount)
    {
        BigInteger amount = new BigInteger(billAmount);

        // Create the bill
        Bill bill = new Bill(billName, amount, billDescription);

        // Add the bill to the list of bills
        LocalAccount.getInstance().addBill(bill);
    }


    public ArrayList<Bill> getListOfBills()
    {
        return LocalAccount.getInstance().getListOfBills();
    }
}
