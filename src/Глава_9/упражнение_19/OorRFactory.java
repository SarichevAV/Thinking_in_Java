package Глава_9.упражнение_19;

/**
 * Created by andrej on 26.01.17.
 */
public class OorRFactory implements GameFactory {
    public Game getGame() {
        return new OorR();
    }
}
