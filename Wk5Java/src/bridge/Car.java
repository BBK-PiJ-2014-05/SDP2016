package bridge;

/**
 * Created by geoff_000 on 08/02/2016.
 */
public abstract class Car {

    protected Product product;
    protected String carName;



    public void produceProduct(){
        System.out.println("Producing " + product.toString() +  " System");
    }

    public void assemble(){
        System.out.println("Modifying product " + product.toString() + " according to " + carName + " specifications.");
    }
    void printDetails(){
        System.out.println("Car: " + carName + ", Product: " + product.toString());

    }
}
