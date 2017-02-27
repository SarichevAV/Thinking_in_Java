package Глава_14.упражнение_1;

/**
 * Created by andrej on 15.02.17.
 */
public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Имя класса: " + cc.getName() + " является интерфейсом? ["
                + cc.isInterface() + "]" );
        System.out.println("Простое имя: " + cc.getSimpleName());
        System.out.println("Каноническое имя: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("Глава_14.упражнение_1.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Не удалось найти FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face :
                c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Не удалось создать экземпляр");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Отказано в доступе");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
