package Глава_9.упражнение_18;

/**
 * Created by andrej on 27.01.17.
 */
public class TricycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}
