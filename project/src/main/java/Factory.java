public class Factory {
    public Product createProduct(String type){
        if ("A".equals(type)) {
            return new ConcreteProductA();
        } else if ("B".equals(type)) {
            return new ConcreteProductB();
        } else {
            return null;
        }
    }
}