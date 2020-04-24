package SelfStudy;


import java.util.Scanner;

public class Triangle1 {

    public static void main(String[] args) {

        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         */


     int z = 1;
     while (z<=7){

         int i = 1;
         while (i <=z){
             System.out.print("* ");
             i++;
         }
         System.out.println();

         z++;

     }
        System.out.println("======================================================");


      int apples = 1;
      while (apples<=10){

          System.out.println("Eating an apple" +apples);
          apples++;
      }
        System.out.print("No More Apples:(");


        System.out.println("================================================");

        int number , count;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number:");
        number = keyboard.nextInt();

        count = 1;
        while(count <= number){

            System.out.print(count+ ", ");
            count+=1;
        }

        System.out.println("====================================================");

        Scanner keyboard1 = new Scanner(System.in);

        int total = 0;
        System.out.println("Enter a positive integer");
        int nextNum = keyboard1.nextInt();
        while(nextNum > 0){

            total = total + nextNum;
            nextNum = keyboard1.nextInt();


        }
        System.out.println("Sum of all numbers:"+total);

        System.out.println("=================================================");

        int num1 = 0;
        System.out.println("Enter a negative integer");
        int num2 = keyboard.nextInt();
        while(num2 > 0){

            total = total +num2;
            num2 = keyboard.nextInt();


        }

        System.out.println("Sum of all numbers:" +total);

    }
}
