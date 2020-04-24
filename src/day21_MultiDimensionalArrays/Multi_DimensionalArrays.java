package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class Multi_DimensionalArrays {
    public static void main(String[] args) {

        int[] arr = {1,2,3};

        int [][] arr2d = { {1,2,3}, {4,5,6} };
                   //        0     , 1

        System.out.println(arr2d.length);

        int[] arr1D = arr2d[1]; // {1,2,3};

        System.out.println(Arrays.toString(arr1D));

        int num1 = arr2d[1] [3];
        System.out.println(num1);

        char [][] ch2d = { {'A', 'B' }, {'D', 'E', 'F'} };
    }
}
