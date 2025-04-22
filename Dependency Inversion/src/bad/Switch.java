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

public class Switch {
    private Bulb bulb;
    private Fan fan;

    public Switch(Bulb bulb) {
        this.bulb = bulb;
    }

    public Switch(Fan fan) {
        this.fan = fan;
    }

    public void press(){
        if (fan != null){
            fan.toggle();
        } else if (bulb != null){
            bulb.toggle();
        }
    }
}
