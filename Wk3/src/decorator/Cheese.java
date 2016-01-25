package decorator;

/**
 * Created by geoff_000 on 25/01/2016.
 */
public class Cheese extends PizzaDecorator {

    public Cheese(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDesc(){
        return "Cheese (20.72) ";
    }

    @Override
    public double getPrice(){
        return decoratedPizza.getPrice() + 20.72;
    }
}
