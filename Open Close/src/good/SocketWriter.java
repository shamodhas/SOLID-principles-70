package good;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/6/2025 9:32 AM
 * Project: SOLID
 * --------------------------------------------
 **/

public class SocketWriter implements Writer {
    @Override
    public void write(String content) {
        System.out.println("Writing to socket : " + content);
    }
}
