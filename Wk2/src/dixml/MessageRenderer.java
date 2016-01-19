package dixml;

/**
 * Created by geoff_000 on 18/01/2016.
 */
public interface MessageRenderer {

    void render();
    MessageProvider getMessageProvider();

    void setMessageProvider(MessageProvider provider);
}
