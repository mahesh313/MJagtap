package refactorEmailService;

public class SecurityService {
    public SecurityService() {
    }

    static boolean checkPermission(String user) {
        //20 loc to check in DB
        if (user.equals("admin")) {
            return true;
        } else {
            return false;
        }
    }
}