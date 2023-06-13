package Cycles;

public class Task12 {
    public static void main(String[] args) {
        int birth = 17;
        int death = 8;
        int population = 12000000;
        int year = 0;
        while (year < 10 ){
            population = population*(birth - death)/1000 + population;
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }
}

