package OOP;

public class Transport {
    private  String brand;
    private  String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        if (country == null || country.isEmpty()) {
            country = "default";
        }
        if (color == null || color.isEmpty()) {
            color = "белый";
        }
        if (maxSpeed <= 0) {
            maxSpeed = 0;
        }
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.country = country;
            this.color = color;
            this.maxSpeed = maxSpeed;
        }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
