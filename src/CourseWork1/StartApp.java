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


    }
}

//        EmployeeBook
//        employee.allEmployee();
//
//        employee.allEmployee();
//        System.out.println("Общая зарплата в месяц:");
//        employee.sumSalary();
//        System.out.println("Сотрудник с минимальной зарплатой:");
//        minSalary(employee);
//        System.out.println("Сотрудник с максимальной зарплатой:");
//        maxSalary(employee);
//        System.out.println("Средняя зарплата в месяц:");
//        avgSalary(employee);
//        System.out.println("Получить Ф.И.О. всех сотрудников:");
//        allEmployees(employee);
//        System.out.println("Проиндексировать зарплату:");
//        indexing(employee);
//        System.out.println("Сотрудник отдела с минимальной зарплатой:");
//        minSalaryInDepartment(employee, 3);
//        System.out.println("Сотрудник отдела с максимальной зарплатой:");
//        maxSalaryInDepartment(employee, 2);
//        System.out.println("Сумма затрат на зарплату по отделу:");
//        sumSalaryInDepartment(employee, 3);
//        System.out.println("Средняя зарплата по отделу:");
//        avgSalaryInDepartment(employee, 2);
//        System.out.println("Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра:");
//        indexSalaryInDepartment(employee,3, 5);
//        System.out.println("Напечатать всех сотрудников отдела (все данные, кроме отдела):");
//        printAllInDepartment(employee, 3);
//        System.out.println("Напечатать всех сотрудников с зарплатой меньше числа:");
//        allEmployeeLessSalary(employee, 70000);


