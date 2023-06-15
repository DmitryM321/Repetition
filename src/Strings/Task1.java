package Strings;


public class Task1 {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        String fullName2 = "Ivanov Семён Семёнович";
        System.out.println("ФИО сотрудника — " + lastName + " " + firstName + " " + middleName);
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName2.replace("ё", "е"));
    }
}
