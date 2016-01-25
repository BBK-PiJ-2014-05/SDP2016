package observer;

/**
 * Created by geoff_000 on 24/01/2016.
 */
public interface Observer {

    void update(String desc);
    void subscribe();
    void unSubscribe();
}
