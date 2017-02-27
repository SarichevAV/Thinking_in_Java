package Глава_8.упражнение_15;

/**
 * Created by andrej on 23.01.17.
 */
public class Test {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Test() {
        System.out.println("Создание " + this);
    }

    public void addRef(){
        refcount++;
    }
     protected void dispose(){
        if (--refcount == 0){
            System.out.println("Уничтожаем " + this);
        }
     }

    @Override
    public String toString() {
        return "Test " + id;
    }
}
