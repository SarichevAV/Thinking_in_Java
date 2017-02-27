package Глава_8.упражнение_9;

/**
 * Created by andrej on 22.01.17.
 */
public class Hamster extends Rodent {
    @Override
    void run() {
        System.out.println("Hamster.run()");
    }

    @Override
    void sit() {
        System.out.println("Hamster.sit()");
    }
}
