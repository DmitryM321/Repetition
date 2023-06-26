package OOP;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String  color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
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
        if(year <=0 ) {
            engineVolume = 2000;
        }
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
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
                '}';
    }

    public static void main(String[] args) {
            Car car1 = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
            Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
            Car car3 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
            Car car4 = new Car("Kia", "Sportage", 2.4, "красный", 2018, "Южная Корея");
            Car car5 = new Car("", "Avante", -1.6, null, 2016, "Южная Корея");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        }
}


