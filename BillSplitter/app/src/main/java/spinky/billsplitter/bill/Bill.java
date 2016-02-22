package spinky.billsplitter.bill;

import java.math.BigInteger;

/**
 * Created by John on 22/02/2016.
 */
public class Bill {

    private String _billName;

    private BigInteger _billAmount;

    private String _billDescription;

    private BigInteger _ID;

    /**
     * Create a bill object
     * @param billName
     *      The name of the bill
     * @param billAmount
     *      The amount of the bill
     * @param billDescription
     *      The description of the bill
     */
    public Bill(String billName, BigInteger billAmount, String billDescription)
    {
        this._billName = billName;
        this._billAmount = billAmount;
        this._billDescription = billDescription;
    }

    /**
     * Get the name of the bill
     * @return
     *      String representation of the bill name
     */
    public String getBillName() {
        return _billName;
    }

    /**
     * Set the name of the bill
     * @param billName
     *      The name of the bill
     */
    public void setBillName(String billName) {
        this._billName = billName;
    }


    /**
     * Get the description of the bill
     * @return
     *      String representation of the bill description
     */
    public String getBillDescription() {
        return _billDescription;
    }


    /**
     * Set the description of the bill
     * @param billDescription
     *      The description of the bill
     */
    public void setBillDescription(String billDescription) {
        this._billDescription = billDescription;
    }


    /**
     * Get the description of the bill
     * @return
     *      The amount of rthe bill
     */
    public BigInteger getBillAmount() {
        return _billAmount;
    }


    /**
     * Set the description of the bill
     * @param billAmount
     *      The amount of the bill
     */
    public void setBillAmount(BigInteger billAmount) {
        this._billAmount = billAmount;
    }


    public void setID(BigInteger id){
        _ID = id;
    }

    public BigInteger getID()
    {
        return _ID;
    }
}
