package Глава_12.упражнение_14;

/**
 * Created by andrej on 03.02.17.
 */
public class Switch {
    private boolean state = false;
    public boolean read(){ return state; }
    public void on() {
        state = true;
        System.out.println(this);
    }
    public void off() {
        state = false;
        System.out.println(this);
    }
    @Override
    public String toString() {
        return state ? "Вкл" : "Выкл";
    }
}
