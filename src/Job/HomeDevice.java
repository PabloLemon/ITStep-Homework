package Job;

public abstract class HomeDevice {
protected String name;
protected String manufacturer;
protected int year;

public HomeDevice(String name,String manufacturer,int year) {
    this.name = name;
    this.manufacturer = manufacturer;
    this.year = year;
}
public abstract String getDeviceInfo();
}
