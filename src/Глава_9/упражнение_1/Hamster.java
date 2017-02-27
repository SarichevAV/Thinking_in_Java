package Глава_9.упражнение_1;

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
