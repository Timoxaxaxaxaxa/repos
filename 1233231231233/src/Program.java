import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write the type of transport for deliver");
        String transport = input.nextLine();
        ProductFactory productFactory = deliverProductByTransport(transport);
        Product product = productFactory.createProduct();

        product.deliverProduct();
    }
    static ProductFactory deliverProductByTransport(String transport){
        if (transport.equalsIgnoreCase("ship")) {
            return new ShipDeliveryFactory();
        } else if (transport.equalsIgnoreCase("plane")) {
            return new PlaneDeliveringFactory();
        } else {
            throw new RuntimeException("Delivering by " + transport + "is not accessible");
        }
    }
}