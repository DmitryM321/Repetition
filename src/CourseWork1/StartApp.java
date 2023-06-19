package CourseWork1;

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
        double min = 111111110;
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
        double max = 0;
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
    }
}

