package mastermind

/**
  * Created by geoff_000 on 02/03/2016.
  */
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext


object Factory {

  def getInstance(c: Class[_], b: Boolean): Game ={

    val context = new ClassPathXmlApplicationContext("Beans.xml")
    val colourSetMap = context.getBean("possibleColours")







    null



  }


}
