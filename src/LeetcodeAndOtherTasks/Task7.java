package LeetcodeAndOtherTasks;

public class Task7 {
    public static void main(String[] args) {
        // Подсчет количества символов в строке 
            String input = "Hello, World!";
            int count = countCharacters(input);
            System.out.println("Number of characters (excluding spaces): " + count);
        // Напишите программу, которая заменяет все вхождения заданного символа в строку на другой символ.
        String input2 = "Hello, World!";
        char target = 'o';
        char replacement = '*';
        String result = replaceCharacters(input2, target, replacement);
        System.out.println("Updated String: " + result);
// Разделение строки на слова Напишите программу на Java, которая разделяет заданную строку на отдельные слова.
String input3 = "Hello, World! Welcome to Java.";
        String[] words = splitString(input3);
        System.out.println("Words in the String:");
        for (String word : words) {
            System.out.println(word);
        }


        }
    
        public static int countCharacters(String input) {
            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != ' ') {
                    count++;
                }
            }
            return count;
        }
        public static String replaceCharacters(String input, char target, char replacement) {
        String result2 = input.replace(target, replacement);
        return result2;
    }
    
}

