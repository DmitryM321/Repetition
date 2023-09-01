package LeetcodeAndOtherTasks.RandomTasks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task16 {
    public static void main(String[] args) {
        int[] nums1 = new int[] {4,9,5};
        int[] nums2 = new int[] {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));

    }


    public static int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> first = new HashSet<>( );
    Set<Integer> second = new HashSet<>( );
        for (Integer f : nums1) {
            first.add(f);
        }
        for (Integer s : nums2) {
            second.add(s);
        }
    
    Set<Integer> interPrinter = new HashSet<>(first);
    interPrinter.retainAll(second);
      int [] reutov = interPrinter.stream().mapToInt(n->n).toArray();
        return reutov;
    }
}