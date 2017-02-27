package Глава_9.упражнение_19;

/**
 * Created by andrej on 26.01.17.
 */
public class Games {
    public static void playGame(GameFactory gf){
        Game game = gf.getGame();
        System.out.println(game.check());
    }

    public static void main(String[] args) {
        playGame(new KubeFactory());
        playGame(new OorRFactory());
    }
}