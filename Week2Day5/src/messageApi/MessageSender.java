package messageApi;

/**
 * Created by jagtapm on 7/28/2017.
 */
public class MessageSender {
    public static void main(String[] args) {
        MessageService.send("Mahesh", "Nilesh", "Greetings", "Hi", (String from,String to,String subject,String message) ->
        {
            //logic to send message via Whatsapp
            System.out.printf("Message sent from %s to %s with subject \"%s\" via Whatsapp is: %s%n", from, to, subject, message);
        });

        MessageService.send("Mahesh", "Sameer", "Greetings", "Hi", (String from,String to,String subject,String message) ->
        {
            //logic to send message via SMS
            System.out.printf("Message sent from %s to %s with subject \"%s\" via SMS is: %s%n", from, to, subject, message);
        });

        MessageService.send("Mahesh", "Jagtap", "Greetings", "Hi", (String from,String to,String subject,String message) ->
        {
            //logic to send message via JMS
            System.out.printf("Message sent from %s to %s with subject \"%s\" via JMS is: %s%n", from, to, subject, message);
        });

        MessageService.send("Mahesh", "Akshay", "Greetings", "Hi", (String from,String to,String subject,String message) ->
        {
            //logic to send message via EMail
            System.out.printf("Message sent from %s to %s with subject \"%s\" via Email is: %s%n", from, to, subject, message);
        });
    }
}
