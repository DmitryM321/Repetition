import java.lang.reflect.Array;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
   
       int[] a1 = new int[]{1,5,7, 8, 44};
       int[] a2 = new int[]{2,5,6, 55};
       int[] mergedArray = mergeArrays(a1, a2);
   
   System.out.println(Arrays.toString(mergedArray));

    }
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] mergedArray = new int[a1.length + a2.length];
        int i = 0, j = 0, k =0;
        while(i < a1.length && j < a2.length) { // цикл, который будет выполняться до тех пор, пока не будет пройден весь массив `a1` или весь массив `a2`.
            if(a1[i] <= a2[j]) {
                mergedArray[k++] = a1[i++];
            } else {
                mergedArray[k++] = a2[j++];
            }       
               }
      
               
        while (i < a1.length) { // Если в первом массиве остались элементы
            mergedArray[k++] = a1[i++];
        }
    
        while (j < a2.length) { // Если во втором массиве остались элементы
            mergedArray[k++] = a2[j++];
        }
    
        return mergedArray;
    }
    
    } 
