package CourseWork1;

public class Employee {
    private String fio;
    private int department;
    private double salary;
    private static int count;
    private int id;


    public Employee(String fio, int department, double salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = count++;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFio() {
        return fio;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}

