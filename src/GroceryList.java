public class GroceryList {
    GroceryItemOrder[] groceries; // list of groceries
    int groceries_index; // how much groceries there are int the array.

    // Constructor
    public GroceryList() {
        groceries = new GroceryItemOrder[10];
        groceries_index = 0;
    }

    //Adds the given item order to this list if the list has fewer than 10 items.
    public void add(GroceryItemOrder item) {
        if (groceries_index<10) {
            this.groceries[groceries_index] = item;
            groceries_index++;
        }
    }
    //Returns the total sum cost of all grocery item orders in this list.
    public double getTotalCost() {
        double totalCost = 0;
        for (int i=0; i<groceries_index;i++){
           totalCost += groceries[i].getCost();
        }
        return totalCost;
    }
}
