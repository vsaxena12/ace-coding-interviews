package org.dsa.arrays;

public class MaximumSubarray {

    public static int findMaxSumSubArray(int[] nums) {
        int current = nums[0];
        int global = nums[0];

        for(int i=1; i<nums.length; i++) {
            if(current < 0) {
                current = nums[i];
            } else {
                current = current + nums[i];
            }
            global = Integer.max(current, global);
        }
        return global;
    }

    public static void main(String[] args) {
        int[] arr = {-1,10,8};
        System.out.println("Max Sub array: "+findMaxSumSubArray(arr));
    }
}
