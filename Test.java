import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws FileNotFoundException {

        int c = 0;

        List<Product> products = new ArrayList<>();
        AbstractFactory productFactory = FactoryProducer.getFactory();

        Scanner scan = new Scanner(new File("D:\\School\\Java Code\\Software Design Assignment 1\\src\\database.txt"));
        while(scan.hasNext()) {
            String line = scan.nextLine();
            String[] arr = line.split(",");
            products.add(productFactory.getProduct(arr[0]));
            products.get(c).setPrice(Double.parseDouble(arr[1]));
            products.get(c).displayProduct();
            System.out.println("The price of this product is $" + products.get(c).getPrice());
            c++;
        }
    }
}
