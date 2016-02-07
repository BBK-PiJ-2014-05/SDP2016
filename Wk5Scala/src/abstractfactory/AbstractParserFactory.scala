package abstractfactory

import com.sun.deploy.xml.XMLParser

/**
  * Created by geoff_000 on 05/02/2016.
  */
trait AbstractParserFactory {
  def getParserInstance(parserType:String):XMLParser


}
