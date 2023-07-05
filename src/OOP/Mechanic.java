package OOP;

import OOP.driver.Driver;
import OOP.transport.Transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mechanic <T extends Transport> {
    private String fio;
    private String nameCompany;
    private List<T> transportList;

    public Mechanic(String fio, String nameCompany) {
        this.fio = fio;
        this.nameCompany = nameCompany;
        this.transportList = new ArrayList<>();
    }

    public void performMaintenance(T transport) {
        if (!transportList.contains(transport)) {
            System.out.println("Транспорт не добавлен. Сначала добавьте транспорт через метод addTransport.");
            return;
        }
        System.out.println("Mechanic " + fio + " проводит техобслуживание " + transport.getBrand() + " " + transport.getModel());
    }

    public void repair(T transport) {
            if (!transportList.contains(transport)) {
                System.out.println("Транспорт не добавлен. Сначала добавьте транспорт через метод addTransport.");
                return;
            }
        System.out.println("Mechanic " + fio + " чинит " + transport.getBrand() + " " + transport.getModel());
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public List<T> getTransportList() {
        return transportList;
    }

    public void addTransport(T transport) {
        transportList.add(transport);
    }

    public void removeTransport(T transport) {
        transportList.remove(transport);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(fio, mechanic.fio) && Objects.equals(nameCompany, mechanic.nameCompany) && Objects.equals(transportList, mechanic.transportList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, nameCompany, transportList);
    }
    @Override
    public String toString() {
        return "Mechanic{" +
                "fio='" + fio + '\'' +
                ", nameCompany='" + nameCompany + '\'' +
                '}';
    }
}

