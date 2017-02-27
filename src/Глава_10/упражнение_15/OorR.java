package Глава_10.упражнение_15;

import java.util.Random;

/**
 * Created by andrej on 26.01.17.
 */
public class OorR implements Game {

    public String check() {
        int r = new Random(System.currentTimeMillis()).nextInt(2);
        if (r == 0) return "Orel";
        else return "reshka";
    }
    public static GameFactory gameFactory = new GameFactory() {
        @Override
        public Game getGame() {
            return new OorR();
        }
    };

}
