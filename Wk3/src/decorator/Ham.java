package decorator;

/**
 * Created by geoff_000 on 25/01/2016.
 */
public class Ham extends PizzaDecorator {


    public Ham(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDesc(){
        return "Ham (55) ";

    }

    @Override
    public double getPrice(){
        return decoratedPizza.getPrice() + 55;
    }


}
