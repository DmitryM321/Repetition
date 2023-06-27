package OOP;

public class StartApp {
    public static void main(String[] args) {

        Car car1 = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия", "механика", "седан", "A123BC", 5, false, 122);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "автомат", "седан", "B456DE", 5, true, 222);
        Car car3 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "автомат", "купе", "C789FG", 2, false, 250);
        Car car4 = new Car("Kia", "Sportage", 2.4, "красный", 2018, "Южная Корея", "автомат", "внедорожник", "D101KL", 5, true, 12);
        Car car5 = new Car("", "Avante", -1.6, null, 2016, "Южная Корея", "механика", "седан", "E111MN(**", 5, false, 188);
        car5.setSummerTires(5);
        Bus bus1 = new Bus("Volvo", "9500", 2010, "Sweden", "white", 120);
        Bus bus2 = new Bus("Mercedes-Benz", "Citaro", 2015, "Germany", "yellow", 110);
        Bus bus3 = new Bus("MAN", "Lion's City", 2012, "Germany", "red", 105);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println("____________________________________________");
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
    }


    }


