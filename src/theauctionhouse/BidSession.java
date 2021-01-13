package theauctionhouse;

import java.util.ArrayList;

public class BidSession {


    private Bidder highestBidder;
    private BiddingRoom BidRoom;
    private Seller seller;
    private Product biddingProd;
    private ArrayList<Bidder> BiddersList;


    public BidSession(Bidder highestBidder, BiddingRoom bidRoom, Seller seller, Product biddingProd, ArrayList<Bidder> biddersList) {
        this.highestBidder = highestBidder;
        BidRoom = bidRoom;
        this.seller = seller;
        this.biddingProd = biddingProd;
        BiddersList = biddersList;
    }

    private Transaction endSession() {
        return null;
    }


}
