package Глава_9.упражнение_18;

/**
 * Created by andrej on 27.01.17.
 */
public class BicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}
