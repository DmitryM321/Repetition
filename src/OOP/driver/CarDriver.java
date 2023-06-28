package OOP.driver;

public class CarDriver extends Driver {
    public CarDriver(String fio, int experience) {
        super(fio, experience);
    }

    @Override
    public String toString() {
        return "CarDriver{" +
                "fio='" + getFio() + '\'' +
                ", experience=" + getExperience() +
                '}';
    }
}
