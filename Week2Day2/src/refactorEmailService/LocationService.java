package refactorEmailService;

public class LocationService {
    public LocationService() {
    }

    static String retrieveLocation(String email) {
        //20 loc to check with Webservice
        if (email.endsWith("@yahoo.com")) {
            return "USA";
        } else {
            return "Pakistan";
        }
    }

    static boolean checkLocation(String location) {
        //20 loc to check in DB
        if (location.equals("USA")) {
            return true;
        } else {
            return false;
        }
    }
}