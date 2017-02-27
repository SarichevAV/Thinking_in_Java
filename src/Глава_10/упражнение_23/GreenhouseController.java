package Глава_10.упражнение_23;


public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls_2 gc = new GreenhouseControls_2();

        gc.addEvent(gc.new Bell(900));

        Event [] eventList = {
                gc.new HumidifierOn(200),
                gc.new ThermostatDay(1200),
                gc.new LightOn(400),
                gc.new WaterOn(800),
                gc.new VentilationOn(900),
                gc.new VentilationOff(950),
                gc.new WaterOff(1000),
                gc.new LightOff(600),
                gc.new ThermostatNight(200)
        };

        gc.addEvent(gc.new Restart(3000, eventList));

        if (args.length == 1)
            gc.addEvent(new GreenhouseControls.Terminal(new Integer(args[0])));
        gc.run();
    }
}
