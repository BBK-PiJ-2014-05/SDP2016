package abstractfactoryjava;

/**
 * Created by geoff_000 on 06/02/2016.
 */
public class ParserFactoryProducer {

    public static AbstractParserFactory getFactory(String type) {
        AbstractParserFactory fac = null;
        if (type.equalsIgnoreCase("NYCFactory")) {
            fac = new NYCParserFactory();
        } else {
            fac = new LondonParserFactory();
        }
        return fac;

    }
}
