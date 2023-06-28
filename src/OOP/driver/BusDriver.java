package OOP.driver;

public class BusDriver extends Driver{
    public BusDriver(String fio, int experience) {
        super(fio, experience);
    }
    @Override
    public String toString() {
        return "BusDriver{" +
                "fio='" + getFio() + '\'' +
                ", experience=" + getExperience() +
                '}';
}
}
