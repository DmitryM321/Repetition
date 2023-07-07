package OOP.driver;

import java.util.Objects;

public class Driver {
    private String fio;
    private int experience;

    public Driver(String fio, int experience) {
        this.fio = fio;
        this.experience = experience;
    }
    public void startUp(){
        System.out.println("начать движение");
    }
    public void stop(){
        System.out.println("остановиться");
    }
    public void fillUp(){
        System.out.println("заправить авто");
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fio='" + fio + '\'' +
                ", experience=" + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return experience == driver.experience && Objects.equals(fio, driver.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, experience);
    }
}
