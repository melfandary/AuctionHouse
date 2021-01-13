
package theauctionhouse;


public final class Transaction {
    private final int ID;
    private final User PAYER;
    private final User RECIEVER;
    private final Product ITEM;

    public Transaction(int ID, User PAYER, User RECIEVER, Product ITEM) {
        this.ID = ID;
        this.PAYER = PAYER;
        this.RECIEVER = RECIEVER;
        this.ITEM = ITEM;
    }

    public int getID() {
        return ID;
    }

    public User getPAYER() {
        return PAYER;
    }

    public User getRECIEVER() {
        return RECIEVER;
    }

    public Product getITEM() {
        return ITEM;
    }


    

}
