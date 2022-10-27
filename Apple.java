public class Apple implements Product {
    double price;

    @Override
    public void displayProduct() {
        System.out.println("Apple has been added to the inventory");
    }

    public void setPrice(double p) {
        this.price = p;
    }

    public double getPrice() {
        return price;
    }
}