package decorator;

/**
 * Created by geoff_000 on 25/01/2016.
 */
public class Spinach extends PizzaDecorator {

    public Spinach(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDesc(){
        return "Spinach (7.92) ";
    }

    @Override
    public double getPrice(){
        return decoratedPizza.getPrice() + 7.92;
    }

}
