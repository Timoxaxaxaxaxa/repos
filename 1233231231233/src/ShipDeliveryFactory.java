public class ShipDeliveryFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new ShipDelivering();
    }
}
