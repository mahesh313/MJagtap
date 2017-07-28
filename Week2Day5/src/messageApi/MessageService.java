package messageApi;

/**
 * Created by jagtapm on 7/28/2017.
 */
public class MessageService {
     static void send(String from,String to,String subject,String message, IMessage iMessage) {
        iMessage.sendMessage(from,to,subject,message);
    }
}
