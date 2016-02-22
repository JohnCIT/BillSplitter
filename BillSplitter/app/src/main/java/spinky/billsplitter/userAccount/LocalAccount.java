package spinky.billsplitter.userAccount;

import java.util.ArrayList;

import spinky.billsplitter.bill.Bill;

/**
 * Created by John on 22/02/2016.
 */
public class LocalAccount {

    private static LocalAccount instance = null;

    private ArrayList<Bill> listOfBills = new ArrayList<Bill>();

    protected LocalAccount(){}


    public void addBill(Bill bill)
    {
        listOfBills.add(bill);
    }


    public ArrayList<Bill>  getListOfBills()
    {
        return listOfBills;
    }



    public static LocalAccount getInstance()
    {
        if(instance == null) {
            instance = new LocalAccount();
        }
        return instance;
    }


}
