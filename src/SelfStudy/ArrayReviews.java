package SelfStudy;

import java.util.Arrays;

public class ArrayReviews {
/*
 Array: store multiple data to a variable
 */

    public static void main(String[] args) {
         int num = 10;
          // decleration of array:
      //   int[] arr = {10}; // array has size of 1
        //        arr[1] = 20;
        // initializing the array's size:
        int[] arr2 = new int[2]; // [0,0] , maximum capacity of the array is 2

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
     //   System.out.println(arr2[2]);


        String[] cars = new String[5];  // this array can contain 5 string values
     // {Tesla, Audi, Totoya, Jeep, Subaru}

        cars[4]= "Subaru";
        cars [2]= "Toyota";
        cars [1]= "Audi";
        cars [3]= "Jeep";
        cars [0]= "Tesla";

        cars = new String[10];

        cars[5] = "Ford";
        for(int i = 0; i <= cars.length-1; i++){
    System.out.print(cars[i]+" ");

        }
        System.out.println();

        boolean[] bool = { true , false , 10 ==10};
        boolean b1 = bool[1];
        System.out.println(b1);

        //Arrays.toString(arrayVariable); converts array to String , and returns str

        System.out.println(bool);// hashcode
        String str = Arrays.toString(bool);
        System.out.println(str); // [true, false , true]

        // Arrays.sort(): sorts the array in ascending order

        double[] dArray = {1000, 900, 800, 700, 600};
        System.out.println(Arrays.toString(dArray));

        Arrays.sort(dArray);

        System.out.println(Arrays.toString(dArray));

        // print each values of the given array in descending order:
        int[] numbers = {200,300,20, 7890, 40, -9, -100};

        Arrays.sort(numbers); // sorts the array in ascending order
        System.out.println(Arrays.toString(numbers));
        String result ="";
        for(int i = numbers.length-1;i >= 0; i--){
             result += numbers[i] +",";
         }
       result =  result.trim();
        result = result.substring(0, result.lastIndexOf(","));
        System.out.println(result);

    }

}
