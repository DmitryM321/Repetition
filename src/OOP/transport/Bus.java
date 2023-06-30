package OOP.transport;

import OOP.NegativeExperienceException;
import OOP.driver.BusDriver;
import OOP.driver.Driver;
import OOP.enums.Capacity;

public class Bus <T extends BusDriver> extends Transport {
    private T driver;
    private Capacity capacity;

    public Capacity getCapacity() {
        return capacity;
    }
    public void checkExperience(T driver) {
        try {
            if (driver.getExperience() <= 0) {
                throw new NegativeExperienceException("Недостаточный опыт3");
            }
        } catch (NegativeExperienceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Проверка завершена");
        }
    }


    @Override
    public void printType() {
        if (getCapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getCapacity());
        }
    }
    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public Bus(String brand, String model, double engineVolume) {
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

