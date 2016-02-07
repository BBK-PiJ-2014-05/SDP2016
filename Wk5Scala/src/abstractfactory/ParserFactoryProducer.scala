package abstractfactory

import com.sun.deploy.xml.XMLParser

/**
  * Created by geoff_000 on 06/02/2016.
  */
object ParserFactoryProducer extends AbstractParserFactory {
  override def getParserInstance(parserType: String): XMLParser = {
    if (parserType.equalsIgnoreCase("NYCFactory")){

    }

  }
}
