package decorator;

/**
 * Created by geoff_000 on 25/01/2016.
 */

import java.text.DecimalFormat;

public class TestDecoratorPattern {

    private static DecimalFormat dformat;

    static {
        dformat = new DecimalFormat("#.##");

    }

    public static void main(String[] args){

        Pizza pizza = new SimplyVegPizza();
        pizza = new RomaTomatoes(pizza);
        print(pizza);
        pizza = new GreenOlives(pizza);
        print(pizza);
        pizza = new Spinach(pizza);
        print(pizza);
        pizza = new SimplyNonVegPizza();
        print(pizza);
        pizza = new Meat(pizza);
        print(pizza);
        pizza = new Cheese(pizza);



    }

    private static void print(Pizza pizza){
        System.out.println("Desc: " + pizza.getDesc());
        System.out.println("Price: " + dformat.format(pizza.getPrice()));
    }
}