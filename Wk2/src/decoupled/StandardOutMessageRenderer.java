package decoupled;

/**
 * Created by geoff_000 on 15/01/2016.
 */
public class StandardOutMessageRenderer {

    private HelloWorldMessageProvider provider = null;


    public void render(){

        if (provider == null){
            throw new RuntimeException(
            "You must first set provider for " + StandardOutMessageRenderer.class.getClass());

        }   System.out.println(provider.getMessage());

    }

    public void setMessageProvider(HelloWorldMessageProvider provider){
        this.provider = provider;
    }

    public HelloWorldMessageProvider getHelloWorldMessageProvider(){
        return provider;
    }

}
