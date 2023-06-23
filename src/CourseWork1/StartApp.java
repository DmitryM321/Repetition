package CourseWork1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StartApp {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        System.out.println("Вывести всех сторудников:");
        employeeBook.getAllEmployees();
        System.out.println("Общая зарплата в месяц:");
        employeeBook.sumSalary();
        System.out.println("Сотрудник с минимальной зарплатой:");
        employeeBook.minSalary();
        System.out.println("Сотрудник с максимальной зарплатой:");
        employeeBook.maxSalary();
        System.out.println("Средняя зарплата в месяц:");
        employeeBook.avgSalary();
        System.out.println("Получить Ф.И.О. всех сотрудников:");
        employeeBook.allEmployees();
        System.out.println("Проиндексировать зарплату:");
        employeeBook.indexing();
        System.out.println("Сотрудник отдела с минимальной зарплатой:");
        employeeBook.minSalaryInDepartment(  3);
        System.out.println("Сотрудник отдела с максимальной зарплатой:");
        employeeBook.maxSalaryInDepartment(2);
        System.out.println("Сумма затрат на зарплату по отделу:");
        employeeBook.sumSalaryInDepartment(3);
        System.out.println("Средняя зарплата по отделу:");
        employeeBook.avgSalaryInDepartment(2);
        System.out.println("Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра:");
        employeeBook.indexSalaryInDepartment(3, 5);
        System.out.println("Напечатать всех сотрудников отдела (все данные, кроме отдела):");
        employeeBook.printAllInDepartment( 3);
        System.out.println("Напечатать всех сотрудников с зарплатой меньше числа:");
        employeeBook.allEmployeeLessSalary(70000);
        System.out.println("Добавить нового сотрудника:");
        employeeBook.addEmployee("Леопольд Кудасов", 1, 205000);
        employeeBook.getAllEmployees();
        System.out.println("Удалить сотрудника:");
    //    employeeBook.deleteEmployee("Илюха Верехов");
        employeeBook.getAllEmployees();
        System.out.println("Изменить сотрудника:");
        employeeBook.updateEmployee("Леопольд Кудасов", 230000, 5);
        employeeBook.getAllEmployees();
        employeeBook.getAllEmployeeAndDepartment();
    }}

