package Глава_8.упражнение_15;

/**
 * Created by andrej on 22.01.17.
 */
public class Mouse extends Rodent {
    Test test;
    private static long counter = 0;
    private final long id = counter++;
    public Mouse(Test test) {
        System.out.println("Создаём " + this);
        this.test = test;
        this.test.addRef();
    }

    protected void dispose(){
        System.out.println("Уничтожение " + this);
        test.dispose();
    }

    @Override
    public String toString() {
        return "Mouse " + id;
    }

    @Override
    void run() {
        System.out.println("Mouse.run()");
    }

    @Override
    void sit() {
        System.out.println("Mouse.sit()");
    }
}
