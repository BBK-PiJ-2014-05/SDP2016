package decorator;

/**
 * Created by geoff_000 on 25/01/2016.
 */
public class GreenOlives extends PizzaDecorator {

    public GreenOlives(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDesc(){
        return "Green olives (5.47) ";
    }

    @Override
    public double getPrice(){
        return decoratedPizza.getPrice() + 5.47;
    }



}
