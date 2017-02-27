package Глава_12.упражнение_14;

/**
 * Created by andrej on 03.02.17.
 */
public class OnOffSwitch {
    private static Switch sw = new Switch();

    public static void f() throws OnOffException1, OnOffException2{}

    public static void main(String[] args) {
        try {
            sw.on();
            throw new RuntimeException();
        } finally {
            sw.off();
        }
    }
}
