package theauctionhouse;

public class Product {


    private int ID;
    private String name;
    private String description;
    private int startingPrice;
    private User owner;

    public Product(int ID, String name, String description, int startingPrice, User owner) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.startingPrice = startingPrice;
        this.owner = owner;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(int startingPrice) {
        this.startingPrice = startingPrice;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
