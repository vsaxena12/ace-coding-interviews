package org.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArrays {
    public static ArrayList<Integer> mergeArrays(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int i=0;
        int j=0;
        while(i<nums1.size() && j<nums2.size()){
            if(nums1.get(i)>nums2.get(j)) {
                nums1.add(i, nums2.get(j));
                j++;
            }
            i++;
        }
        if(j<nums2.size()) {
            nums1.addAll(nums2.subList(j, nums2.size()));
        }
        return nums1;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> nums1 = new ArrayList<>();
        nums1.add(new ArrayList<>(Arrays.asList(23, 33, 35, 41, 44, 47, 56, 91, 105)));
        nums1.add(new ArrayList<>(Arrays.asList(1, 2)));
        nums1.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        nums1.add(new ArrayList<>(List.of(6)));
        nums1.add(new ArrayList<>(Arrays.asList(12, 34, 45, 56, 67, 78, 89, 99)));

        ArrayList<ArrayList<Integer>> nums2 = new ArrayList<>();
        nums2.add(new ArrayList<>(Arrays.asList(32, 49, 50, 51, 61, 99)));
        nums2.add(new ArrayList<>(List.of(7)));
        nums2.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        nums2.add(new ArrayList<>(Arrays.asList(-99, -45)));
        nums2.add(new ArrayList<>(List.of(100)));

        for (int i = 0; i < nums1.size(); i++) {
            System.out.println((i + 1) + ".\tFirst array: " + nums1.get(i));
            System.out.println("\tSecond array: " + nums2.get(i));

            ArrayList<Integer> mergedArray = mergeArrays(new ArrayList<>(nums1.get(i)), new ArrayList<>(nums2.get(i)));
            System.out.println("\tMerged array: " + mergedArray);
            System.out.println(new String(new char[100]).replace("\0", "-"));
        }
    }
}
