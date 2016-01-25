package singleton;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by geoff_000 on 23/01/2016.
 */
public class SingletonSerializable implements Serializable {

    private static SingletonSerializable instance = null;

    private SingletonSerializable(){}

    public static SingletonSerializable getInstance(){
        if (instance == null){
            synchronized (instance) {
                instance = new SingletonSerializable();
            }

        } return instance;
    }


}

class SerializeSingleton {
    public static void main(String[] args) {
        try {
            SingletonSerializable singleton = SingletonSerializable.getInstance();
            FileOutputStream fos = new FileOutputStream("singleton.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(singleton);
            fos.close();
            oos.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
