import java.util.Arrays;

public class Engine {
    private String type;
    private int power;
    private double volume;
    private String[] drivers;

    public Engine(){}

    public Engine(String type, int power, double volume) {
        this.type = type;
        this.power = power;
        this.volume = volume;
    }

    public Engine(String type, int power, double volume, String[] drivers) {
        this.type = type;
        this.power = power;
        this.volume = volume;
        this.drivers = drivers;
    }



    public String getType(){
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String[] getDrivers() {
        return drivers;
    }

    public void setDrivers(String[] drivers) {
        this.drivers = drivers;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", power=" + power +
                ", volume=" + volume +
                ", drivers=" + Arrays.toString(drivers) +
                '}';
    }
}
