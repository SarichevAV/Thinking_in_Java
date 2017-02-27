package Глава_9.упражнение_11;

/**
 * Created by andrej on 26.01.17.
 */
public class Apply {
    public static void process(Processor p, Object s){
        System.out.println("Используюется процессор " + p.name());
        System.out.println(p.process(s));
    }
}
