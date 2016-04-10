package smljava;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;


/**
 * Created by geoff_000 on 20/02/2016.
 */
public class InstructionFactory {

    InputStream inputStream;

    public Class getInstrClass(String opCode) throws IOException {

        Class c = null;


        try {
            Properties prop = new Properties();
            String propFileName = "config.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
            String result = prop.getProperty(opCode);
            c = Class.forName(result);

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
            return c;

    }

    public Class[] getParams(Class c) throws Exception{

        Constructor[] constructors = c.getConstructors();
        Constructor secondConstructor = constructors[1];
        Class[] paramTypes = secondConstructor.getParameterTypes();

        return paramTypes;
    }

    public Constructor getConstructor(Class c){
        Constructor[] constructors = c.getConstructors();
        Constructor result = constructors[1];
        return result;
    }


}