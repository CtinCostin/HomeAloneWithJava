package main.java.com.georgescuconstantin.leetCodeProblems.contains_duplicate;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        System.out.println(containsDuplicate(new int[]{1, 3, 4, 2, 5, 6}));

    }

//    public static boolean containsDuplicate(int[] nums) {
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//
//        }
//        return false;
//    }

    // try another solution much faster with a list instead of the inner loop.
//    public static boolean containsDuplicate(int[] nums) {
//
//        List<Integer> duplicates = new LinkedList<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (duplicates.contains(nums[i])) {
//                return true;
//            }
//            duplicates.add(nums[i]);
//        }
//        return false;
//    }

    // try another solution much faster with a map instead of a list.
    public static boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> duplicates = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (duplicates.containsKey(nums[i])) {
                return true;
            }
            duplicates.put(nums[i], i);
        }
        return false;
    }

  //  CONCLUSION: A MAP WORKS MUCH FASTER THAN A LIST WHEN WE HAVE A LOT OF DATA.
}
