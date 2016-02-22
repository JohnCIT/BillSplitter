package spinky.billsplitter.controllers;

import java.math.BigInteger;
import java.util.ArrayList;

import spinky.billsplitter.bill.Bill;
import spinky.billsplitter.userAccount.LocalAccount;

/**
 * Created by John on 21/02/2016.
 */
public class MainViewController {

    public void createNewBill()
    {
        BigInteger amount = new BigInteger("250");
        Bill bill = new Bill("Test name", amount, "Test description");

        LocalAccount.getInstance().addBill(bill);
    }


    public ArrayList<Bill> getListOfBills()
    {
        return LocalAccount.getInstance().getListOfBills();
    }


}
