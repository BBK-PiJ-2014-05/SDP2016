package abstractfactoryjava;



/**
 * Created by geoff_000 on 06/02/2016.
 */
public interface AbstractParserFactory {

    public XMLParser  getParserInstance(String parserType);

}
