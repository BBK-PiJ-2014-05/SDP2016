package helloworldspring;

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


    public void setMessageProvider(MessageProvider messageProvider){
        this.messageProvider = messageProvider;
    }

    public MessageProvider getMessageProvider(){
        return messageProvider;
    }


}
