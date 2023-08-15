package main.java.com.georgescuconstantin.leetCodeProblems.remove_duplicates_from_sorted_array;

public class Solution {

    public static void main(String[] args) {

        System.out.println(removeDuplicates(new int[]{1, 1, 2, 2, 2, 3, 3, 4, 5, 5}));

    }

    public static int removeDuplicates(int[] nums) {

        int k = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[k++] = nums[i + 1];
            }
        }
        return k;
    }


}
