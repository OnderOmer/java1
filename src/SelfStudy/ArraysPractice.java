package SelfStudy;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        /*
    1. write a program that can find the maximum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
    2. write a program that can find the minimum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
 */


        int [] arr={1,2,8,99 };
        int [][] multi ={ arr  };

        int [][][] matrix ={multi }  ;
        //
        int matrixNum = matrix[0][0][3];
        System.out.println(matrixNum);


        int [] arr1={1,2,8,99,2,5,77,896,1,-1 };
        Arrays.sort(arr1);
        System.out.println(arr1[1]);



        System.out.println("===================================================================");

        char[] ch = {'Z', 'D', 'W', 'Y', 'A', 'B', 'E' , 'D' };
        Arrays.sort(ch);

        System.out.println( Arrays.toString(ch) );


        String[] names = {"Deniz", "Osman", "Rustem",  "Anna", "Ali", "Adil"};
        Arrays.sort(names);
        System.out.println( Arrays.toString(names) );

        System.out.println("=======================================================");

        // sort the given array in descending order

        int[] arr3 = {3,1,4,-1,100, -100, 200, 155};
        Arrays.sort(arr3); // ascending

        int[] arrDesc = new int[arr3.length];

        arrDesc[0]=arr3[arr3.length-1];

        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arrDesc));

        int j = 0;

        for(int i = arr3.length -1;  i >= 0; i--){

            // System.out.print( arr[i] +" ");
            arrDesc[j]  = arr3[i];
            //      0          7
            //      1          6
            //      2          5

            j++;
        }


        System.out.println(Arrays.toString(arrDesc));


        int[] arrDesc2 = new int[arr3.length];

        int a =  arr3.length-1; //  7   arr3'un en sonda ki index numarasi

        for(int i = 0;  i < arr3.length ; i++){

            arrDesc2[i ] = arr3[a];
            a--;
        }

        System.out.println(Arrays.toString(arrDesc2));


        System.out.println("==============================================================");


        String[] Muhtar = {"Muhtar" ,"leave", "me", "alone", "in", "my", "dreams"};
        Arrays.sort(Muhtar);
        System.out.println(Arrays.toString(Muhtar));


        System.out.println("========================================");




    }

}

