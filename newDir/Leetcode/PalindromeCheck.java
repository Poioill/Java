package Leetcode;

import java.util.Arrays;

public class PalindromeCheck {
    public static void main(String[] args) {

        System.out.println(isPalindrome(10));
    }
    public static boolean isPalindrome(int x){
        int count = 0, x2 = x;
        if (x2 < 0) return false;
        while (x > 0){
            x /= 10;
            count++;
        }
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++){
            arr[i] = x2 % 10;
            x2 /= 10;
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != arr[arr.length - i - 1]) return false;
        }
        System.out.println(Arrays.toString(arr));
        return true;
    }
}
