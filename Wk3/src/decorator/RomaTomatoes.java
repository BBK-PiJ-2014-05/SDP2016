package decorator;

/**
 * Created by geoff_000 on 25/01/2016.
 */
public class RomaTomatoes extends PizzaDecorator {


    public RomaTomatoes(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDesc(){
        return "Roma tomatoes (5.20) ";
    }

    @Override
    public double getPrice(){
        return decoratedPizza.getPrice() + 5.20;
    }

}
