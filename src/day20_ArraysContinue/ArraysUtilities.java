package day20_ArraysContinue;

import java.util.Arrays;

public class ArraysUtilities {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        String r = Arrays.toString(arr);// Array must be converted to string before we print

        System.out.println(r);
        System.out.println(arr);//

        String names [] = {"Madina", "Fatih", "Ozgur"};
        System.out.println(Arrays.toString(names));

        double [] nums = {10,20,30,40,50};

        System.out.println( Arrays.toString( nums )  );

        System.out.println( nums[0] + 1  );

    }
}
