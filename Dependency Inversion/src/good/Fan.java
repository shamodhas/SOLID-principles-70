package good;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/6/2025 10:14 AM
 * Project: SOLID
 * --------------------------------------------
 **/

public class Fan implements Device{
    private boolean isOn = false;

    @Override
    public void toggle() {
        isOn = !isOn;

        if (isOn) {
            System.out.println("The fan is ON");
        } else {
            System.out.println("The fan is OFF");
        }
    }
}
