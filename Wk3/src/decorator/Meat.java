package decorator;

/**
 * Created by geoff_000 on 25/01/2016.
 */
public class Meat extends PizzaDecorator {

    public Meat(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDesc(){
        return "Meat (14.25) ";
    }

    @Override
    public double getPrice(){
        return decoratedPizza.getPrice() + 14.25;
    }
}
