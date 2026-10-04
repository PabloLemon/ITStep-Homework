package Job;

public class SmartTV extends HomeDevice
implements Switchable,Controllable,EnergyEfficient {

    private boolean isOn = false;
    private int volume = 50 ;
    private String currentCHANNEL = "1";

    public SmartTV(String name,String manufacturer,int year) {
        super(name,manufacturer,year);
    }
    @Override
    public void turnOn() { isOn = true;}

    @Override
    public void turnOff() { isOn = false;}

    @Override
    public boolean isOn (){ return isOn;}

    @Override
    public void setPower(int power) { this.volume = power;}

    @Override
    public int getPower(){ return volume;}

    @Override
    public String getStatus() {
        if(isOn){
            return "Включен, канал " + currentCHANNEL + ", громкость "+ volume +"%";
        }
        return "Выключен";
    }
    @Override
    public double calculateEnergyConsumption() {
        return volume * 0.5 + 18 ;
    }

    @Override
    public String getEnergyClass() {
        if(volume <= 30) return"A";
        if(volume <=70) return "B";
        return"C";
    }

    @Override
    public String getDeviceInfo() {
        return "SmartTV: "+ name + ", производитель "+ manufacturer +", год " + year;
    }
}
