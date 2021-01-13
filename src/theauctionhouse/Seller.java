package theauctionhouse;

import java.util.ArrayList;

public class Seller extends User {

    private float balance;
    private ArrayList<Product> postedProducts;


    public Seller(float balance) {
        this.balance = balance;

    }

    public Seller(int uID, String uname, String upass, String umail, int uage, String gender, String uaddress, int unumber, float balance, ArrayList<Product> postedProducts) {
        super(uID, uname, upass, umail, uage, gender, uaddress, unumber);
        this.balance = balance;
        this.postedProducts = postedProducts;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
