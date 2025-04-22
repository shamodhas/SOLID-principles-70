package good;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/6/2025 9:43 AM
 * Project: SOLID
 * --------------------------------------------
 **/

public class Eagle extends Bird implements FlyingBird {
    @Override
    void eat() {
        System.out.println("Eagle can eat");
    }

    @Override
    public void fly() {

    }

//    @Override
//    void fly() {
//        System.out.println("Eagle can fly");
//    }
}










