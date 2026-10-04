package Job;

public class Thermostat extends HomeDevice implements Switchable,Controllable {
    private boolean isOn = false;
    private int temperature = 20;
    private int targetTemperature = 22;

    public Thermostat(String name,String manufacturer,int year) {
        super(name,manufacturer,year);
    }
    @Override
    public void turnOn() {isOn = true;}

    @Override
    public void turnOff(){isOn = false;}

    @Override
    public boolean isOn(){ return isOn;}

    @Override
    public void setPower(int power) {
        this.targetTemperature = Math.min(power, 100);
    }

    @Override
    public int getPower(){
        return Math.min(Math.abs(targetTemperature - temperature), 100);
    }

    @Override
    public String getStatus() {
        if (isOn) {
            return"Работает, текущая " + temperature + "C,целевая " + targetTemperature + "С";
        }
        return"Выключен";
    }

    @Override
    public String getDeviceInfo() {
        return "Термостат: " + name +", производитель "+ manufacturer + ", год "+ year;
    }
}
