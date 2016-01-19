package helloworldspring;

/**
 * Created by geoff_000 on 17/01/2016.
 */

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;

import java.io.FileInputStream;
import java.util.Properties;

public class HelloWorldSpring {
    public static void main(String[] args) throws Exception {

        // get the bean factory
        BeanFactory factory = getBeanFactory();

        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        MessageProvider mp = (MessageProvider) factory.getBean("provider");

        mr.setMessageProvider(mp);
        mr.render();
    }

    private static BeanFactory getBeanFactory() throws Exception {
        // get the bean factory - understanding DefaultListableBeanFactory(0
        // not really important.  It is just an Factory class example from
        // Spring.
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        // create a definition reader
        PropertiesBeanDefinitionReader rdr = new PropertiesBeanDefinitionReader(
                factory);

        // load the configuration options
        Properties props = new Properties();
        props.load(new FileInputStream("C:\\Users\\geoff_000\\IdeaProjects\\SDP2016\\Wk2\\src\\helloworldspring\\beans.properties"));

        rdr.registerBeanDefinitions(props);

        return factory;
    }

}
