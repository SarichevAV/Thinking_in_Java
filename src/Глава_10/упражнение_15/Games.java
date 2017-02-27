package Глава_10.упражнение_15;

/**
 * Created by andrej on 26.01.17.
 */
public class Games {
    public static void playGame(GameFactory gf){
        Game game = gf.getGame();
        System.out.println(game.check());
    }

    public static void main(String[] args) {
        playGame(Kube.gameFactory);
        playGame(OorR.gameFactory);
    }
}