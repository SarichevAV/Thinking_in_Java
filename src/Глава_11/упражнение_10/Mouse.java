package Глава_11.упражнение_10;

/**
 * Created by andrej on 22.01.17.
 */
public class Mouse extends Rodent {
    @Override
    void run() {
        System.out.println("Mouse.run()");
    }

    @Override
    void sit() {
        System.out.println("Mouse.sit()");
    }
}
