package org.dsa.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class RemoveEvenIntegers {

    private static int counter;
    private static void isOdd(int val) {
        if(val%2 != 0){
            counter++;
        }
    }

    public static int[] removeEven(int[] arr) {

        for(int n: arr) {
            isOdd(n);
        }

        int[] result = new int[counter];
        // Replace this placeholder return statement with your code
        int i=0;
        for(int n: arr) {
            if(n%2 != 0)
                result[i++] = n;
        }
        counter = 0;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 21, 41};
        System.out.println(Arrays.toString(removeEven(arr)));

        arr = new int[]{0};
        System.out.println(Arrays.toString(removeEven(arr)));
    }
}
