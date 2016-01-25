package observer;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by geoff_000 on 24/01/2016.
 */
public class CommentaryObject implements Subject, Commentary {

    private ArrayList<Observer> observers;
    private String subject;
    String commentary;

    public CommentaryObject(ArrayList<Observer> observers, String subject){
        this.observers = observers;
        this.subject = subject;
        commentary = null;
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers){
            observer.update(subjectDetails());
        }

    }

    @Override
    public String subjectDetails() {
        return commentary;
    }

    @Override
    public void setDesc(String desc){
        commentary = desc;
        notifyObservers();


    }
}
