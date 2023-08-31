package LeetcodeAndOtherTasks;

import java.util.Arrays;

public class LengthofLastWord {
// Given a string s consisting of words and spaces, return the length of the last word in the string.
public static void main(String[] args) {
    String s = "luffy is still joyboy";
    System.out.println(lengthOfLastWord(s));
}


// public static int lengthOfLastWord(String s) {
//     int length = 0;
//     for (int i = s.length() - 1; i >= 0; i--) {
//         if (s.charAt(i) == ' ') {
//             if (length > 0) {
//                 return length;
//             }
//         } else {
//             length++;
//         }
//     }
//     return length;
// }


public static int lengthOfLastWord(String s) {
    String[] words = s.split(" ");
int count = Arrays.stream(words)
.mapToInt(word -> word.length())
.reduce((a, b) -> b)
.orElse(0);

return count;

}
 

    
}
