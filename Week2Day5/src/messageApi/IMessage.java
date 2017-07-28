package messageApi;

/**
 * Created by jagtapm on 7/28/2017.
 */
@FunctionalInterface
public interface IMessage {
    void sendMessage(String from,String to,String subject,String message);
}

