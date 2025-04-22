package bad;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/6/2025 9:45 AM
 * Project: SOLID
 * --------------------------------------------
 **/

public class Penguin extends Bird{
    @Override
    void eat() {
        System.out.println("Penguin can eat");
    }

    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguin cannot fly");
    }
}












