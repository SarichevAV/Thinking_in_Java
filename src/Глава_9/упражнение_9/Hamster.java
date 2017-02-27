package Глава_9.упражнение_9;

/**
 * Created by andrej on 22.01.17.
 */
public class Hamster implements Rodent {
    @Override
    public void run() {
        System.out.println("Hamster.run()");
    }

    @Override
    public void sit() {
        System.out.println("Hamster.sit()");
    }
}
