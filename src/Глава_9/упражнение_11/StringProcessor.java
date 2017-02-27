package Глава_9.упражнение_11;

/**
 * Created by andrej on 26.01.17.
 */
public abstract class StringProcessor implements Processor {

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public abstract Object process(Object obj);


    public static void main(String[] args) {
        String s = "2143657";
        Apply.process(new Solution(), s);
    }
}
