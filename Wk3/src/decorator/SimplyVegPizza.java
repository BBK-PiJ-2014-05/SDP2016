package decorator;

/**
 * Created by geoff_000 on 25/01/2016.
 */
public class SimplyVegPizza implements Pizza {

    String desc;
    double price;

    public SimplyVegPizza(){
        desc = "SimplyVegPizza";
        price = 230;
    }

    public String getDesc(){
        return desc;
    }

    public double getPrice(){
        return price;
    }

}
