package Глава_8.упражнение_9;

/**
 * Created by andrej on 22.01.17.
 */
public class Start {
    private static RandomRodenGenerator randomRodenGenerator = new RandomRodenGenerator();
    public static void main(String[] args) {
        Rodent[] list = new Rodent[5];

        for (int i = 0; i < list.length; i++) {
            list[i] = randomRodenGenerator.next();
        }

        for (Rodent r :
                list) {
            r.run();
        }
    }
}
