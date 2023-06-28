package OOP.driver;

public class TruckDriver extends Driver {
    public TruckDriver(String fio, int experience) {
        super(fio, experience);
    }

    @Override
    public String toString() {
        return "TruckDriver{" +
                "fio='" + getFio() + '\'' +
                ", experience=" + getExperience() +
                '}';
    }
}