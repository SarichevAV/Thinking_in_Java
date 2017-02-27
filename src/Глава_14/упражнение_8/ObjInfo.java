package Глава_14.упражнение_8;

import Глава_14.упражнение_1.FancyToy;

/**
 * Created by andrej on 18.02.17.
 */
public class ObjInfo {
    public static void getInfo(Object o) {
        Class c = o.getClass();
        System.out.println("Объект реализует " + c.getInterfaces().length + " интерфейса:");
        for (Class inter :
                c.getInterfaces()) {
            System.out.println("  * " + inter.getSimpleName());
        }
    }

    public static void main(String[] args) {
        getInfo(new FancyToy());
    }
}
