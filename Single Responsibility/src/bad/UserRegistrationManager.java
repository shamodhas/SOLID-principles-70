package bad;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/6/2025 9:08 AM
 * Project: SOLID
 * --------------------------------------------
 **/

public class UserRegistrationManager {
    public void registerUser(String name, String email) {
        saveData(name, email);

        sendEmail(email);

        logUSer(name);
    }

    private void logUSer(String name) {
        System.out.println("Logging user : " + name);
    }

    private void sendEmail(String email) {
        System.out.println("Send email to : " + email);
    }

    private void saveData(String name, String email) {
        System.out.println("User data saved");
    }
}
