package Глава_9.упражнение_18;

/**
 * Created by andrej on 27.01.17.
 */
public class Start {
    public static void goCycle(CycleFactory cycleFactory){
        Cycle cycle = cycleFactory.getCycle();
        cycle.check();
    }

    public static void main(String[] args) {
        goCycle(new BicycleFactory());
        goCycle(new TricycleFactory());
        goCycle(new UnicycleFactory());
    }
}
