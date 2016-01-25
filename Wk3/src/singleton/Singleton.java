package singleton;

/**
 * Created by geoff_000 on 23/01/2016.
 */

// eager Singleton

public class Singleton {

    //instantiate the only instance of the object ("static")
    private static Singleton INSTANCE = new Singleton();


    //make the constructor private to block access from outside the class, no further instances allowed

    private Singleton(){

    }

    //allow access to the single object from outside the class

    public static Singleton getInstance(){
        return INSTANCE;
    }
}

// lazy Singleton

class LazySingleton{

    private static LazySingleton instance = null;

    private LazySingleton(){}

// instantiation occurs only when required

    public static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        } return instance;
    }
}

// thread safe example using Synchronized key word

/**answer to (b) is that the Synchronized keyword enforces a locking protocol on the code block which means
* additional bit-setting at the machine code level; every call using the Synchronized keyword must first
* check the status of the lock before proceeding (acquiring/releasing). Performance cost may be 50 times slower
* but this is improving with each iteration of the JVM.
*/

class ThreadSafeSingleton{

    private static ThreadSafeSingleton threadSafeSingleton = null;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if (threadSafeSingleton == null){
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }


}

//The Synchronized keyword is used only if instance has not been initialized-- saves some performance cost
// instance must be checked a second time- after synchronized- to ensure correct locking.

class DoubleCheckedSingleton {

    private static DoubleCheckedSingleton instance = null;

    private DoubleCheckedSingleton() {
    }

    public static DoubleCheckedSingleton getInstance() {
        if (instance == null){
            synchronized (DoubleCheckedSingleton.class){
                if (instance == null){
                    instance = new DoubleCheckedSingleton();
                }
            }
        } return instance;
    }
}










