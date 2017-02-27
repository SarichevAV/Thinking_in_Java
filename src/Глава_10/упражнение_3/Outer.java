package Глава_10.упражнение_3;

/**
 * Created by andrej on 28.01.17.
 */
public class Outer {
    private String s;

    public Outer(String s) {
        this.s = s;
    }

    class Inner{
        @Override
        public String toString() {
            return "Inner{}";
        }
    }
    Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer =new Outer("Lol");
        Inner inner =outer.getInner();
        System.out.println(inner.toString());
    }
}
