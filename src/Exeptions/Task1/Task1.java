package Exeptions.Task1;
import java.util.Scanner;
public class Task1 {
    public static int sumCalculation(int a, int b) throws Exception {
        if (a < 0 || b < 0){
          throw new Exception("Hren");
        }
        return a + b;
    }
    public static void testsumCalculation() throws Exception {  // Если результат метода не равен ожидаемому значению
        if (3 != (sumCalculation(1, 2))) {
        throw new AssertionError("Метод работает неверно!");  // Выбрасываем исключение и завершаем выполнение теста
        }
        if (5 != (sumCalculation(3, 2))) {
            throw new AssertionError("Метод работает неверно!");  // Выбрасываем исключение и завершаем выполнение теста
        }
        if (4 != (sumCalculation(2, 2))) {
            throw new AssertionError("Метод работает неверно!");  // Выбрасываем исключение и завершаем выполнение теста
        }
        if (4 != (sumCalculation(-2, 2))) {
            throw new AssertionError("Метод работает неверно!");  // Выбрасываем исключение и завершаем выполнение теста
        }
    }
    public static void main(String[] args) throws Exception {
        testsumCalculation();
    }
}
