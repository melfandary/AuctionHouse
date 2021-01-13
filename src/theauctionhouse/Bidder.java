
package theauctionhouse;


class Bidder extends User {
    public int balance;

    public Bidder() {
    }

    public Bidder(int uID, String uname, String upass, String umail, int uage, String gender, String uaddress, int unumber) {
        super(uID, uname, upass, umail, uage, gender, uaddress, unumber);
    }

    public Bidder(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void bid(int bidprice, BidSession bs){}
    public void regToRoom(BidSession bs){}
    public void viewProductList(){}
    
    
}
