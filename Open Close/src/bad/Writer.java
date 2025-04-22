package bad;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/6/2025 9:25 AM
 * Project: SOLID
 * --------------------------------------------
 **/

public class Writer {
    public void writeToFile(String content) {
        System.out.println("Writing to file : " + content);
    }

    public void writeToSocket(String content) {
        System.out.println("Writing to socket : " + content);
    }

    public void writeToDatabase(String content) {
        System.out.println("Writing to database : " + content);
    }
}








