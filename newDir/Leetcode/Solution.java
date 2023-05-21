package Leetcode;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[]{1, 2, 3};
        System.out.println(twoSum(numbers, 5));
    }

    public static int[] twoSum(int[] nums, int target) {
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                k++;
                System.out.println(k + "    " + (nums[i] + nums[j]) + "   i = " + i + " j = " + j);
                if (nums[i] + nums[j] == target) {
                    System.out.println(i + "   f " + j);
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}