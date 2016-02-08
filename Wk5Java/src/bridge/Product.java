package bridge;

/**
 * Created by geoff_000 on 08/02/2016.
 */
public abstract class Product {

    protected String productName;



    @Override
    public String toString(){
        return "" + productName;
    }
}
