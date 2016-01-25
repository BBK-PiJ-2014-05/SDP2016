package decorator;

/**
 * Created by geoff_000 on 25/01/2016.
 */
public class SimplyNonVegPizza implements Pizza{

    String desc;
    double price;

    public SimplyNonVegPizza(){
        desc = "SimplyNonVegPizza";
        price = 350;
    }

    public String getDesc(){
        return desc;
    }

    public double getPrice(){
        return price;
    }


}
