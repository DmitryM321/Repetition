package LeetcodeAndOtherTasks;

import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer {
    public static void main(String[] args) {
        String s = "LVIII";
        int result = romanToInt(s);
        System.out.println(result);
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && romanValues.get(s.charAt(i)) < romanValues.get(s.charAt(i+1))) {
                total -= romanValues.get(s.charAt(i));
            }
            else {
                total += romanValues.get(s.charAt(i));
            }
        }
        return total;
    }
}


