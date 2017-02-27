package Глава_14.упражнение_1;

/**
 * Created by andrej on 15.02.17.
 */
public class FancyToy extends Toy
implements HasBatteries, Waterproof, Shoots, NewInterface {
    public FancyToy() {
        super(1);
    }
}
