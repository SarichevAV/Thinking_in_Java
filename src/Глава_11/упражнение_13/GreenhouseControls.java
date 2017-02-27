package Глава_11.упражнение_13;

public class GreenhouseControls extends Controller {

    private boolean light = false;
    public class LightOn extends Event {
        public LightOn(long delayTime) {
            super(delayTime);
        }
        public void action() {
            light = true;
        }
        public String toString() {
            return "Свет включен";
        }
    }

    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }
        public void action() {
            light = false;
        }
        public String toString() {
            return "Свет выключен";
        }
    }

    private boolean water = false;
    public class WaterOn extends Event {
        public WaterOn(long delayTime) {
            super(delayTime);
        }
        public void action(){
            water = true;
        }
        public String toString() {
            return "Полива включен";
        }
    }
    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }
        public void action(){
            water = false;
        }
        public String toString() {
            return "Полива выключен";
        }
    }

    private String thermostat = "День";
    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }
        public void action() {
            thermostat = "Ночь";
        }
        public String toString() {
            return "Термостат использует ночной режим";
        }
    }
    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }
        public void action() {
            thermostat = "День";
        }
        public String toString() {
            return "Термостат использует дневной режим";
        }
    }

    private boolean ventilation = false;
    public class VentilationOn extends Event {
        public VentilationOn(long delayTime) {
            super(delayTime);
        }
        public void action() {
            ventilation = true;
        }
        public String toString() {
            return "Проветривание включено";
        }
    }
    public class VentilationOff extends Event {
        public VentilationOff(long delayTime) {
            super(delayTime);
        }
        public void action() {
            ventilation = false;
        }
        public String toString() {
            return "Проветривание выключено";
        }
    }

    //Пример метода action(), вставляющего новый экземпляр
    //самого себя в список событий:
    public class Bell extends Event {
        public Bell(long delayTime) {
            super(delayTime);
        }
        public void action() {
            addEvent(new Bell(delayTime));
        }
        public String toString() {
            return "Бум!";
        }
    }

    public class Restart extends Event {
        Event[] eventList;
        public Restart(long delayTime, Event[] eventList){
            super(delayTime);
            this.eventList = eventList;
            for (Event e :
                    eventList) {
                addEvent(e);
            }
        }
        public void action() {
            for (Event e :
                    eventList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }
        public String toString() {
            return "Перезапуск системы";
        }
    }

    public static class Terminal extends Event {
        public Terminal(long delayTime) {
            super(delayTime);
        }
        public void action() {
            System.exit(0);

        }
        public String toString() {
            return "Отключение";
        }

    }
}
