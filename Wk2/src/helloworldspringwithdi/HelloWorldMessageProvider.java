package helloworldspringwithdi;

/**
 * Created by geoff_000 on 17/01/2016.
 */
public class HelloWorldMessageProvider implements MessageProvider {

    public String getMessage(){

        return "Hello World!";
    }
}
