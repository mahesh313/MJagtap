package refactorEmailService;

import org.junit.Test;

/**
 * Created by jagtapm on 7/25/2017.
 */
public class TestEmailService {
    @Test
    public void testEmailservice() {
        EmailService.sendEmail("admin","jmahesh313@yahoo.com","hi mahesh!!");
    }
}
