package Глава_8.упражнение_16;

/**
 * Created by andrej on 23.01.17.
 */

public class Glyph {
    void draw(){
        System.out.println("Glyph.draw()");
    }

    public Glyph() {
        System.out.println("Glyph() перед draw()");
        draw();
        System.out.println("Glyph() после draw()");
    }
}
