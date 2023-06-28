package OOP;

public interface Competing {
    public default void pitStop(){
        System.out.println("Пора на питстоп ");
    }
    public default void bestLapTime(){
        System.out.println("Лучшее время круга = ");
    }
    public default void maximumSpeed(){
        System.out.println("Максимальная скорость = ");
    }
}
