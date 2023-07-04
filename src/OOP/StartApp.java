package OOP;

import OOP.driver.BusDriver;
import OOP.driver.CarDriver;
import OOP.driver.TruckDriver;
import OOP.transport.Bus;
import OOP.transport.Car;
import OOP.transport.Truck;

import java.util.ArrayList;
import java.util.List;

public class StartApp {
    public static void main(String[] args) {
        List<Bus> buses = new ArrayList<>();
        buses.add(new Bus("Volvo", "9500", 10.0));
        buses.add(new Bus("Mercedes-Benz", "Citaro", 12.0));
        buses.add(new Bus("MAN", "Lion's City", 9.0));

        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Scania", "R500", 15.0));
        trucks.add(new Truck("Kia", "FH16", 16.0));
        Truck truck2 = new Truck("Chevrolet", "Actros", 13.0);

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camaro", 2.0));
        cars.add(new Car("Kia", "Corolla", 1.8));
        Car car2 = new Car("Chevrolet", "Sportage", 2.2);


        List<CarDriver> carDrivers = new ArrayList<>();
        carDrivers.add(new CarDriver("Шарль ДеГоль", -22));
        carDrivers.add(new CarDriver("Чан Кайши", 12));
        CarDriver carDriver2 = new CarDriver("Теодор Рузвельт", 33);
        Mechanic mechanic = new Mechanic("Джорж Буш", "Tesla");
        mechanic.addTransport(car2);
        mechanic.repair(car2);
        mechanic.performMaintenance(car2);
        mechanic.addTransport(truck2);
        mechanic.repair(truck2);

        car2.setDriver(carDriver2);
        car2.getDriver();
        mechanic.getTransportList();


//        BusDriver busDriver = new BusDriver("Теодор Рузвельт", 33);
//        TruckDriver truckDriver = new TruckDriver("Уинстон Черчилль", -43);
        }
}


