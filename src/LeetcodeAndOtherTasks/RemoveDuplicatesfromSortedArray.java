package LeetcodeAndOtherTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;
  
public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
// Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
     int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        TreeSet<Integer> uniqueSet = new TreeSet<>();
        for (int num : nums) {
            uniqueSet.add(num);
        }
        int[] output = new int[uniqueSet.size()];
        int index = 0;

        for (int num : uniqueSet) {
            output[index++] = num;
        }
        System.out.println(output.length + " nums = " + Arrays.toString(output));
    }

}
    
       
       

