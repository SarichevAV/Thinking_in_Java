package Глава_8.упражнение_12;

/**
 * Created by andrej on 22.01.17.
 */
public class Hamster extends Rodent {
    public Hamster() {
        System.out.println("Hamster.Constructor()");
    }

    @Override
    void run() {
        System.out.println("Hamster.run()");
    }

    @Override
    void sit() {
        System.out.println("Hamster.sit()");
    }
}
