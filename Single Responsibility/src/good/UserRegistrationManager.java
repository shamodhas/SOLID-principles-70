package good;

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
    private DataService dataService;
    private EmailService emailService;
    private LoginService loginService;

    public UserRegistrationManager(DataService dataService, EmailService emailService, LoginService loginService) {
        this.dataService = dataService;
        this.emailService = emailService;
        this.loginService = loginService;
    }

    public void registerUser(String name, String email) {
//        saveData(name, email);
        dataService.saveData(name, email);

//        sendEmail(email);
        emailService.sendEmail(email);

//        logUSer(name);
        loginService.logUSer(name);
    }
}
