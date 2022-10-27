import java.util.Objects;

public class ProductFactory extends AbstractFactory {
    @Override
    public Product getProduct(String productName) {
        if(Objects.equals(productName, "Banana")) {
            return new Banana();
        } else if (Objects.equals(productName, "Apple")) {
            return new Apple();
        }
        return null;
    }
}
