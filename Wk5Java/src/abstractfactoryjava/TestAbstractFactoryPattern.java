package abstractfactoryjava;



import java.io.IOException;

/**
 * Created by geoff_000 on 06/02/2016.
 */
public class TestAbstractFactoryPattern {

    public static void main(String[] args) {

        AbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("NYCFactory");
        XMLParser parser = parserFactory.getParserInstance("NYCFEEDBACK");
        String msg = "";
        msg = parser.parse();
        System.out.println(msg);



    }
}
