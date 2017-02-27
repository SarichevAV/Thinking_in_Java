package Глава_11.упражнение_10;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by andrej on 22.01.17.
 */
public class Start {
    private static RandomRodenGenerator randomRodenGenerator = new RandomRodenGenerator();
    public static void main(String[] args) {
        ArrayList<Rodent> rodents = new ArrayList<Rodent>();

        for (int i = 0; i < 10; i++) {
            rodents.add(randomRodenGenerator.next());
        }

        Iterator<Rodent> iterator = rodents.iterator();

        while (iterator.hasNext()){
            iterator.next().run();
        }
    }
}
