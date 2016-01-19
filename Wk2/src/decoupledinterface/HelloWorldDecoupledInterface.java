package decoupledinterface;

/**
 * Created by geoff_000 on 16/01/2016.
 */
public class HelloWorldDecoupledInterface {
    public static void main(String[] args) {
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
