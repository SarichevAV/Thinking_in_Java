package Глава_8.упражнение_12;

/**
 * Created by andrej on 22.01.17.
 */
public class Mouse extends Rodent {
    public Mouse() {
        System.out.println("Mouse.Constructor()");
    }

    @Override
    void run() {
        System.out.println("Mouse.run()");
    }

    @Override
    void sit() {
        System.out.println("Mouse.sit()");
    }
}
