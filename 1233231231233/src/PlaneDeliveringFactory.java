public class PlaneDeliveringFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new PlaneDelivering();
    }
}