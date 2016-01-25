package decorator;

/**
 * Created by geoff_000 on 25/01/2016.
 */
public abstract class PizzaDecorator implements Pizza {

    protected Pizza decoratedPizza;

    public PizzaDecorator (Pizza pizza){
        decoratedPizza = pizza;
    }

    public String getDesc(){
        return decoratedPizza.getDesc();
    }

    public double getPrice(){
        return decoratedPizza.getPrice();
    }

}
