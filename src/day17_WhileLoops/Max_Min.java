package day17_WhileLoops;

import java.util.Scanner;

public class Max_Min {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int MAxNumber = -999999999; // any number the user provided will be greater than this number
                                    // first user entered variable will initalized to MaxNumber
              // MAxNumber =5;

         int MinNumber = 199999999;
         // MinNumber = 0;
         for (int i = 1; i < 5; i++) { // i 1,2,3,4,5
            System.out.println("Enter a number");
            int num = input.nextInt();//0,5,1,3,0

            if (num > MAxNumber) {
                MAxNumber = num;
            }

            if(num <MinNumber){
                MinNumber = num;
            }
        }



        System.out.println("MAxNumber Number: "+MAxNumber);// to compare each user inputs , and assign the maximum number to MAxNumber
        System.out.println("MinNumber Number:"+MinNumber);
    }

}
