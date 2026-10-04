package Job;

public class SmartHomeTest {
    public static void main(String[] args){

        LightBulb bulb = new LightBulb("Лампа в гостиной" ,"Philips" , 2023);
        Thermostat thermo = new Thermostat("Термостат" ,"Xiaomi" ,2022);
        SmartTV tv = new SmartTV("Теливизор ","Samsung ",2024);

        HomeDevice[] devices = {bulb,thermo,tv };

        System.out.println("--- все устройства ---");
        for(HomeDevice d : devices) {
            System.out.println(d.getDeviceInfo());
        }
            System.out.println ("\n--- Включаем ---");
        bulb.turnOn();
        thermo.turnOn();
        tv.turnOn();

        bulb.setPower(80);
        tv.setPower(60);
        thermo.setPower(25);

        for(HomeDevice d : devices) {
            if(d instanceof Controllable) {
                System.out.println(((Controllable)d).getStatus());
            }
        }

        System.out.println("\n--- Потребление энергии ---");
        for(HomeDevice d : devices) {
            if (d instanceof  EnergyEfficient) {
                EnergyEfficient e = (EnergyEfficient) d;
                System.out.println(d.getDeviceInfo()
            + " | Потребление: " + e.calculateEnergyConsumption()
               + "Вт | Класс: " + e.getEnergyClass());
            }
        }

        System.out.println("\n--- Массив Switchable ---");
        Switchable[] switchables = {bulb,thermo,tv };
        for (Switchable s : switchables) {
            s.turnOff();
            System.out.println("Состояние (isON): " + s.isOn());
        }

        System.out.println("\n--- Массив Controllable ---");
        Controllable[] controllables = {bulb,thermo,tv};
        for (Controllable c : controllables ) {
            System.out.println("Мощность: "+ c.getPower());
        }

        System.out.println("\n--- Массив EnergyEfficicent ---");
        EnergyEfficient[] efficient = {bulb,tv};
        for (EnergyEfficient e : efficient) {
            System.out.println("Класс энергоэффективности " + e.getEnergyClass());
        }
    }
}
