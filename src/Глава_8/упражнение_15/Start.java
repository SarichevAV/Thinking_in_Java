package Глава_8.упражнение_15;

/**
 * Created by andrej on 22.01.17.
 */
public class Start {
    public static void main(String[] args) {
        Test test = new Test();

        Mouse[] list = new Mouse[]{new Mouse(test),new Mouse(test),new Mouse(test),new Mouse(test)};

        for (Mouse m :
                list) {
            m.dispose();
        }
    }
}
