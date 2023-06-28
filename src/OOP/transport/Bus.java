package OOP.transport;

import OOP.driver.BusDriver;

public class Bus <T extends BusDriver> extends Transport {
    private T driver;

   public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    public void setDriver(T driver) {
        this.driver = driver;
    }
    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public double getEngineVolume() {
        return super.getEngineVolume();
    }

    @Override
    public void setEngineVolume(double engineVolume) {
        super.setEngineVolume(engineVolume);
    }

    @Override
    public void pitStop() {
        super.pitStop();
    }

    @Override
    public void bestLapTime() {
        super.bestLapTime();
    }

    @Override
    public void maximumSpeed() {
        super.maximumSpeed();
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
        return "Bus{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + getEngineVolume();
    }
}
//    @Override
//    public String toString() {
//        return "Bus{" +
//                "brand='" + getBrand() + '\'' +
//                ", model='" + getModel() + '\'' +
//                ", year=" + getYear() +
//                ", country='" + getCountry() + '\'' +
//                ", color='" + getColor() + '\'' +
//                ", maxSpeed=" + getMaxSpeed() +
//                '}';

