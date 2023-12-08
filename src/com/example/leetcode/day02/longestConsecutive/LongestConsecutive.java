package com.example.leetcode.day02.longestConsecutive;

import java.util.HashSet;
import java.util.Set;

/**
 * 128.最长连续序列
 */
public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums = new int[]{0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num - 1)){
                int currentNum = num;
                int currentStreak = 1;

                while(num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }

        }

        return longestStreak;
    }
}
