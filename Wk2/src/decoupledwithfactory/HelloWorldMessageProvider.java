package decoupledwithfactory;

/**
 * Created by geoff_000 on 12/01/2016.
 */
public class HelloWorldMessageProvider implements MessageProvider{

    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
