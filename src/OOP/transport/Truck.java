package OOP.transport;

import OOP.driver.CarDriver;
import OOP.driver.TruckDriver;

public class Truck <T extends TruckDriver> extends Transport {

    private  T driver;
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    public void setDriver(T driver) {
        this.driver = driver;
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
