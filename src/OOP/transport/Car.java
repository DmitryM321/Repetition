package OOP.transport;

import OOP.driver.CarDriver;

public class Car  <T extends CarDriver> extends Transport{
    private T driver;
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    public void setDriver(T driver) {
        this.driver = driver;
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
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + getEngineVolume();
    }
}
//    private double engineVolume;
//    private String transmission;
//    private final String bodyType;
//    private String registrationNumber;
//    private final int numberOfSeats;
//    boolean summerTires;

//    public Car(String brand, String model, double engineVolume, String color, int year,
//               String country, String transmission, String bodyType, String registrationNumber,
//               int numberOfSeats, boolean summerTires, int maxSpeed) {
//        super(brand, model, year, country, color, maxSpeed);
//        if (engineVolume <= 0) {
//            this.engineVolume = 1.5;
//        } else {
//            this.engineVolume = engineVolume;
//        }
//        if (transmission == null || transmission.isEmpty() || transmission.isBlank() || !transmission.matches("^[a-zA-Zа-яА-ЯёЁ]+$")) {
//            this.transmission = "default";
//        } else {
//            this.transmission = transmission;
//        }
//        if (bodyType == null || bodyType.isEmpty() || !bodyType.matches("^[a-zA-Zа-яА-ЯёЁ]+$")) {
//            this.bodyType = "default";
//        } else {
//            this.bodyType = bodyType;
//        }
//        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank() || !registrationNumber.matches("^[a-zA-Zа-яА-ЯёЁ0-9]+$")) {
//            this.registrationNumber = "default";
//        } else {
//            this.registrationNumber = registrationNumber;
//        }
//        if (numberOfSeats <= 0 || numberOfSeats >= 6) {
//            this.numberOfSeats = 0;
//        } else {
//            this.numberOfSeats = numberOfSeats;
//        }
//        this.summerTires = summerTires;
//    }


//    @Override
//    public String toString() {
//        return "Car{" +
//                "brand='" + getBrand() + '\'' +
//                ", model='" + getModel() + '\'' +
//                ", year=" + getYear() +
//                ", country='" + getCountry() + '\'' +
//                ", color='" + getColor() + '\'' +
//                ", maxSpeed=" + getMaxSpeed() + '\'' +
//                " engineVolume=" + engineVolume +
//                ", transmission='" + transmission + '\'' +
//                ", bodyType='" + bodyType + '\'' +
//                ", registrationNumber='" + registrationNumber + '\'' +
//                ", numberOfSeats=" + numberOfSeats +
//                ", summerTires=" + summerTires +
//                '}';
//    }
//}

//    class Key {
//        private final boolean remoteEngineStart;
//        private final boolean keylessAccess;
//
//        Key(boolean remoteEngineStart, boolean keylessAccess) {
//            if ((remoteEngineStart != true && remoteEngineStart != false)
//                    || (keylessAccess != true && keylessAccess != false)) {
//                throw new IllegalArgumentException("Некорректные данные для параметров ключа!");
//            }
//            this.remoteEngineStart = remoteEngineStart;
//            this.keylessAccess = keylessAccess;
//        }
//    }
//    class Insurance {
//        private final int number;
//        private final LocalDate dateInsurance;
//        Insurance(int number, LocalDate dateInsurance) {
//            if (number <= 0) {
//                throw new IllegalArgumentException("Number must be greater than 0");
//            }
//            if (dateInsurance == null || dateInsurance.isBefore(LocalDate.now()) || dateInsurance.isAfter(LocalDate.now().plusYears(1))) {
//                throw new IllegalArgumentException("Invalid insurance date");
//            }
//            this.number = number;
//            this.dateInsurance = dateInsurance;
//        }
//        public void testDateInsurance( ) {
//            if (LocalDate.now().isAfter(dateInsurance)) {
//                System.out.println("Нужно срочно ехать оформлять новую страховку");
//            }
//        }
//        public void testNumberInsurance( ) {
//            var length = String.valueOf(number).length();
//            if (!(length == 9)) {
//                System.out.println("Номер страховки некорректный!");
//            }
//        }
//    }
//}
//


