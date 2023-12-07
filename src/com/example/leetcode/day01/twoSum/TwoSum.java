package com.example.leetcode.day01.twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.两数求和
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int sum = 9;
        System.out.println(twoSum(nums, sum));
    }

    // 方法一（暴力枚举）
//    public int[] twoSum(int[] nums, int target) {
//        int n = nums.length;
//        for (int i = 0; i < n; ++i) {
//            for (int j = i + 1; j < n; ++j) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[0];
//    }


    // 方法二：哈希（重点）
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashTable = new HashMap<>();
        for (int i = 0; i< nums.length;i++){
            if (hashTable.containsKey(target-nums[i])) {
                return new int[]{hashTable.get(target-nums[i]), i};
            }
            hashTable.put(nums[i], i);
        }
        return new int[0];
    }
}
