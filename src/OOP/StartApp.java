package OOP;

import OOP.driver.BusDriver;
import OOP.driver.CarDriver;
import OOP.driver.TruckDriver;
import OOP.transport.Bus;
import OOP.transport.Car;
import OOP.transport.Truck;

public class StartApp {
    public static void main(String[] args) {

        Bus bus1 = new Bus("Volvo", "9500", 10.0);
        Bus bus2 = new Bus("Mercedes-Benz", "Citaro", 11.5);
        Bus bus3 = new Bus("MAN", "Lion's City", 12.0);

        Truck truck1 = new Truck("Scania", "R500", 16.0);
        Truck truck2 = new Truck("Volvo", "FH16", 17.0);
        Truck truck3 = new Truck("Mercedes-Benz", "Actros", 15.6);

        Car car1 = new Car("Kia", "Sportage", 2.4);
        Car car2 = new Car("Chevrolet", "Camaro", 6.2);
        Car car3 = new Car("Toyota", "Corolla", 1.8);

        System.out.println(bus1);
        System.out.println(truck1);
        System.out.println(car1);
        truck1.startMoving();
        car1.startMoving();
        bus2.stopMoving();
        truck1.maximumSpeed();
        CarDriver carDriver1 = new CarDriver("Шарль ДеГоль", 22);
        CarDriver carDriver2 = new CarDriver("Чан Кайши", 12);
        BusDriver busDriver = new BusDriver("Теодор Рузвельт", 33);
        TruckDriver truckDriver = new TruckDriver("Уинстон Черчилль", 43);
        car1.setDriver(carDriver1);
        bus2.setDriver(busDriver);
        bus2.setDriver(busDriver);
        truck3.setDriver(truckDriver);
        car1.infoAboutDriverAndRace();
        bus2.infoAboutDriverAndRace();
        truck3.infoAboutDriverAndRace();
        }
}


