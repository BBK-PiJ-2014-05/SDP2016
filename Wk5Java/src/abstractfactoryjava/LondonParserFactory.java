package abstractfactoryjava;



/**
 * Created by geoff_000 on 06/02/2016.
 */
public class LondonParserFactory implements AbstractParserFactory {


    @Override
    public XMLParser getParserInstance(String parserType) {
        XMLParser parser = null;

        if (parserType.equalsIgnoreCase("LondonFEEDBACK")){
            parser = new LondonFeedbackXML();
        }
        return parser;
    }
}
