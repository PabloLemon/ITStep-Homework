package Job;

public class LightBulb extends HomeDevice
implements Switchable, Controllable,EnergyEfficient {
    private boolean isOn = false;
    private int brightness = 100;
    private String color = "Белый";

    public LightBulb(String name, String manufacturer, int year) {
        super(name, manufacturer, year);
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setPower(int power) {
        this.brightness = power;
    }

    @Override
    public int getPower() {
        return brightness;
    }

    @Override
    public String getStatus() {
        if (isOn) {
            return "Включена,яркость " + brightness + "%,цвет " + color;
        }
        return "Выключена";
    }

    @Override
    public double calculateEnergyConsumption() {
        return brightness * 0.1;
    }

    @Override
    public String getEnergyClass() {
        return brightness <= 50 ? "A" : "B";
    }

    @Override
    public String getDeviceInfo() {
        return "Лампочка: " + name + ", производитель " + manufacturer + ", год" + year;
    }
}
