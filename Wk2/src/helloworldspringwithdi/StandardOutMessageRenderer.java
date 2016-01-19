package helloworldspringwithdi;

/**
 * Created by geoff_000 on 17/01/2016.
 */
public class StandardOutMessageRenderer implements MessageRenderer {

    MessageProvider messageProvider = null;

    public void render(){

        if (messageProvider == null){
            throw new RuntimeException("You must set the message provider for class: " +
                    StandardOutMessageRenderer.class.getName());

        } System.out.println(messageProvider.getMessage());
    }


    public void setMessageProvider(MessageProvider provider){
        this.messageProvider = provider;
    }

    public MessageProvider getMessageProvider(){
        return this.messageProvider;
    }

}
