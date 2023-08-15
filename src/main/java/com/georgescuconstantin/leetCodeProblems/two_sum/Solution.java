package main.java.com.georgescuconstantin.leetCodeProblems.two_sum;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] numbers = new int[]{5, 2, 4, 7, 1};
        System.out.println(Arrays.toString(twoSumWithAMap(numbers, 6)));
    }

//    private static int[] twoSum(int[] nums, int target) {
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return nums;
//    }

    // a faster solution with a map
//    private static int[] twoSumWithAMap(int[] nums, int target) {
//
//        Map<Integer, Integer> complements = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            Integer complementIndex = complements.get(nums[i]);
//            if (complementIndex != null) {
//                return new int[]{i, complementIndex};
//            }
//            complements.put(target - nums[i], i);
//        }
//        return nums;
//    }

    private static int[] twoSumWithAMap(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return nums;
    }
}
/**
 * {5, 2, 4, 7, 1}
 * 6
 *
 * HashMap
 * K -> V
 * 5 -> 0
 * 2 -> 1
 * {2, 1}
 *
 */

/**
 * {5, 2, 4, 7, 1}
 * 6
 *
 * HashMap
 * K -> V
 * 1 -> 0
 * 4 -> 1
 * {2, 1}
 */
