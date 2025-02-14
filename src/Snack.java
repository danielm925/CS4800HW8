public class Snack{
    private final String name;
    private final double price;
    private int quantity;

    public Snack(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void decreaseQuantity(){
        if(quantity > 0){
            quantity--;
        }
    }
}
