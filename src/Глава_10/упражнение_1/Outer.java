package Глава_10.упражнение_1;

/**
 * Created by andrej on 28.01.17.
 */
public class Outer {
    class Inner{}
    Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer =new Outer();
        Inner inner =outer.getInner();
    }
}
