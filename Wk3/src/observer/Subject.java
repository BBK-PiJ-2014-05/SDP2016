package observer;

/**
 * Created by geoff_000 on 24/01/2016.
 */
public interface Subject {

    void subscribeObserver(Observer observer);
    void unSubscribeObserver(Observer observer);
    void notifyObservers();
    String subjectDetails();


}
