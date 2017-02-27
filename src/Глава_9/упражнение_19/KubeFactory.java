package Глава_9.упражнение_19;

/**
 * Created by andrej on 27.01.17.
 */
public class KubeFactory implements GameFactory {
    public Game getGame() {
        return new Kube();
    }
}
