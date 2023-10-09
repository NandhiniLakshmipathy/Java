package questions;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {3,4,5};
        int [] arr3 = new int[arr1.length+arr2.length];

        for(int i = 0; i<arr1.length; i++)
        {
            arr3[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr3));

 }
}
