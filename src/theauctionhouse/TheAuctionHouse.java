
package theauctionhouse;


public class TheAuctionHouse {


    public static void main(String[] args) {




        Seller s =new Seller(10);
        DB database = new DB();
        database.insertSeller(s);

    }
    
}
