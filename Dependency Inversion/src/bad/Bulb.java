package bad;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/6/2025 10:08 AM
 * Project: SOLID
 * --------------------------------------------
 **/

public class Bulb {
    private boolean isOn = false;

    public void toggle() {
        isOn = !isOn;

        if (isOn) {
            System.out.println("The bulb is ON");
        } else {
            System.out.println("THe bulb is OFF");
        }
    }
}











