public class Banana implements Product {
    double price;

    @Override
    public void displayProduct() {
        System.out.println("Banana has been added to the inventory");
    }

    public void setPrice(double p) {
        this.price = p;
    }

    public double getPrice() {
        return price;
    }

}