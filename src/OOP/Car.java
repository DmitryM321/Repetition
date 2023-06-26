package OOP;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String  color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    boolean summerOrWinterTires;

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean summerOrWinterTires) {
        if(brand == null || brand.isEmpty()) {
            brand = "default";
        }
        if(model == null || model.isEmpty()) {
            model = "default";
        }
        if(country == null || country.isEmpty()) {
            country = "default";
        }
        if(engineVolume <=0 ) {
            engineVolume = 1.5;
        }
        if(color == null || color.isEmpty()) {
            color = "белый";
        }
        if(year <=0) {
            engineVolume = 2000;
        }
        if(transmission == null || transmission.isEmpty() || transmission.isBlank() || !transmission.matches("^[a-zA-Zа-яА-ЯёЁ]+$")) {
            transmission = "default";
        }
        if(bodyType == null || bodyType.isEmpty() || !bodyType.matches("^[a-zA-Zа-яА-ЯёЁ]+$")) {
            bodyType = "default";
        }
        if(registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank() || !registrationNumber.matches("^[a-zA-Zа-яА-ЯёЁ0-9]+$")) {
            registrationNumber = "default";
        }
        if(numberOfSeats <= 0 || numberOfSeats >= 6) {
            numberOfSeats = 0;
        }
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.summerOrWinterTires = summerOrWinterTires;
    }



    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setSummerOrWinterTires(boolean summerOrWinterTires) {
        this.summerOrWinterTires = summerOrWinterTires;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSummerOrWinterTires() {
        return summerOrWinterTires;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", summerOrWinterTires=" + summerOrWinterTires +
                '}';
    }

    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия", "механика", "седан", "A123BC", 5, false);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "автомат", "седан", "B456DE", 5, true);
        Car car3 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "автомат", "купе", "C789FG", 2, false);
        Car car4 = new Car("Kia", "Sportage", 2.4, "красный", 2018, "Южная Корея", "автомат", "внедорожник", "D101KL", 5, true);
        Car car5 = new Car("", "Avante", -1.6, null, 2016, "Южная Корея", "механика", "седан", "E111MN(**", 5, false);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        }
}


