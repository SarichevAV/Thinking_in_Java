package Глава_8.упражнение_9;

import java.util.Random;

/**
 * Created by andrej on 22.01.17.
 */
public class RandomRodenGenerator {
    private Random random = new Random(47);
    public Rodent next(){
        switch (random.nextInt(2)){
            default:
            case 0: return new Mouse();
            case 1: return new Hamster();
        }
    }

}
