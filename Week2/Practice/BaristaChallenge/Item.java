public class Item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;
    
    // CONSTRUCTOR
    public Item(String name,double price){
        this.name=name;
        this.price=price;
    }
    // GETTERS & SETTERS
      // getter
    public String getName() {
        return name;
    }
    // setter
    public void setName(String name) {
        this.name=name;
    }
     // getter
    public double getPrice() {
        return price;
    }
    // setter
    public void setPrice(double price) {
        this.price=price;
    }
}

