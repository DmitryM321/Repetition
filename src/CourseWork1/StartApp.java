package CourseWork1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StartApp {
    public static void allEmployee(Employee[] employee){
        for (Employee emp : employee) {
            System.out.println(emp);
        }
    }
    public static void sumSalary(Employee[] employee) {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = employee[i].getSalary() + sum;
        }
        System.out.println(sum);
    }
    public static void minSalary(Employee[] employee) {
        double min = Double.MAX_VALUE;
        String name = null;
        for (int i = 0; i < employee.length; i++) {
            if (min >= employee[i].getSalary()){
                min = employee[i].getSalary();
                name = employee[i].getFio();
              }
        }
        System.out.println(name);
    }

    public static void maxSalary(Employee[] employee) {
        double max = Double.MIN_VALUE;
        String name = null;
        for (int i = 0; i < employee.length; i++) {
            if (max <= employee[i].getSalary()){
                max = employee[i].getSalary();
                name = employee[i].getFio();
            }
        }
        System.out.println(name);
    }
    public static void avgSalary(Employee[] employee) {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = employee[i].getSalary() + sum;
        }
        System.out.println(sum/employee.length);
    }
    public static void allEmployees(Employee[] employee) {
        for (Employee emp : employee) {
            System.out.print(emp.getFio() + " ");
        }
    }
    public static void indexing(Employee[] employee){
        for (Employee emp : employee) {
            System.out.printf("%.2f%n", emp.getSalary() * 1.08);
        }
    }
    public static void minSalaryInDepartment(Employee[] employee, int department) {
        double min = Double.MAX_VALUE;;
        String name = null;
        for (int i = 0; i < employee.length; i++) {
            if (department == employee[i].getDepartment()) {
                        if (min >= employee[i].getSalary()){
                        min = employee[i].getSalary();
                        name = employee[i].getFio();
                        }
                }
            } System.out.println(name + " " + min);
        }
    public static void maxSalaryInDepartment(Employee[] employee, int department) {
        double min = Double.MIN_VALUE;;
        String name = null;
        for (int i = 0; i < employee.length; i++) {
            if (department == employee[i].getDepartment()) {
                if (min <= employee[i].getSalary()){
                    min = employee[i].getSalary();
                    name = employee[i].getFio();
                }
            }
        } System.out.println(name + " " + min);
    }
    public static void sumSalaryInDepartment(Employee[] employee, int department) {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (department == employee[i].getDepartment()) {
                sum = employee[i].getSalary() + sum;
            }
        }
        System.out.println(sum);
    }
    public static void avgSalaryInDepartment(Employee[] employee, int department) {
        double sum = 0;
        int employeeInDepartment = 0;
        for (int i = 0; i < employee.length; i++) {
            if (department == employee[i].getDepartment()) {
                sum = employee[i].getSalary() + sum;
                employeeInDepartment++;
            }
        }
        System.out.println(sum/employeeInDepartment);
    }
    public static void indexSalaryInDepartment(Employee[] employee, int department, int index) {
        double salary = 0;
        int employeeInDepartment = 0;
        for (int i = 0; i < employee.length; i++) {
            if (department == employee[i].getDepartment()) {
                salary = (employee[i].getSalary() * index / 100) + employee[i].getSalary();
                System.out.println(employee[i].getFio() + " " + salary );
            }
        }
    }
    public static void printAllInDepartment(Employee[] employee, int department) {
        for (Employee value : employee) {
            if (department == value.getDepartment()) {
                System.out.println(value.getFio() + " salary: " + value.getSalary() + " id " + value.getId());
            }
        }
    }
    public static void allEmployeeLessSalary(Employee[] employee, int salary) {
        for (Employee value : employee) {
            if (salary >= value.getSalary()) {
                System.out.println(value.getFio() + " salary: " + value.getSalary() + " id " + value.getId());
            }
        }
    }
    public static void main(String[] args) {
        Employee[] employee = new Employee[]{new Employee("Сидр Лютый Прелютый", 1, 55000),
                new Employee("Яшка-цыган", 2, 35000),
                new Employee("Данька Щусь", 3, 65000),
                new Employee("Ксанка Щусь", 4, 50000),
                new Employee("Валерка Мещеряков", 1, 75000),
                new Employee("Гнат Бурнаш", 5, 105000),
                new Employee("Буба Касторский", 3, 155000),
                new Employee("Белокурая Жози", 2, 44000),
                new Employee("Илюха Верехов", 3, 15000),
                new Employee("Семён Кандыба", 5, 25000)};
        allEmployee(employee);
        System.out.println("Общая зарплата в месяц:");
        sumSalary(employee);
        System.out.println("Сотрудник с минимальной зарплатой:");
        minSalary(employee);
        System.out.println("Сотрудник с максимальной зарплатой:");
        maxSalary(employee);
        System.out.println("Средняя зарплата в месяц:");
        avgSalary(employee);
        System.out.println("Получить Ф.И.О. всех сотрудников:");
        allEmployees(employee);
        System.out.println("Проиндексировать зарплату:");
        indexing(employee);
        System.out.println("Сотрудник отдела с минимальной зарплатой:");
        minSalaryInDepartment(employee, 3);
        System.out.println("Сотрудник отдела с максимальной зарплатой:");
        maxSalaryInDepartment(employee, 2);
        System.out.println("Сумма затрат на зарплату по отделу:");
        sumSalaryInDepartment(employee, 3);
        System.out.println("Средняя зарплата по отделу:");
        avgSalaryInDepartment(employee, 2);
        System.out.println("Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра:");
        indexSalaryInDepartment(employee,3, 5);
        System.out.println("Напечатать всех сотрудников отдела (все данные, кроме отдела):");
        printAllInDepartment(employee, 3);
        System.out.println("Напечатать всех сотрудников с зарплатой меньше числа:");
        allEmployeeLessSalary(employee, 70000);

    }
}

