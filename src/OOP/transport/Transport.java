package OOP.transport;

import OOP.Competing;
import OOP.driver.Driver;

public abstract class Transport  <T extends Driver> implements Competing {
    private String brand;
    private String model;
    private double engineVolume;
    T driver;
    public void getDiagnosed() {
    }

    public void printType(){}
    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }
    public void setDriver(T driver) {
        this.driver = driver;
    }
    public T getDriver() {
        return driver;
    }
    void infoAboutDriverAndRace() {
    }
    @Override
    public void pitStop() {
        Competing.super.pitStop();
    }

    @Override
    public void bestLapTime() {
        Competing.super.bestLapTime();
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Truck max speed 111");
    }

    public void startMoving(){
        System.out.println("начать движение");
    }
    public void stopMoving(){
        System.out.println("закончить движение");
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
}


    //    private final int year;
//    private final String country;
//    private String color;
//    private int maxSpeed;

//    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
//        if (brand == null || brand.isEmpty()) {
//            brand = "default";
//        }
//        if (model == null || model.isEmpty()) {
//            model = "default";
//        }
//        if (country == null || country.isEmpty()) {
//            country = "default";
//        }
//        if (color == null || color.isEmpty()) {
//            color = "белый";
//        }
//        if (maxSpeed <= 0) {
//            maxSpeed = 0;
//        }
//            this.brand = brand;
//            this.model = model;
//            this.year = year;
//            this.country = country;
//            this.color = color;
//            this.maxSpeed = maxSpeed;
//        }

