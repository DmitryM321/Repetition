package OOP.transport;

import OOP.driver.CarDriver;
import OOP.driver.Driver;
import OOP.driver.TruckDriver;

public class Truck <T extends TruckDriver> extends Transport {

    private  T driver;
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void setDriver(Driver driver) {
        super.setDriver(driver);
    }
    @Override
    public Driver getDriver() {
        return super.getDriver();
    }
    @Override
    public void infoAboutDriverAndRace() {
        System.out.println("водитель " + getDriver() + " управляет автомобилем " + getBrand() + " и будет участвовать в заезде");
    }
    @Override
    public void startMoving() {
       super.startMoving();
    }

    @Override
    public void stopMoving() {
        super.stopMoving();
    }

    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + getEngineVolume();
    }
}
