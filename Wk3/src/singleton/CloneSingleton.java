package singleton;

/**
 * Created by geoff_000 on 23/01/2016.
 */
public class CloneSingleton {

    public static void main(String[] args) throws Exception{

        Singleton singleton = Singleton.getInstance();
        //Singleton clone = (Singleton) singleton.clone(); //does not work because Singleton not cloneable.
    }
}
