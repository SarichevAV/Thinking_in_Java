package Глава_8.упражнение_16;

/**
 * Created by andrej on 23.01.17.
 */
public class RectangularGlyph extends Glyph{
    private int a = 1;
    private int b = 2;

    public RectangularGlyph(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("RectangularGlyph.RectangularGlyph(), a = " + a + ", b = " + b);
    }
    void draw(){
        System.out.println("RectangularGlyph.draw(), a = " + a + ", b = " + b);
    }
}
