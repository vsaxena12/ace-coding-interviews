package org.dsa.arrays;

import java.util.Arrays;
import java.util.List;

public class ProductOfArrayExceptSelf {

    public static int[] findProduct(int[] arr) {
        int[] product = new int[arr.length];
        int left = 1;

        for (int i = 0; i < arr.length; i++) {
            int currentProduct = 1;

            // Compute the product of values to the right of the current index
            for (int j = i + 1; j < arr.length; j++) {
                currentProduct *= arr[j];
            }

            // Push the product of current element and product of all left elements to product
            product[i] = currentProduct * left;

            // Update 'left' by multiplying with the current element
            left *= arr[i];
        }

        return product;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,4,0,6};
        System.out.println(Arrays.toString(findProduct(arr1)));

        int[] arr3 = {1,2,3,4};
        System.out.println(Arrays.toString(findProduct(arr3)));

    }
}
