package dixml;

/**
 * Created by geoff_000 on 18/01/2016.
 */

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringWithDIXMLFile {

    public static void main(String[] args) throws Exception {

        // get the bean factory
        BeanFactory factory = getBeanFactory();
        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        mr.render();
    }

    private static BeanFactory getBeanFactory() throws Exception {
        // create a bean factory from dixml.xml
        BeanFactory factory = new ClassPathXmlApplicationContext("dixml.xml");
        return factory;
    }


}
