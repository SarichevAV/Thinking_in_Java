package Глава_9.упражнение_3;

/**
 * Created by andrej on 23.01.17.
 */
public class ExtendClass extends BaseClass {
    @Override
    void print() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        ExtendClass extendClass = new ExtendClass();
        extendClass.print();
    }
}
