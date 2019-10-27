package com.alevel.home4;


import java.util.Arrays;

public class MaxLength {
    public int lengthOfLongestSubstring(String s) {
        char arr[] = s.toCharArray();
        int max = 1, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]){
                    temp = j - i;
                    if (max < temp){
                        max = temp;
                    }
                    break;
                }
            }
        }

        return max;
    }
}
