package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by geoff_000 on 23/01/2016.
 */

//Reflection can be used to override the private access of a Singleton constructor thereby allowing two instances of a singleton

public class SingletonWithReflection {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = null;
        try {

            Constructor[] constructors = Singleton.class.getDeclaredConstructors();

            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                s2 = (Singleton) constructor.newInstance();
                break;

            }

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        int s1HashCode = s1.hashCode();
        int s2HashCode = s2.hashCode();
        System.out.println("S1 hashcode: " + s1.hashCode());
        System.out.println("S2 hashcode: " + s2.hashCode());
        System.out.println("Two instances of a singleton? " + (s1HashCode!=s2HashCode));
    }
}
