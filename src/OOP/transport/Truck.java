package OOP.transport;

import OOP.driver.CarDriver;
import OOP.driver.Driver;
import OOP.driver.TruckDriver;
import OOP.enums.LoadCapacity;

public class Truck <T extends TruckDriver> extends Transport {
    private  T driver;
    private LoadCapacity loadCapacity;
    @Override
    public void printType() {
        if (getLoadCapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getLoadCapacity());
        }
    }
    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }
    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

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
