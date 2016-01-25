package observer;

/**
 * Created by geoff_000 on 24/01/2016.
 */
public class SMSUsers implements Observer {

    Subject subject;
    String name;


    public SMSUsers(Subject subject, String name){
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update(String desc) {
        System.out.println(desc);

    }

    @Override
    public void subscribe() {
        subject.subscribeObserver(this);

    }

    @Override
    public void unSubscribe() {
        subject.unSubscribeObserver(this);


    }
}
