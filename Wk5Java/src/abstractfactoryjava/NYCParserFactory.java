package abstractfactoryjava;



/**
 * Created by geoff_000 on 06/02/2016.
 */
public class NYCParserFactory implements AbstractParserFactory {

    String msg = null;
    @Override
    public XMLParser getParserInstance(String parserType) {
            XMLParser parser = null;
            msg = parserType;

        if (parserType.equalsIgnoreCase("NYCFEEDBACK")){
            parser = new NYCFeedbackXML();
        }
        return parser;
    }

    public String parse(){
        return "ok";
    }


}
