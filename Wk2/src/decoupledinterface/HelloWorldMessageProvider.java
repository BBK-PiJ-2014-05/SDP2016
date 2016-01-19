package decoupledinterface;

/**
 * Created by geoff_000 on 16/01/2016.
 */
public class HelloWorldMessageProvider implements MessageProvider {

    public String getMessage() {
        return "Hello World!";
    }
}
