
package theauctionhouse;

import java.util.ArrayList;


public class Moderator extends User {
    private static Moderator instance;
    ArrayList<String> pendingProducts = new ArrayList<String>();
    
    private Moderator()
    {
        
    }
    
    public static Moderator getInstance()
    {
        if ( instance == null )
        {
            instance = new Moderator();
        }
        return instance;
    }
    
    public void AcceptAuctionReq(Product p){
        
    }
}
