package SelfStudy;

import java.util.Arrays;
import java.util.Scanner;

/*

1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to print out all the even numbers.
                MUst use continue statement
    Task02:
        1. Write a program that will take five Strings and save them into an array called arr.
        2. use for each loop to print out the first three letter of each element of arr,
         one per line. You can assume that every element of arr is at least 3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban
 */
public class WarmUp {

    public static void main(String[] args) {
// task 1
        int arr[] = new int[100];
        for(int i =0; i<arr.length; i++ ) {
            arr[i] = i + 1;
            if (arr[i] % 2 != 0) {
             continue;
            }
            System.out.print(arr[i] + " ");
            }
        // task 2
        System.out.println("=======================================");


        Scanner scan = new Scanner(System.in);
        String [] strArr= new String[5];

      for (int num =0;num<strArr.length;num++){

            System.out.println("Please enter a word");
                strArr[num] = scan.nextLine();

        }
        for (String  each:  strArr) {
            System.out.println(each.substring(0,3));
        }

        System.out.println("=================================================");


    }
}

class OzgurBey {
    public static void main(String[] args) {


        /*
        1.  write a program that can check if two Strings are build out of same
		Ex:
			if str1 = "aabbc";  str2 ="cab";
			output: true

			if str1 ="abcd";  str2 ="abc";
			output: false

			Hint: you will need array and Arrays' methods

         */


        Scanner ozgurBey = new Scanner(System.in);

        String str1 = ozgurBey.next();
        String str2= ozgurBey.next();

            String result="";
          for (int i=0; i<str2.length(); i++){

              for(int a =0; a<str1.length(); a++){
               if(str2.charAt(i)==str1.charAt(a)){
                   result += ""+str2.charAt(i);
               }
              }
          }

        System.out.println(result.equals(str2));

    }



        }