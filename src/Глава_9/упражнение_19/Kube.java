package Глава_9.упражнение_19;

import java.util.Random;

/**
 * Created by andrej on 27.01.17.
 */
public class Kube implements Game {

    public String check() {
        int x = new Random().nextInt(6)+1;
        String s = ""+x;
        return s;
    }
    public static GameFactory gameFactory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Kube();
        }
    };
}
