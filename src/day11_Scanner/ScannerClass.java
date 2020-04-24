package day11_Scanner;

import java.util.Scanner;

public class ScannerClass {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       //int a = 999999999;
        System.out.println("Enter a long number");
        long a =input.nextLong();

        System.out.println("You have entered:"+a);

        System.out.println(" Enter a decimal");
        float b = input.nextFloat();// float can be assigned to double

        System.out.println("You have entered:"+b);

    }
}
