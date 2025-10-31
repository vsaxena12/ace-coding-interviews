package org.dsa.arrays;

public class SecondLargest {
    public static int findSecondMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int element: arr) {
            if(element > max) {
                secondMax = max;
                max = element;
            } else if(element < max && element > secondMax) {
                secondMax = element;
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int element = findSecondMaximum(new int[]{1, 2});
        System.out.print("Second Largest "+element);
    }
}
