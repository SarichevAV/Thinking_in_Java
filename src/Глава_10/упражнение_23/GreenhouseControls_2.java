package Глава_10.упражнение_23;

/**
 * Created by andrej on 29.01.17.
 */
public class GreenhouseControls_2 extends GreenhouseControls {

    private boolean humidifier = false;
    public class HumidifierOn extends Event{
        public HumidifierOn(long delayTime) {
            super(delayTime);
        }
        public void action() {
            humidifier = true;
        }
        public String toString() {
            return "Улважнитель включен";
        }
    }
    public class HumidifierOff extends Event{
        public HumidifierOff(long delayTime) {
            super(delayTime);
        }
        public void action() {
            humidifier = false;
        }
        public String toString() {
            return "Увлажнитель выключен";
        }
    }
}
