package CourseWork1;

public class StartApp {
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
                new Employee("Семён Кандыба", 5, 25000)
        };
        for (Employee emp : employee) {
            System.out.println(emp);
        }
    }
}

