package LeetcodeAndOtherTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
int [] nums = {0,1,2,2,3,0,4,2};
int val = 2;
 
System.out.println(removeElement(nums, val));
    }
    public static int removeElement(int[] nums, int val) {  
       List<Integer> numbers = new LinkedList<Integer>(); 
        for (int i = 0; i < nums.length; i++) {    
           
        if(nums[i] != val){
          numbers.add(nums[i]);
        } 
         
       }
        System.out.println(numbers);
        return numbers.size();
    }

}
