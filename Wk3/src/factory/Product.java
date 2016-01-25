package factory;

/**
 * Created by geoff_000 on 23/01/2016.
 */

//declare an interface to handle different concrete objects of the same type
public interface Product {

    void speak();


}

//the first concrete class of type Product
class ConcerteProduct1 implements Product{

    public void speak(){
        System.out.println("a concrete object of type Product!");
    }

}
//another concrete class of type Product
class ConcreteProduct2 implements Product{

    public void speak(){
     System.out.println("another concrete object of type Product!");
    }
}

//the factory class- a concrete object may be created by passing only a criteria "small" or "large"
class Factory{

    public static Product creator(String criteria){
        if (criteria.equals("small")){
            return new ConcerteProduct1();
        } else if (criteria.equals("large")){
            return new ConcreteProduct2();
        } else return null;
    }

    public Product concreteCreator(Product product) throws Exception{
        return product.getClass().newInstance();
    }


}

//the factory example
class ProductFactoryExample {
    public static void main(String[] args) {
        Product p1 = Factory.creator("small");
        p1.speak();
        Product p2 = Factory.creator("large");
        p2.speak();

        Factory f = new Factory();
        try {
            Product p3 = f.concreteCreator(p1);
            p3.speak();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}