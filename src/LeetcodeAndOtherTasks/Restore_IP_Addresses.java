package LeetcodeAndOtherTasks;

import java.util.ArrayList;
import java.util.List;

public class  Restore_IP_Addresses {
    public static void main(String[] args) {
     String   s = "25525511135";
     System.out.println(restoreIpAddresses(s));
    }
 public static List<String> restoreIpAddresses(String s) { //возвращает список строк с действительными IP-адресами.
    List<String> validIPs = new ArrayList<>(); //пустой список `validIPs`, который будет хранить действительные IP-адреса
    restoreIPHelper(s, 4, new StringBuilder(), validIPs); // Вызываем вспомогательную функцию 
                                      //`restoreIPHelper`, передавая ей входную строку `s`, 
                                      //количество сегментов IP-адреса (изначально 4), пустой 
                                      //`StringBuilder` для хранения текущего IP-адреса и список `validIPs`.
    return validIPs;
}

private static void restoreIPHelper(String s, int numSegments, StringBuilder currentIP, List<String> validIPs) {
    if (numSegments == 0 && s.isEmpty()) {//  Если `numSegments` равно 0 и входная строка `s` пустa
        validIPs.add(currentIP.toString());// текущий IP-адрес является действительным, поэтому добавляем его
                                                // в список `validIPs
        return;
    } else if (numSegments == 0 || s.isEmpty()) { //  Если `numSegments` равно 0 или входная строка `s` 
                                    //пуста, это означает, что текущий IP-адрес не может быть действительным, 
        return; // поэтому прерываем выполнение функции с помощью `return`.
    }

    for (int i = 1; i <= Math.min(s.length(), 3); i++) { //проходит от 1 до минимума между длиной строки 
                     //`s` и числом 3 (т.к. каждый сегмент IP-адреса может содержать не более 3 символов).
        String segment = s.substring(0, i);//создаем сегмент IP-адреса `segment`, используя
               // метод `substring()`, который берет подстроку от начала строки `s` до текущего индекса `i`.
        int segmentValue = Integer.parseInt(segment); //сегмент в числовое значение с помощью метода `parseInt()`.

        if (segmentValue > 255 || (segment.length() > 1 && segment.startsWith("0"))) {//Если значение 
                      //сегмента больше 255 или длина сегмента больше 1 и он начинается с "0", мы пропускаем
            continue; // текущую итерацию цикла с помощью `continue`
        }

        StringBuilder newIP = new StringBuilder(currentIP); //newIP`, который копирует текущий IP-адрес `currentIP`.
         if (newIP.length() > 0) { // `newIP` не пустой, 
            newIP.append("."); // добавляем в него разделительную точку.
        }
        newIP.append(segment);// Добавляем текущий сегмент к `newIP`.

        restoreIPHelper(s.substring(i), numSegments - 1, newIP, validIPs); // Рекурсивно вызываем 
                    //`restoreIPHelper`, передавая оставшуюся часть строки `s` (после текущего сегмента), 
                    // уменьшая количество оставшихся сегментов на 1 и передавая `newIP` и `validIPs` как 
                    // аргументы.
    // Рекурсия выполняется до тех пор, пока не будут использованы все сегменты IP-адреса или входная 
    //строка `s` не будет полностью использована.                
    }
}
}