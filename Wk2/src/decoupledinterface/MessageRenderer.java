package decoupledinterface;

/**
 * Created by geoff_000 on 16/01/2016.
 */
public interface MessageRenderer {

    void render();

    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
