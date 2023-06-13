package Cycles;

public class Task17 {
    public static void main(String[] args) {
        int yearComet = 79;
        int first = 1850;
        int last = 2100;
        while (yearComet < last) {
            yearComet = yearComet + 79;
            if (yearComet >= first && yearComet <= last) {
                System.out.println(yearComet);
            }
        }
    }
}

