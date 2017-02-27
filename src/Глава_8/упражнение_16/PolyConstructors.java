package Глава_8.упражнение_16;

/**
 * Created by andrej on 23.01.17.
 *
 * Поведение полиморфных методов при вызове из конструкторов
 *
 */

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(2,2);
    }
}
