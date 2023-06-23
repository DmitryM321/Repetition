package CourseWork1;

import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employee;

    public EmployeeBook() {
        employee = new Employee[]{
                new Employee("Сидр Лютый Прелютый", 1, 55000),
                new Employee("Яшка-цыган", 2, 35000),
                new Employee("Данька Щусь", 3, 65000),
                new Employee("Ксанка Щусь", 4, 50000),
                new Employee("Валерка Мещеряков", 1, 75000),
                new Employee("Гнат Бурнаш", 5, 105000),
                new Employee("Буба Касторский", 3, 155000),
                new Employee("Белокурая Жози", 2, 44000),
                new Employee("Илюха Верехов", 3, 15000),
                new Employee("Семён Кандыба", 5, 25000)};
    }

    public void getAllEmployees() {
        for (Employee emp : employee) {
            System.out.println(emp);
        }
    }

    public void sumSalary() {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = employee[i].getSalary() + sum;
        }
        System.out.println(sum);
    }

    public void minSalary() {
        double min = Double.MAX_VALUE;
        String name = null;
        for (int i = 0; i < employee.length; i++) {
            if (min >= employee[i].getSalary()) {
                min = employee[i].getSalary();
                name = employee[i].getFio();
            }
        }
        System.out.println(name);
    }

    public void maxSalary() {
        double max = Double.MIN_VALUE;
        String name = null;
        for (int i = 0; i < employee.length; i++) {
            if (max <= employee[i].getSalary()) {
                max = employee[i].getSalary();
                name = employee[i].getFio();
            }
        }
        System.out.println(name);
    }

    public void avgSalary() {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = employee[i].getSalary() + sum;
        }
        System.out.println(sum / employee.length);
    }

    public void allEmployees() {
        for (Employee emp : employee) {
            System.out.print(emp.getFio() + " ");
        }
    }

    public void indexing() {
        for (Employee emp : employee) {
            System.out.printf("%.2f%n", emp.getSalary() * 1.08);
        }
    }

    public void minSalaryInDepartment(int department) {
        double min = Double.MAX_VALUE;
        ;
        String name = null;
        for (int i = 0; i < employee.length; i++) {
            if (department == employee[i].getDepartment()) {
                if (min >= employee[i].getSalary()) {
                    min = employee[i].getSalary();
                    name = employee[i].getFio();
                }
            }
        }
        System.out.println(name + " " + min);
    }

    public void maxSalaryInDepartment(int department) {
        double min = Double.MIN_VALUE;
        ;
        String name = null;
        for (int i = 0; i < employee.length; i++) {
            if (department == employee[i].getDepartment()) {
                if (min <= employee[i].getSalary()) {
                    min = employee[i].getSalary();
                    name = employee[i].getFio();
                }
            }
        }
        System.out.println(name + " " + min);
    }

    public void sumSalaryInDepartment(int department) {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (department == employee[i].getDepartment()) {
                sum = employee[i].getSalary() + sum;
            }
        }
        System.out.println(sum);
    }

    public void avgSalaryInDepartment(int department) {
        double sum = 0;
        int employeeInDepartment = 0;
        for (int i = 0; i < employee.length; i++) {
            if (department == employee[i].getDepartment()) {
                sum = employee[i].getSalary() + sum;
                employeeInDepartment++;
            }
        }
        System.out.println(sum / employeeInDepartment);
    }

    public void indexSalaryInDepartment(int department, int index) {
        double salary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (department == employee[i].getDepartment()) {
                salary = (employee[i].getSalary() * index / 100) + employee[i].getSalary();
                System.out.println(employee[i].getFio() + " " + salary);
            }
        }
    }

    public void printAllInDepartment(int department) {
        for (Employee value : employee) {
            if (department == value.getDepartment()) {
                System.out.println(value.getFio() + " salary: " + value.getSalary() + " id " + value.getId());
            }
        }
    }

    public void allEmployeeLessSalary(int salary) {
        for (Employee value : employee) {
            if (salary >= value.getSalary()) {
                System.out.println(value.getFio() + " salary: " + value.getSalary() + " id " + value.getId());
            }
        }
    }

    public void addEmployee(String fio, int department, double salary) {
        Employee newEmployee = new Employee(fio, department, salary);
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                employee[i] = newEmployee;
            }
        }
        Employee[] newEmployeeArray = new Employee[employee.length + 1];
        for (int i = 0; i < employee.length; i++) {
            newEmployeeArray[i] = employee[i];
        }
        newEmployeeArray[employee.length] = newEmployee;
        employee = newEmployeeArray;
    }

    public void deleteEmployee(String fio) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getFio().equals(fio)) {
                employee[i] = null;
            }
        }
    }
    public void updateEmployee(String fio, int newSalary, int newDepartment) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getFio().equals(fio)) {
                employee[i].setSalary(newSalary) ;
                employee[i].setDepartment(newDepartment);
            }
        }
    }
    public void getAllEmployeeAndDepartment() {
        int departmentUn = 0;
        for (int i = 0; i < employee.length; i++) {
            for (int j = 0; j < employee.length - i - 1; j++) {
                if (employee[j].getDepartment() > employee[j+1].getDepartment()) {
                    Employee temp = employee[j];
                    employee[j] = employee[j+1];
                    employee[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() != departmentUn) {
                departmentUn = employee[i].getDepartment();
                System.out.println("Отдел " + departmentUn + ":");
            }
            System.out.println(employee[i].getFio());
        }
    }
 }



