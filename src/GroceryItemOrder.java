public class GroceryItemOrder {
    private String name;
    private int quantity;
    private double pricePerUnit;

    //Constructs an item order to purchase the item with the given name, in the given quantity,
    // which costs the given price per unit.
    public GroceryItemOrder(String name, int quantity, double pricePerUnit){
        this.setName(name);
        this.setQuantity(quantity);
        this.setPricePerUnit(pricePerUnit);
    }
    //bloco com os metodos get e set
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    //Returns the total cost of this item in its given quantity. For example, four
    // boxes of cookies that cost 2.30 per unit have a total cost of 9.20.
    public double getCost(){
        return getQuantity() * getPricePerUnit();
    }
}
